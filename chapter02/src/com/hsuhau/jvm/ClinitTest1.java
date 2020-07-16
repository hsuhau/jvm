package com.hsuhau.jvm;

/**
 * @author hsuhau
 * @date 2020/6/23 19:52
 */
public class ClinitTest1 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;

    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
