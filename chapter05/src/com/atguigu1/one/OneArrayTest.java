package com.atguigu1.one;

/**
 * ClassName：OneArrayTest,
 * Package: com.atguigu1.one,
 * Desc:,
 *
 * @Create: 2024/3/10 22:48,
 * @Author: skl,
 */
public class OneArrayTest {
    public static void main(String[] args){
        // 1、数组的声明和初始化
        // 复习：变量的定义格式：数据类型 变量名 = 变量值
        int num1 = 10;

        // 1.1 声明数组
        double[] prices;
        // 1.2 数据的初始化
        // 静态初始化：数组变量的初始化与数组元素的赋值操作同时进行。
        prices = new double[]{28.32,43.22,43.21};

        String[] foods;
        foods = new String[]{"鱼香肉丝","木耳"};

        // 动态赋值：数组变量的初始化与数组元素的赋值操作分开进行。
        String[] foods1 = new String[4];

        // 其他正确的行书
        int arr[] = new int[4];
        int[] arr1 = {1,2,3,4}; // 类型推动

    }
}
