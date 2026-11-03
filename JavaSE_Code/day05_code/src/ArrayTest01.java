public class ArrayTest01 {
    public static void main(String[] args) {
        // 例如：存储第1组8个人的成绩
        int s1 = 99;
        int s2 = 88;

        // int[] 代表的数数组类型，它是一组数据
        int[] scores = {89,85,100,96,75,53,60,78};

        System.out.println("第一个同学的成绩：" + (scores[0]));

        // 数组的遍历
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i+1) + "个同学的成绩：" + scores[i]);
        }
    }
}
