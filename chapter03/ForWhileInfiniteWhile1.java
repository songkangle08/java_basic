/*
  案例：从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入0时程序结束
  */ 

import java.util.Scanner;

class ForWhileInfiniteWhile1{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int zhengshu = 0;
    int fushu = 0;

    while(true){
      System.out.println("请输入一个整数（输入为0时结束程序）");
      int num = scan.nextInt(); // 获取用户输入的整数
      
      if(num > 0){
        zhengshu++;
      }else if(num < 0){
        fushu++;
      }else{
        System.out.println("程序结束");
        break;
      }
    }

    System.out.println("正数的个数为"+zhengshu);
    System.out.println("负数的个数为"+fushu);

  }
}