/*
  测试运算符的使用：逻辑运算符:操作的都是boolean类型的变量或者常量。而且运算的结果也是boolean类型的值。

  & 和 && ： 表示“且”关系，当符号左右梁陛布尔值都是true时，结果才能为true，否则，为false
  | 和 || 表示“或”关系，当符号两边布尔值有一个为true时，结果为true，当两边都为false时，结果为false
  !: 表示“非”关系，当变量布尔值为true时，结果为false，当变量布尔值为false时，结果为true
  ^: 当符号左右两边布尔值不同时，结果为true，当符号布尔值相同时，结果为false
    - 理解： 异或。追求的是“异”

*/ 

public OperationLogicTest{
  public static void main(String[] args){

    /*
      区分：& &&
      相同点： 两个符号表达的都是“且”的关系。只有当符号左右两边的类型值均为true时，结果才为true。
      区别：
        执行过程： 
          如果符号左边是true，则& &&都会执行符号右边的操作
          如果符号左边是false，则& 会继续执行符号右边的操作
                              则&&不会继续执行符号右边的操作
      开发种，我们推荐使用&&
    
      */ 
    boolean b1 = true;
    b1 = false;
    int num1 = 10;

    if(b1 & (num++ > 0)){
      System.out.println("床前明月光");
    }else{
      System.out.println("我叫郭德纲")
    }
    System.out.println(num1)

    boolean b2 = true;
    b2 = false;
    int num2 = 10;

    if(b2 && (num++ > 0)){   // 短路
      System.out.println("床前明月光");
    }else{
      System.out.println("我叫郭德纲")
    }
    System.out.println(num2)

    /*
      区分：|  ||
      相同点： 两个符号表达的都是“或”的关系。只要当符号左右存在为true时，结果才为true。
      区别：
        执行过程： 
          如果符号左边是false，则| ||都会执行符号右边的操作
          如果符号左边是true，则| 会继续执行符号右边的操作
                              则||不会继续执行符号右边的操作
      开发种，我们推荐使用||    
      */ 
    



  }
}