/*
  位运算符：
  1. <<  >> >>> & | ^ ~
  2. 说明： 
    1、<<  >> >>> & | ^ ~：针对数值类型的变量或常量进行赋值，运算的结果也是数值。
    2、<< : 在一定范围内容，每向左移动一位，结果在原有的基础上 * 2；（对于正数负数都适用）
    3、>> : 在一定范围内容，每向右移动一位，结果在原有的基础上 / 2；（对于正数负数都适用）
    4、>>> : 无符号右移



  3. 面试题：高效的方式计算2 * 8： 2 << 3 或 8 << 1
  
*/ 
public OperationBitwise{
  public static void main(String[] args){
    int num1 = 7;

    // <<： 正数 左移
    System.out.println("num1 << 1: " + (num1 << 1));  // 14
    System.out.println("num1 << 2: " + (num1 << 2));  // 28
    System.out.println("num1 << 3: " + (num1 << 3));  // 56
    System.out.println("num1 << 28: " + (num1 << 3));  // 最大的正数
    System.out.println("num1 << 29: " + (num1 << 3));  // 成为负数了，过犹不及

    int num2 = -7;
    System.out.println("num2 << 1: " + (num2 << 1));  // 14
    System.out.println("num2 << 2: " + (num2 << 2));  // 28
    System.out.println("num2 << 3: " + (num2 << 3));  // 56


    // & | ^ ~


    // 关于位运算符： 如何交换两个变量的值？
    int m = 10;
    int n = 20;
    System.out.println("m = " + m + ',n = ' + n);
    
    // 交换两个变量的值
    // 方式1：声明一个临时变量。（推荐）
    /*
      int temp = m;
      m = n;
      n = temp;
    */ 
    
    // 方式2：声明一个临时变量。（推荐） 优点：不需要定义临时变量。 缺点：难，适用性差（不适用于非数值类型），可能超出int的范围
    m = m + n;  // 30 = 10 + 20;
    n = m - n;  // 10 = 30 - 20
    m = m - n;  // 20 = 30 - 10;

    // 方式3：（推荐） 优点：不需要定义临时变量。 缺点：难，适用性差（不适用于非数值类型）
    m = m ^ n;
    n = m ^ n;
    m = m ^ n; 

    System.out.println("m = " + m + ',n = ' + n);
  }
} 