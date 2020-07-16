package java.lang;

/**
 * @author hsuhau
 * @date 2020/6/24 14:57
 */
public class Start {
    public static void main(String[] args) {
        /*
          java.lang.SecurityException: Prohibited package name: java.lang
          	at java.lang.ClassLoader.preDefineClass(ClassLoader.java:656)
          	at java.lang.ClassLoader.defineClass(ClassLoader.java:755)
          	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
          	at java.net.URLClassLoader.defineClass(URLClassLoader.java:468)
          	at java.net.URLClassLoader.access$100(URLClassLoader.java:74)
          	at java.net.URLClassLoader$1.run(URLClassLoader.java:369)
          	at java.net.URLClassLoader$1.run(URLClassLoader.java:363)
          	at java.security.AccessController.doPrivileged(Native Method)
          	at java.net.URLClassLoader.findClass(URLClassLoader.java:362)
          	at java.lang.ClassLoader.loadClass(ClassLoader.java:419)
          	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:352)
          	at java.lang.ClassLoader.loadClass(ClassLoader.java:352)
          	at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:495)
          Error: A JNI error has occurred, please check your installation and try again
         */
        System.out.println("hello!");
    }
}
