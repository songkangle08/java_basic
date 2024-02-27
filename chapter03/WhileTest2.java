/*
  世界上最高的山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米
  请问，我折叠多少次，可以折成珠穆朗玛峰的高度
*/

public class WhileTest2 {
  public static void main(String[] args) {
    // 定义珠峰的高度
    double zf = 8848.86 * 1000;
    double zhi = 0.1;
    int count = 0;

    while (zhi <= zf) {
      zhi = zhi * 2;
      count++;
    }
    System.out.println("总共折纸" + count + "次，超过了珠峰的高度");
  }
}
