public class ArrayTest02 {
    public static void main(String[] args) {
        // 1. 数组先声明
        // 元素的类型[] 数组名
        // 例如：存储26个字母，  char[] letters
        // 例如：存储10件商品的价格，double[] price
        // 例如：存储8个同学的成绩：int[] score
        // 例如：存储8个同学的姓名：String[] name

        // int[] score = {89,96,85,76};
        int[] score;
        score = new int[]{89,96,85,76};
        System.out.println("score = " + score);   // [I@682a0b20
        /*
        * 本质上它是score数组对象的类型@hashCode值
        * 初学者可以直接看出数组对象的首地址
        * */
        System.out.println("第1个元素的值：" + score[0]);

        // 遍历数组的快捷键 数组名.fori
        for (int i = 0; i < score.length; i++) {
            System.out.println("i = " + score[i]);
        }
    }
}
