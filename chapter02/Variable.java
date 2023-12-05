/*
  1、变量：内存中的一个存储区域，该区域的数据可以在同一类型范围内不断变化。
  2、变量的构成包含三个要素：数据类型、变量名、存储的值
  3、java中变量声明的格式：数据类型 变量名=变量值

  变量的作用：用于在内存中保存数据

  4、java中的变量按照数据类型来分类：
    基本数据类型：
      整型： byte、short、int、long
      浮点：float、double
      字符：char
      布尔类型：boolean

    引用数据类型：
      类（class）
      数组（array）
      接口（interface）

      枚举（enum）
      注解（annotation）
      记录（record）


  5、 定义变量名时，变量名要遵循标识符命名的规则和规范

  6、说明：
   a. 变量都有其作用域，变量只在作用域是有效的，出了作用域就失效了。
   b. 在同一个作用域内，不能声明两个同名的变量
   c. 定义好变量以后，就可以通过变量名的方式对变量进行调用和运算了
   d. 变量值在赋值时，必须满足变量的数据类型，并且在数据类型有效的范围内变化。
*/ 

class Variable{
  public static void main(String[] args){
    
    

    char gender;  // 过程1：变量的声明
    gender = "男";  // 过程2：变量的赋值（变量的初始化）
    gender = "女";

    // 定义变量的方式2： 声明与初始化合并
    int age = 10;


    byte b1 = 127;
    // b1 = 128; b1超出了byte的范围了

    System.out.println("age = " + age);

  }
}