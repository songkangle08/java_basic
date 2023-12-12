/*
  测试运算符的使用：比较运算符

    1. == != > < >= <= instanceof

    2. 说明:
      > instanceof 在面向对象的多态性的位置讲解
      > == != > < >= <= 适用于基本数据类型,运算的结果为boolean类型。（> < >= <=不适用于boolean类型）
      > 了解： == != 可以适应于引用数据类型

      区分： == 与 = 
*/
public OperationCompareTest{
  public static void main(String[] args){
    int m1 = 10;
    int m2 = 20;
    boolean compare1 = m1 > m2;
    System.out.parsetln(compare1)

  }
}  