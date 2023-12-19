/*
  分支结构： if-else条件判断
  1. 格式：
    格式1：
    if(条件表达式){
      语句块
    }
    格式2：
      if(条件表达式){
        语句块
      }else{
        语句块
      }
    格式3：
      if(条件表达式1){
        语句块
      }else if(条件表达式1){
        语句块
      }...{
        语句块
      }else{
        语句块
      }

  说明：
      1. 如果多个条件表达式之间没有交集（理解为互斥关系），则哪个条件表达式声明在上面，哪个声明在下面都可以
      2. 如果多个条件表达式之间式包含关系，则需要将范围小的条件表达式声明在范围大的条件表达式上面。否则，范围小的条件表达式不会执行
*/ 
public IfElseTest{  
  public static void main(String[] args){

    int heartBeats = 89;
    if(60 > heartBeats && heartBeats > 100){
      System.out.println("心率不正常");
    }else{
      System.out.println("心率正常");
    }


    int num = 13;
    if(num % 2 == 0){
      System.out.println("偶数");
    }else{
      System.out.println("奇数");
    }
  }
}