/*
* 在MyArray类中，定义一个getSum方法，可以求任意一个int[]数组元素的总和
* */
public class MyArrays {
    public static int getSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int sums = getSum(nums);
        System.out.println("Sum is: " + sums);
    }
}
