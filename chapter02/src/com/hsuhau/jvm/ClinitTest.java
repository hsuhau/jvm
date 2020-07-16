package com.hsuhau.jvm;

/**
 * @author hsuhau
 * @date 2020/6/23 19:43
 */
public class ClinitTest {

    // 任何一个类声明以后，内部至少存在一个类的构造器
    private int a = 1;
    private static int c = 3;

    public static void main(String[] args) {
        int b = 2;
    }
}
