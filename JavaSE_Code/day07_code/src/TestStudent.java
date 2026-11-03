public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.cardId = "1223432123234567654";
        s1.nation = "汉族";
        s1.gender = '男';
        s1.study();
        s1.exam();

        Student s2 = new Student();
        s1.name = "李四";
        s1.cardId = "1223432123234567654";
        s1.nation = "汉族";
        s1.gender = '女';
        s1.study();
        s1.exam();
    }
}
