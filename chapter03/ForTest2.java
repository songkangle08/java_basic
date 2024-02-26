/*
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数
 * 比如： 12和20的最大公约数是4，最小公倍数是60


  约数:
      以12为例：1,2,3,4,6,12
      以20为例：1,2,4,5,10,20
  倍数：
      以12为例：12、24、48、60、72
      以20为例：20、40、60、80、100
 */

package chapter03;

public class ForTest2 {
  public static void main(String[] args) {
    int m = 12;
    int n = 20;

    // 获取m和
    int min = m > n ? n : m;
    int max = m > n ? m : n;
    int divisor = 1; // 最大公约数
    int multiple = max; // 最小公倍数

    // 方式一；
    // for (int i = 1; i <= min; i++) {
    // if (m % i == 0 && n % i == 0) {
    // divisor = i;
    // }
    // }

    // 方式二：
    for (int i = min; i >= 1; i--) {
      if (m % i == 0 && n % i == 0) {
        divisor = i;
        break; // 一旦执行，就跳出当前循环
      }
    }

    for (int i = max; i <= m * n; i++) {
      if (i % m == 0 && i % n == 0) {
        multiple = i;
        break;
      }
    }
    
    System.out.println("最大公约数：" + divisor);
    System.out.println("最小公倍数：" + multiple);

  }
}
  
