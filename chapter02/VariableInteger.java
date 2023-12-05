/*
  测试整型
*/

class VariableInteger{
  public static void main(String[] args){
    
    // 1. 测试整型变量的使用 byte short int long
    /*
      1个字节可以表示256个数
      
      byte   1字节=8bit位    -128~127
      short  2字节=16bit
      int    4个字节          约21亿
      long   8个字节
    */ 

    byte b1 = 12;
    byte b2 = 127;
    // 编译不通过，超出了byte的存储范围
    // byte b3 = 128;

    short s1 = 1234;

    int i1 = 123123123;

    // 声明long类型变量是，需要提供后缀，后缀为“L”或“l”；
    long l1 = 121123211L

    // 开发中，大家定义整型变量时，没有特殊情况的话，通常都声明为int类型


  }
}