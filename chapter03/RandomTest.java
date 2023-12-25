/*
  如何获取一个随机数
  1. 可以使用Java提供的API：Math类中的random()
  2. random()调用以后，会返回一个[0.1,0.1)范围的double型的随机数
  
  3. 获取一个[0,100]范围的随机数？
  4. 获取一个[1,100]范围的随机数？
  5. 获取一个[a,b]范围的随机整数？
    (int)(Math.random() * (b- a + 1)) + a;
*/ 
class RandomTest{
  public static void main(String args[]){
    double d1 = Math.random();


    // 3. 获取一个[0,100]范围的随机数？
    int sum = (int)(Math.random() * 101); 


    // 4. 获取一个[1,100]范围的随机数？
    int sum1 = (int)(Math.random() * 100) + 1;



  }
}