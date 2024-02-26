/*
  循环结构之一：do-while循环
  1、凡是循环结构，就一定会有4个要素：
    1.初始化条件
    2.循环条件  ---> 循环条件一定是boolean类型的变量或者是一个表达式
    3.循环体
    4.迭代条件
  2、do-while循环的格式：
    // 1.初始化条件
    do{
      // 3. 循环体
      // 4. 迭代条件
    }while(循环条件)
  3、执行过程：1->3->4->2->3->4->2->......

  4、说明
    1. do-while循环至少会执行一次循环体
    2. for、while、do-while循环三者之间是可以转换的
    3. do-while循环结构，在开发种，相较于for，while循环来讲使用的较少
*/ 
class WhileDoTest{
  public static void main(String[] args){
    // 需求：遍历100以内的偶数，并输出偶数的个数和总和
    int i = 0;
    int count = 0;
    int sum = 0;
    do{
      if(i % 2 == 0){
        System.out.print(i);
        count++;
        sum+=i;
      }
      i++;
    }while(i<=100);

    System.out.println("个数为"+count);
    System.out.println("偶数和"+sum);




  }
}