/*
  基本数据类型类型变量间的运算规则

  1. 这里提到可以做运算的基本数据类型有7种，不包含布尔类型
  2. 运算规则包括：
    自动类型提升
    强制类型转换

  3. 此java文件用来测试自动类型提升
    规则：当容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型

    byte，short、char --> int --> long --> float --> double

    特别的: byte\short\char类型的变量之间做运算,结果为int类型



    说明: 此时的容量小或大，并非指占用的内存空间的大小，而是指表示数据的范围的大小
      long（8字节） float（4字节）
*/
class VariableHoisting{
  public static void main(String[] args){

    int i1 = 10;

    int i2 = i1;

    long l1 = i1;

    float f1 = l1;

    byte b1 = 12;
    int i3 = b1 + i1;
    // byte b2 = b1 + i1  编译不通过

    /* -------------------------- */ 
    // 特殊的的情况1:
    byte b3 = 12;
    short s1 = 10;
    // 编译不通过
    // short s2 = b3 + s1;
    int i4 = b3 + s1;

    // 特殊的的情况1=2: char
    char c1 = 'a';
    // 编译不通过
    // char c2 = c1 + b3; 


    /* -------------------------- */ 
    // 练习1：
    long l2 = 123L;
    long l12 = 123;  // 理解为：自动类型提升

    // long l4 = 123123123123123; // 123123123123123 理解为int类型，因为超出了int范围，所有报错了
    long l5 = 123123123123123L;


    // 练习2
    float f2 = 12.3F;
    float f3 = 12.3; // 不满足自动类型提升的规则（double-->float）,所以报错了。


    // 练习3
    // 规定1：整型常量。规定为是int类型
    byte b5 = 10;
    // byte b6 = b5 + 1;

    // 规定2： 浮点型常量，规定是double类型
    double dd1= b5 + 12.3


    // 练习4；说明为什么不允许变量名是数字开头的，为了”自洽“
    // int 123L = 12;  // 不能以数字开头
    long  l6 = 123L;





  }
} 