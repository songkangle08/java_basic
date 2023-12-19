/*
  如何从键盘获取不同类型（基本数据类型，String类型）的变量：使用Scanner类

  1、使用Scanner获取不同类型数据的步骤
  步骤1：导包 import java.util.Scanner
  步骤2：提供（或创建）一个Scanner类的实例
  步骤3：调用Scanner类中的方法，获取指定类型的变量
  步骤4：关闭资源，调用Scanner类的close

  2、案例：小明注册某交友软件，要求录入个人相关信息：如下
  请输入你的网名，你的年龄，你的体重，你是否单身，你的性别等等

  3、Scanner没有提供获取char字符的方法，使用scanner.next().charAt(0)获取成字符。


  4、equals 判断字符串是否相等
*/

// 步骤1：导包 import java.util.Scanner
import java.util.Scanner;

public ScannerTest{  
  public static void main(String[] args){ 
    
    // 步骤2：提供（或创建）一个Scanner类的实例
    Scanner scanner = new Scanner(System.in);

    // 步骤3：调用Scanner类中的方法，获取指定类型的变量
    System.out.println("欢迎光临！！！");
    System.out.print("请输入你的网名：");
    String name = scanner.next();

    System.out.print("请输入你的年龄：");
    int age = scanner.nextInt();

    System.out.print("请输入你的体重：");
    double weight = scanner.nextDouble();

    System.out.print("你是否单身，单身为true，非单身为false");
    boolean isSingle = scanner.nextDouble();

    System.out.print("请输入你的性别：（男\\女）");
    char  gender = scanner.next().charAt(0);


    System.out.println("name = " + name);
    System.out.println("name = " + name);

    scanner.close();


  }
}