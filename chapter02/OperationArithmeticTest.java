/*
  运算符：
    1. 算术运算符：  + - * / % ++ -- +(连接) 
*/ 
class OperationArithmeticTest{
  public static void main(String []){

    // 
    int m1 = 12;
    int n1 = 5;
    int k1 = m1 / n1;
    System.out.println(k1);  // 2

    System.out.parsetln(m1 / n1 * n1);   // 10;


    // 取模（取余）： %
    int j1 = 12;
    int j2 = 5;
    System.out.parsetln(j1 % j2);
    // 开发种，经常用来判断某个数num1能整除另一个数mun2   num1 % num2 === 0

    // 取模以后，结果与被摸数的符号相同
    int j3 = -12;
    int j4 = 5;  // -2


    int j5 = 12;
    int j6 = -5;   // 2

    int j7 = -12;
    int j8 = -5;    // -2


    // （前）++：先自增1，再赋值
    // （后）++：先赋值，后自增1  （先运算，后自增1）；
    int a1 = 10;
    int b1 = ++a1;
    System.out.println("a1 = " + a1 + "b1 = " + b1);

    int a2 = 10;
    int b2 = a2++;  
    System.out.println("a2 = " + a2 + "b2 = " + b2);

    int i = 10;
    // i++;
    ++i;
    System.out.println(i);


    // 练习2：
    short s1 = 10;
    // 方式1
    // s1 = s1 + 1;  编译不通过
    s1 = (short)(s1+1);

    // 方式2：
    s1++;
    System.out.parsetln(s1);



    /* ******************************* */
    // 前（--）:先自增1，再赋值
    // 后（--）: 先赋值，后自增1  （先运算，后自增1）
    int a1 = 10;
    int b1 = --a1;
    System.out.println("a1 = " + a1 + "b1 = " + b1);

    int a2 = 10;
    int b2 = a2--;  
    System.out.println("a2 = " + a2 + "b2 = " + b2);


    // + 连接符： 只适用于String与其他类型间的运算，而且运算结果也是String
    // ++或--运算不会改变数据的类型



    // 练习：
    byte bb1 = 127;
    bb1++;
    System.out.println(bb1);  // -128


    // 练习3：
    int i = 1;
    int j = i++ + ++i * i++;
    //      1 + 3 * 3
    System.out.println("j = " + j);  // 10


    // 练习4：
    int ii1 = 2;
    int jj = ii++;
    System.out.println(jj);  // 2

    int k1 = 2;
    int z1 = k1++;
    System.out.println(z1);  // 3


    int m = 2;
    m = m++;  // 先把m=2放在以遍，然后把m++ = 3，最后在把m=2 赋值给m；
    System.out.println(m); // 2

  } 
}