/*
  循环结构之一：for循环
  1、java中规范了3种循环结构：for、while、do-while
  2、凡是循环结构，就一定会有4个要素：
    1.初始化条件
    2.循环条件  ---> 循环条件一定是boolean类型的变量或者是一个表达式
    3.循环体
    4.迭代条件
  3、for循环的格式：
    for(1;2;4){
      3
    }
  执行的人过程：1(初始化条件) -> 2(循环条件) -> 3(循环体) -> 4(迭代条件) -> 2 -> 3 -> 4

*/ 
class ForTest{
  public static void main(String[] args){
    // 输出5行的HelloWorld
    for(int i = 0;i < 5;i++){
      System.out.print("HelloWorld");
    }

    // 需求2
    int num = 0;
    for(System.out.print("a");num < 3;System.out.print("c"),num++){
      System.out.print("b")
    }

    // 需求3：遍历1-100以内的偶数，并获取偶数的格式，获取所有的偶数的和
    int count = 0;
    int sum = 0;
    for(int i = 0;i<=100;i++){
      if(i % 2 === 0){
        count++;
        sum+=i;
        System.out.println(i)
      }
    }
    System.out.print("偶数个数为："+count);
    System.out.print("偶数的和为："+sum);


  }
}