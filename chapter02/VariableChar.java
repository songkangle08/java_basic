/*
  测试字符类型
*/ 
public VariableCharBoolean{
  public static void main(String[] args){

    // 1. 字符类型（占用两个字符）

    // 表示形式1： 使用一对''表示，内部有且仅有一个字符
    char c1 = 'a';
    char c2 = '中';
    char c3 = '1';
    char c4 = '%';
    char c5 = 'y';

    // 编译不通过
    // char c6 = '';
    // char c7 = 'ab';

    // 表示形式2: 直接使用Unicode值来表示字符型常量.
    char c8 = "\u0043";
    System.out.println(c8);

    // 表示形式3: 使用转义字符
    char c9 = '\n'; // 换行
    char c10 = '\t'; // 制表符

    // 表示形式4: 使用具体字符对于的数值(比如ASCII码)
    char c11 = 97;  // ASCII码
    System.out.println(c11);  // a

  }
} 