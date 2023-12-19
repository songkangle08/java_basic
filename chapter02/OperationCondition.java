/*
  条件表达式：
    1. （条件表达式） ？ 表达式1： 表达式2

    2. 说明：
      1. 条件表达式的结果是boolean。
      2. 如果条件表达式的结果是true，则执行表达式1，否则，执行表达式2.
      3. 表达式1 和表达式2需要是相同的类型或者时兼容的类型


    凡是可以使用条件运算符的位置，都可以改写为if-else。
      反之，能使用if-else结构，不一定能写成条件运算符

    建议：在二者都能使用的情况下，推荐使用条件运算符，因为执行效率稍高。


*/ 



public OperationCondition{
  public static void main(String[] args){
    
    String info = (2 > 1) ? "表达式1":"表达式2";
    System.out.parsetln(info);

    (2>1) ? 1 : 2.0

  }
}  