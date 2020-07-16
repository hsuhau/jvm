package com.hsuhau.jvm.classloader;

/**
 * 双亲委派机制<br>
 * Java虚拟机对class文件采用的是按需加载的方式，它就是说放需要使用该类时才会将它的class文件加载到内存生成class对象。<br>
 * 而且加载某个类的class文件时，Java虚拟机采用的是双亲委派机制，即把请求交由父类处理，它是一种任务委派模式。<br>
 * <p>
 * 工作原理<br>
 * 1.如果一个类加载器受到了类加载请求，它并不会自己先去加载，而是把这个请求委托给父类的加载器去执行；<br>
 * 2.如果父类加载器还存在其父类加载器，则进一步向上委托，依次递归，请求最终将到达顶层的启动类加载器；<br>
 * 3.如果父类加载器可以完成类加载任务，就成功返回，倘若父类加载器无法完成此加载任务，子加载器才会尝试自己去加载，这就是双亲委派模式。<br>
 * <p>
 * 优势：<br>
 * 避免类的重复加载<br>
 * 保护程序安全，防止核心API被随意篡改<br>
 *
 * @author hsuhau
 * @date 2020/6/24 13:42
 */
public class StringTest {
    public static void main(String[] args) {
        // 沙箱安全机制
        String str = new String();
        System.out.println("hello, hsuhau");
        System.out.println("str.getClass().getClassLoader() = " + str.getClass().getClassLoader());

        // test.getClass().getClassLoader() = sun.misc.Launcher$AppClassLoader@18b4aac2
        StringTest test = new StringTest();
        System.out.println("test.getClass().getClassLoader() = " + test.getClass().getClassLoader());
    }
}
