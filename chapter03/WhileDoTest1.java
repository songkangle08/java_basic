/*
  题目：模拟ATM机
  声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能

  =========ATM=========
    1、存款
    2、取款
    3、显示余额
    4、退出
  请选择（1-4）：
*/
class WhileDoTest1{
  public static void main(String[] args){
    // 1、定义银行账户余额
    double balance = 0;

    boolean flag = true; // 通过

    Scanner scan = new Scanner(System.in);

    // 2、通过循环展示ATM机的业务功能
    do {
      System.out.println("=========ATM=========");
      System.out.println("    1、存款");
      System.out.println("    2、取款");
      System.out.println("    3、显示余额");
      System.out.println("    4、退出");
      System.out.println("请选择（1-4）：");

      int selection = scan.nextInt();

      switch (selection) {
        case 1:
          System.out.println("请输入存款金额");
          double money1 = scan.nextDouble();
          if (money1 > 0) {
            balance += money1;
            System.out.println("您存款成功" + money1 + "元");
          }
          break;
        case 2:
          System.out.println("请输入取款金额");
          double money2 = scan.nextDouble();
          if (money2 > 0 && money2 < balance) {
            balance -= money2;
            System.out.println("您取款成功" + money2 + "元");
          } else {
            System.out.println("您输入的有误或者余额不足");
          }
          break;
        case 3:
          System.out.println("您的账户有" + balance + "元");
          break;
        case 4:
          flag = false;
          System.out.println("欢迎下次再来");
          break;
        default:
          System.out.println("您输入的有误，请重新输入");
      }

    } while (flag);

    scan.close();

  }
}
