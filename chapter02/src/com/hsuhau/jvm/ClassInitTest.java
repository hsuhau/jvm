package com.hsuhau.jvm;

/**
 * @author hsuhau
 * @date 2020/6/23 19:26
 */
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);
//        System.out.println(number); // 非法前向引用
    }

    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}