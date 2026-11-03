
import java.util.Arrays;
import java.util.Scanner;


public class MethodDefineTest {
    // 需求：这个方法可以求任意2个整数的和
    public static int add(int a, int b) {
        return a + b;
    }

    // 可以在控制台打印m行n列某个字符组成的举行
    public static void printRectangle(int m, int n, char c) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // 这个方法可以产生0-100的整数
    public static int getNumber() {
        return (int)(Math.random() * 100);
    }

    /*
     * 定义一个max方法，可以求任意两个整数中的最大值
     * 在主方法中从键盘输入2个整数，然后调用max方法测试
     * */
    public static int max(int a, int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
        // return a > b ? a : b;
    }

    /*
    * 定义一个getNumberBetween方法，可以得到一个[a,b)范围的随机整数
    * 在主方法中调用getNumberBetween方法测试
    * */
    public static int getNumberBetween(int a, int b){
        /*
        * Math.random()得到[0,1)的小数
        * Math.random() * (b-a) 得到 [0, b-a)的小数
        * Math.random() * (b-a) + a 得到 [a, b)的小数
        * */
        return (int)(Math.random() * (b-a) + a);
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int num = add(x, y);
        System.out.println("num = " + num);

        printRectangle(3, 5, 'A');
        printRectangle(3, 5, '$');

        int a = getNumber();
        int b = getNumber();
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // 跨类调用是，public static修饰符的方法，可以通过类名.方法的方式调用
        int[] arr = {10,28,3,42,5};
        String s = Arrays.toString(arr);  // 用一个变量接收Arrays.toString()方法的结果
        System.out.println("s = " + s);

        System.out.println("得到的整数是：" + getNumberBetween(10,20));

        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.println("请输入第1个整数：");
        int aa = input.nextInt();

        System.out.println("请输入第2个整数：");
        int bb = input.nextInt();

        // max(a,b).var   // 把这个方法调用的结果用一个变量接收
        // max(a,b);      // 快捷键Ctrl + Alt + V
        // int max = max(1,2);
        System.out.println(max(aa, bb));

        input.close();

        // 跨类调用
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int sums = MyArrays.getSum(nums);
        System.out.println("Sum is: " + sums);

    }
}
