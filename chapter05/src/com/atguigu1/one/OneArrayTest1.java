package com.atguigu1.one;

/**
 * ClassName：OneArrayTest,
 * Package: com.atguigu1.one,
 * Desc:,
 *
 * @Create: 2024/3/10 22:48,
 * @Author: skl,
 */
public class OneArrayTest1 {
    public static void main(String[] args){
        // 5、数组元素的默认初始化

        // 整形数组元素的默认初始化值：0
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);
        // 浮点型数组元素的默认初始化值：0.0
        double[] arr2 = new double[10];
        System.out.println(arr2[0]);
        // 字符数组元素的默认初始化值：0(\u0000)
        char[] arr3 = new char[10];
        System.out.println(arr3[0]);
        // 布尔数组元素的默认初始化值：false
        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);
        // 引用数据类型数组元素的默认初始化值：null
        String[] arr5 = new String[10];
        System.out.println(arr5[0]);

    }
}
