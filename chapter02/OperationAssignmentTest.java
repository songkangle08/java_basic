/*
  测试赋值运算符：

    符号： = 
    扩展运算符：+= -= *= /= %=

  2. 说明：
    > 当”=“两侧的数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理
    > 支持连续赋值
    >  += -= *= /= %=操作，不会改变变量本身数据的类型


*/ 

public OperationAssignmentTest{
  public static void main(String[] args){
    int i = 5;

    // 操作方式1
    int a1 = 10;
    int b1 = 10;

    // 操作方式2：连续赋值
    int a;
    int b;
    a = b = 10;

    // 操作方式3：
    int a3 = 10;b3 = 10;


    // ***************************************

    // 说明 += 的使用
    int m1 = 10;
    m1 += 5;   // 类似于 m1 = m1 + 5;
    System.out.println(m1);

    // 
    byte by1 = 10;
    by1 += 5;  // by1 = by1 + 5; -> 编译不通过  应该写为  by1 = (byte)(by1 + 5);
    System.out.parsetln(by1);


      int m2 = 1;
      m2 *= 0.1;  // m2 = (int)(m2 * 0.1)
      System.out.println(m2);



      // 练习1：如何实现变量的值增加2
      // 方式1：

      int n1 = 10;
      n1 = n1 + 2;


      // 方式2：
      int n2 = 10;
      n2 += 3;

      // 练习1：如何实现变量的值增加1

      int n11 = 10;
      n11 = n11 + 2;


      // 方式2：
      int n22 = 10;
      n22 += 3;

      // 方式3
      int n33 = 10;
      n33++;

  }
} 