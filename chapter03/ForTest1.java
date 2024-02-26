/*
 * 题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各位上数字立方和等于其本身
 * 例如：153 = 1*1*1 + 3*3*3 + 5*5*5
 */

package chapter03;

public class ForTest1 {
  public static void main(String[] args) {

    for (int i = 100; i < 1000; i++) {
      int ge = i % 10;
      int shi = i / 10 % 10;
      int bai = i / 100;
      // 判断是否满足水仙花数
      if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
        System.out.println(i); // 153 370 371 407
      }
    }

    int num = 153;
    System.out.println(num % 10); // 3
    System.out.println(num / 10); // 15
    System.out.println(num / 10 % 10); // 5
    System.out.println(num / 100); // 1
    System.out.println(num % 100); // 53

    // int除以一个数得到的还是int
    System.out.println(1 / 10); // 0
  }
}
