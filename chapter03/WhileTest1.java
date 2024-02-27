/*
  随机生成一个100以内的随机数，猜这个随机数是多少？
  从键盘输入数，如果大了，提示大了，如果小了，提示小了，如果对了，就不在猜了，并统计一共猜了多少次
  提示：生成一个[a,b]范围的随机数的方式(int)(Math.random() * (b-a+1) +a)
*/

import java.util.Scanner;

public class WhileTest1 {
  public static void main(String[] args) {
    // 1. 生成一个随机数
    int random = (int) (Math.random() * (100 - 0 + 1) + 0);

    Scanner scan = new Scanner(System.in);

    boolean flag = true;
    int count = 0;

    while (flag) {
      System.out.print("请输入100以内的数：");
      int guess = scan.nextInt();

      if (guess > random) {
        System.out.println("大了");
      } else if (guess < random) {
        System.out.println("小了");
      } else {
        System.out.println("恭喜你，猜对了");
        flag = false;
      }
      count++;
    }
    System.out.println("你总共猜了" + count + "次");
    scan.close();

  }

}

}
