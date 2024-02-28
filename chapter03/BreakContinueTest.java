package chapter03;

/*
  break和continue关键字的使用：

              使用范围          在循环结构中的作用            相同点

  break:      switch-case       结束（或）跳出当前循环结构    在此关键字的后面不能声明语句
              循环结构中

  continue:    循环结构中       结束（或跳出）当次循环         在此关键字的后面不能声明语句

*/

public class BreakContinueTest {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      if (i % 4 == 0) {
        continue;
        // 编译不通过
        // System.out.println("哈哈哈")
      }
    }
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(j + "ha");
        if (j % 4 == 0) {
          break; // 结束当前最近的那个for循环
          // continue; // 结束当次最近的那个for循环
        }
        System.out.print("*" + i);
      }
      System.out.println();
    }

    System.out.println("============");

    label: for (int i = 1; i <= 4; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(j + "ha");
        if (j % 4 == 0) {
          // break label; // 结束label: for的循环
          continue label; // 结束label: for次最近的那个for循环
        }
        System.out.print("*" + i);
      }
      System.out.println();
    }

  }
}
