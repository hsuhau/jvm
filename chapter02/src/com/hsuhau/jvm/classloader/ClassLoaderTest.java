package com.hsuhau.jvm.classloader;

/**
 * @author hsuhau
 * @date 2020/6/24 10:12
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // systemClassLoader = sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println("systemClassLoader = " + systemClassLoader);

        // 获取其上层：扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        // extClassLoader = sun.misc.Launcher$ExtClassLoader@42a57993
        System.out.println("extClassLoader = " + extClassLoader);

        // 获取其上层：引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        // bootstrapClassLoader = null
        System.out.println("bootstrapClassLoader = " + bootstrapClassLoader);

        // 对于用户自定义类来说：默认使用系统类加载器进行加载
        ClassLoader testClassLoader = ClassLoaderTest.class.getClassLoader();
        // testClassLoader = sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println("testClassLoader = " + testClassLoader);

        // String类是使用引导类加载器进行加载的。---》Java的核心类库都是使用引导类加载器进行加载的。
        ClassLoader stringClassLoader = String.class.getClassLoader();
        // stringClassLoader = null
        System.out.println("stringClassLoader = " + stringClassLoader);
    }
}
