/*
  题目：找出100以内所有的素数（质数）？10000以内的呢？
  目的：不同的代码实现方式，可能效率差别很大。
  分析: 素数（质数）：只能被1和他本身整除的自然数  --> 从2开始，到这个数-1为止，此范围内没有这个数的约数。则此数是一个质数。
  比如：2、3、5、7、11、13、17、19、23、........
*/ 


class PrimeNumberTest{
  public static void main(String[] args){
    
    // 获取系统时间
    long start = System.currentTimeMills();

    int count = 0;

    for(int i = 2;i <= 100000;i++){
      boolean isFlag = true;  // 立一个旗子
      for(int j = 2;j <= Math.sqrt(i);j++){  // Math.sqrt() 开根号
        if(i % j == 0){
          isFlag = false;
          break;    // 算法优化 --- 针对于非质数又效果
        }
      }
      if(isFlag){
        count++;
      }
    }
    long end = System.currentTimeMills();
    System.out.println("质数的总个数为:"+ count);   // 9592
    System.out.println("总用时"+ end - start);  // 7000 --> 700 -> 7

  }
}