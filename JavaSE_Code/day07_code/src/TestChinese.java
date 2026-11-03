public class TestChinese {
    public static void main(String[] args) {
        Chinese.country = "中国";
        System.out.println(Chinese.country);

        // System.out.println(Chinese.name);  // 错误
        // System.out.println(Chinese.age);   // 错误
        // name和age是非静态的实例，他们依赖于Chinese的对象

        Chinese c1 = new Chinese();
        c1.name = "李刚";
        c1.age  = 18;

        System.out.println("c1.name = " + c1.name);
        System.out.println("c1.age = " + c1.age);


        Chinese c2 = new Chinese();
        c2.name = "李tao";
        c2.age  = 18;

        System.out.println("c2.name = " + c2.name);
        System.out.println("c2.age = " + c2.age);
        System.out.println("c2.country = " + c2.country);

        c1.country = "中华人民共和国";

        System.out.println("c1.country = " + c1.country);
        System.out.println("c2.country = " + c2.country);
    }
}
