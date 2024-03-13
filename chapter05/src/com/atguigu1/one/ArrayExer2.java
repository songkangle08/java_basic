package com.atguigu1.one;

import java.util.Scanner;

/*
* 案例：输出英文星期几
  用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词{"Monday" ,"Tuesday" , "Wednesday" ,"Thursday","Friday" ,"Saturday" ,"Sunday"}
* */
public class ArrayExer2 {
    public static void main(String[] args){

        // 定义包含7个单词的数组
        String[] weeks = {"Monday","Tue"};

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数组1-7：");
        int day = scan.nextInt();
        if(day<1 || day>7){
            System.out.println("你输入的有误");
        }else{
            System.out.println(weeks[day-1]);
        }
    }
}
