/*
* 1. 创建一个名为DateTools的类，其中包含以下静态方法：
* (1). 定义一个isLeapYear方法，可以判断year是不是闰年
* (2). 定义一个totalDaysOfYear方法，返回year年的总天数
* */

public class DateTools {
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
    }

    public static int totalDaysOfYear(int year){
        if(isLeapYear(year)){
            return 366;
        }
        return 365;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1995) ? "闰年" : "平年" );
        System.out.println(totalDaysOfYear(1995));
    }
}
