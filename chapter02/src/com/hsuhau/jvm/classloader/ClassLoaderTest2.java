package com.hsuhau.jvm.classloader;


/**
 * 获取ClassLoader的途径：<br>
 * 1.获取当前类的ClassLoader<br>
 * clazz.getClassLoader()<br>
 * 2.获取当前线程上下文的ClassLoader<br>
 * Thread.currentThread().getContextClassLoader()<br>
 * 3.获取系统的ClassLoader<br>
 * ClassLoader.getSystemClassLoader()<br>
 * 4.获取调用者的ClassLoader<br>
 * DriverManager.getCallerClassLoader()<br>
 *
 * @author hsuhau
 * @date 2020/6/24 13:34
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            // 1.
            ClassLoader stringClassLoader = Class.forName("java.lang.String").getClassLoader();
            // stringClassLoader = null
            System.out.println("stringClassLoader = " + stringClassLoader);

            // 2.
            ClassLoader currentThreadContextLoader = Thread.currentThread().getContextClassLoader();
            // currentThreadContextLoader = sun.misc.Launcher$AppClassLoader@18b4aac2
            System.out.println("currentThreadContextLoader = " + currentThreadContextLoader);

            // 3.
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            // systemClassLoader = sun.misc.Launcher$AppClassLoader@18b4aac2
            System.out.println("systemClassLoader = " + systemClassLoader);

            // 4.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
