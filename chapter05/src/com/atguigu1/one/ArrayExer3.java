package com.atguigu1.one;

import java.util.Scanner;

/*
* 案例：学生考试等级划分
从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
    成绩>=最高分-10
    等级为'A'
    成绩>=最高分-20
    等级为'B'
    成绩>=最高分-30
    等级为'C'
    其余
    等级为'D'
  提示:先读入学生人数，根据人数创建int数组，存放学生成绩。
* */
public class ArrayExer3 {
    public static void main(String[] args){
        // 1. 从监非输入学生的人数，根据人数，创建数组（动态初始化）
        System.out.print("请输入学生人数：");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] scores = new int[number];
        int maxScore = scores[0];

        // 2. 根据提示，依次输入学生成绩，并将成绩保存在数组元素中
        System.out.println("请输入学生成绩：");
        for (int i = 0; i < scores.length; i++) {
          scores[i] = scan.nextInt();
          if (maxScore < scores[i]) {
            maxScore = scores[i];
          }
        }

        // 3. 获取学生成绩的最大值
        System.out.println("最高分为：" + maxScore);

        // 4. 遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        String grade;
        for (int i = 0; i < scores.length; i++) {
          if (scores[i] > maxScore - 10) {
            grade = "A";
          } else if (scores[i] > maxScore - 20) {
            grade = "B";
          } else if (scores[i] > maxScore - 30) {
            grade = "C";
          } else {
            grade = "D";
          }
          System.out.println("学生" + i + 1 + "的成绩为" + scores[i] + ",等级为" + grade);
        }

        scan.close();

    }
}
