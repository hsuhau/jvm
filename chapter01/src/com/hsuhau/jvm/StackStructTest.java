package com.hsuhau.jvm;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author hsuhau
 * @date 2020/6/23 14:59
 */
public class StackStructTest {
    public static void main(String[] args) {
        int i = 2 + 3;
        int j = 3;
        int k = i + j;

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
