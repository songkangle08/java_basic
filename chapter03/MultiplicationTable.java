/*
  练习：九九乘法表
*/
public class MultiplicationTable {
  public static void main(String[] args) {

    /* 九九乘法表 */
    for (int i = 1; i <= 9; i++) { // 控制行
      for (int j = 1; j <= i; j++) { // 控制列
        System.out.print(i + "*" + j + "=" + i * j + " ");
      }
      System.out.println();
    }

  }
}
