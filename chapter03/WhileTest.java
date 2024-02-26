/*
  循环结构之一：for循环
  1、java中规范了3种循环结构：for、while、do-while
  2、凡是循环结构，就一定会有4个要素：
    1.初始化条件
    2.循环条件  ---> 循环条件一定是boolean类型的变量或者是一个表达式
    3.循环体
    4.迭代条件
  3、while循环的格式：
    1
    while(2){
      3
      4
    }
  执行的人过程：1(初始化条件) -> 2(循环条件) -> 3(循环体) -> 4(迭代条件) -> 2 -> 3 -> 4

  4、for循环与while循环刻意相互转换！！

  5、for循环和while循环的小区别，初始化条件的作用域范围不同，while循环种的初始化 条件在while循环结束以后，依然生效

*/ 
class WhileTest{
  public static void main(String[] args){
    
    // 遍历50次helloworld
    int i = 0;
    while(i<=50){
      System.out.println("HelloWorld");
      i++; // 一定要小心，不要丢了
    }

    // 遍历1-100以内的偶数，并获取偶数的格式，获取所有的偶数的和
    int j = 1;
    int sum = 0;
    int count = 0;
    while(j <= 100){
      if(j % 2 == 0){
        System.out.print(j);
        count++;
        sum+=j;
      }
      j++;
    }
    System.out.println("和是"+sum);
    System.out.println("个数"+count);

  }
}