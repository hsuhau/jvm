package com.hsuhau.jvm.classloader;

import java.io.FileNotFoundException;
import java.net.URLClassLoader;

/**
 * 自定义类加载器 (User-Defined ClassLoader)
 * <p>
 * 目的：<br>
 * 1.隔离加载类<br>
 * 2.修改类加载的方式<br>
 * 3.扩展加载源<br>
 * 4.防止源码泄露<br>
 * <p>
 * 用户自定义类加载器实现步骤：<br>
 * 1.开发人员可以通过加成抽象类{@link java.lang.ClassLoader}类的方式，实现自己的类加载器，以满足一些特殊的需求<br>
 * 2.在JDK1.2之前，在自定义类加载器时，总会去继承{@link ClassLoader}类并重写loadClass()方法，从而实现自定义的类加载类，但是在JDK1.2之后
 * 已不再建议用户去覆盖loadClass()方法，但是建议把自定义的类加载逻辑写在{@link #findClass}方法中<br>
 * 3.在编写自定义类加载器时，如果没有太过于复杂的需求，可以直接继承{@link URLClassLoader}类，这样就可以避免自己去编写{@link #findClass}
 * 方法及其获取字节码流的方式，是自定义类加载器编写更加简洁<br>
 *
 * @author hsuhau
 * @date 2020/6/24 13:09
 */
public class CustomClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result != null) {
                throw new FileNotFoundException();
            } else {
                /*
                  将代码元素移动到左侧或右侧
                  将插入符号放置在所需的代码元素处，或选择要移动的元素。
                  执行以下操作之一：
                  在主菜单上，选择命令  代码| 向左移动元素（Code | Move Element Left）或  代码| 向右移动元素（Code | Move Element Right）
                  按 Ctrl+Shift+Alt+Left 或 Ctrl+Shift+Alt+Right
                 */
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private static byte[] getClassFromCustomPath(String name) {
        // 从自定义路径中加载指定类：细节略
        // 如果指定路径的字节码文件进行了加密，则需要在此方法中进行解密操作。
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, customClassLoader);
            Object obj = clazz.newInstance();
            System.out.println("obj.getClass().getClassLoader() = " + obj.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
