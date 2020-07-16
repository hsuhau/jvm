package com.hsuhau.jvm.classloader;

import com.sun.net.ssl.internal.ssl.Provider;
import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;

/**
 * // class version 52.0 (52)
 * // access flags 0x21
 * public class com/hsuhau/jvm/classloader/ClassLoaderTest1 {
 *
 *   // compiled from: ClassLoaderTest1.java
 *
 *   // access flags 0x1
 *   public <init>()V
 *    L0
 *     LINENUMBER 13 L0
 *     ALOAD 0
 *     INVOKESPECIAL java/lang/Object.<init> ()V
 *     RETURN
 *    L1
 *     LOCALVARIABLE this Lcom/hsuhau/jvm/classloader/ClassLoaderTest1; L0 L1 0
 *     MAXSTACK = 1
 *     MAXLOCALS = 1
 *
 *   // access flags 0x9
 *   public static main([Ljava/lang/String;)V
 *    L0
 *     LINENUMBER 15 L0
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     LDC "***********\u542f\u52a8\u7c7b\u52a0\u8f7d\u5668***********"
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
 *    L1
 *     LINENUMBER 17 L1
 *     INVOKESTATIC sun/misc/Launcher.getBootstrapClassPath ()Lsun/misc/URLClassPath;
 *     INVOKEVIRTUAL sun/misc/URLClassPath.getURLs ()[Ljava/net/URL;
 *     ASTORE 1
 *    L2
 *     LINENUMBER 29 L2
 *     ALOAD 1
 *     ASTORE 2
 *     ALOAD 2
 *     ARRAYLENGTH
 *     ISTORE 3
 *     ICONST_0
 *     ISTORE 4
 *    L3
 *    FRAME FULL [[Ljava/lang/String; [Ljava/net/URL; [Ljava/net/URL; I I] []
 *     ILOAD 4
 *     ILOAD 3
 *     IF_ICMPGE L4
 *     ALOAD 2
 *     ILOAD 4
 *     AALOAD
 *     ASTORE 5
 *    L5
 *     LINENUMBER 30 L5
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     ALOAD 5
 *     INVOKEVIRTUAL java/net/URL.toExternalForm ()Ljava/lang/String;
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
 *    L6
 *     LINENUMBER 29 L6
 *     IINC 4 1
 *     GOTO L3
 *    L4
 *     LINENUMBER 35 L4
 *    FRAME CHOP 3
 *     LDC Lcom/sun/net/ssl/internal/ssl/Provider;.class
 *     INVOKEVIRTUAL java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
 *     ASTORE 2
 *    L7
 *     LINENUMBER 37 L7
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     NEW java/lang/StringBuilder
 *     DUP
 *     INVOKESPECIAL java/lang/StringBuilder.<init> ()V
 *     LDC "providerClassLoader = "
 *     INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
 *     ALOAD 2
 *     INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
 *     INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
 *    L8
 *     LINENUMBER 39 L8
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     LDC "************\u6269\u5c55\u7c7b\u52a0\u8f7d\u5668************"
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
 *    L9
 *     LINENUMBER 40 L9
 *     LDC "java.ext.dirs"
 *     INVOKESTATIC java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
 *     ASTORE 3
 *    L10
 *     LINENUMBER 46 L10
 *     ALOAD 3
 *     LDC ";"
 *     INVOKEVIRTUAL java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
 *     ASTORE 4
 *     ALOAD 4
 *     ARRAYLENGTH
 *     ISTORE 5
 *     ICONST_0
 *     ISTORE 6
 *    L11
 *    FRAME FULL [[Ljava/lang/String; [Ljava/net/URL; java/lang/ClassLoader java/lang/String [Ljava/lang/String; I I] []
 *     ILOAD 6
 *     ILOAD 5
 *     IF_ICMPGE L12
 *     ALOAD 4
 *     ILOAD 6
 *     AALOAD
 *     ASTORE 7
 *    L13
 *     LINENUMBER 47 L13
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     ALOAD 7
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
 *    L14
 *     LINENUMBER 46 L14
 *     IINC 6 1
 *     GOTO L11
 *    L12
 *     LINENUMBER 51 L12
 *    FRAME CHOP 3
 *     LDC Lsun/security/ec/CurveDB;.class
 *     INVOKEVIRTUAL java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
 *     ASTORE 4
 *    L15
 *     LINENUMBER 53 L15
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     NEW java/lang/StringBuilder
 *     DUP
 *     INVOKESPECIAL java/lang/StringBuilder.<init> ()V
 *     LDC "curveDBClassLoader = "
 *     INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
 *     ALOAD 4
 *     INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
 *     INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
 *    L16
 *     LINENUMBER 54 L16
 *     RETURN
 *    L17
 *     LOCALVARIABLE urL Ljava/net/URL; L5 L6 5
 *     LOCALVARIABLE dir Ljava/lang/String; L13 L14 7
 *     LOCALVARIABLE args [Ljava/lang/String; L0 L17 0
 *     LOCALVARIABLE urLs [Ljava/net/URL; L2 L17 1
 *     LOCALVARIABLE providerClassLoader Ljava/lang/ClassLoader; L7 L17 2
 *     LOCALVARIABLE extDirs Ljava/lang/String; L10 L17 3
 *     LOCALVARIABLE curveDBClassLoader Ljava/lang/ClassLoader; L15 L17 4
 *     MAXSTACK = 3
 *     MAXLOCALS = 8
 * }
 *
 * @author hsuhau
 * @date 2020/6/24 12:44
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("***********启动类加载器***********");
        // 获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();

        /*
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/resources.jar
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/rt.jar
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/sunrsasign.jar
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/jsse.jar
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/jce.jar
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/charsets.jar
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/jfr.jar
          file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/classes
         */
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }

        // file:/C:/Program%20Files/RedHat/java-1.8.0-openjdk-1.8.0.242-3/jre/lib/jsse.jar
        // 从上面的路径中随意选择一个类，来看看他的类加载器是什么：引导类加载器
        ClassLoader providerClassLoader = Provider.class.getClassLoader();
        // providerClassLoader = null
        System.out.println("providerClassLoader = " + providerClassLoader);

        System.out.println("************扩展类加载器************");
        String extDirs = System.getProperty("java.ext.dirs");

        /*
          C:\Program Files\RedHat\java-1.8.0-openjdk-1.8.0.242-3\jre\lib\ext
          C:\WINDOWS\Sun\Java\lib\ext
         */
        for (String dir : extDirs.split(";")) {
            System.out.println(dir);
        }

        // 从上面的路径中随意选择一个类，来看看他的类加载器是什么：扩展类加载器
        ClassLoader curveDBClassLoader = CurveDB.class.getClassLoader();
        // curveDBClassLoader = sun.misc.Launcher$ExtClassLoader@4aa298b7
        System.out.println("curveDBClassLoader = " + curveDBClassLoader);
    }
}
