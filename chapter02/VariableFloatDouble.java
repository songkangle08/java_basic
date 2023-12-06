/*
  测试浮点类型
*/

class VariableFloatDouble{
  public static void main(String[] args){
    
    // 1. 测试浮点型变量的使用 单精度float    双精度double
    /*
      单精度     4字节    尾数可以精确到7位有效数字，很多情况下，精度很难满足需求
      双精度     8字节    尾数精确度时double的两倍
    */ 
    
    double d1 = 12.3;

    // 声明float类型变量是，需要提供后缀，后缀为“F”或“f”；
    float f1 = 12.3F;
    System.out.println("f1 = "+ f1);

    // 开发中，大家定义浮点型变量时，没有特殊情况的话，通常都声明为double类型

    // float类型表数范围要大于long类型的表数范围，但精度不高。

    // 测试浮点型变量的精度
    // 结论：通过测试发现浮点型变量的精度不高，如果在开发中，需要极高的精度，需要使用BigDecimal类替换浮点型变量。
    System.out.println(0.1+0.2);

  }
}