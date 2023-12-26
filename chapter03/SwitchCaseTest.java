/*
  switch-case: 
  1. 语法格式
  switch(表达式){
    case 常量2：
      // 执行语句
      break;
    case 常量1：
      // 执行语句
      break; 
    ...
    default:
      // 执行语句
      break; 
  }

  2. 执行过程：
    根据表达式中的值,依次匹配，一旦与某一个case中的常量相等，那么就执行此case的执行语句。
    执行完此语句之后：
      情况一：遇到break，则执行break后，跳出当前的switch-cas结构
      情况二：没有遇到break，则继续执行其后的case中的执行语句 -- case穿透
              ...
              直到遇到break或者执行完所有的case及default中的语句，退出当前的switch-case结构
  

3. 
  a: switch中的表达式只能是特定的数据类型：如下: byte \ short \ char \ int \ 枚举 \ String()
  b: case后都是跟的常量，使用表达式与这些常量做相等的判断，不能进行范围的判断
  c: 开发中使用switch-case，通常匹配case的情况有效
  d： break：可以使用在switch-case中，一旦执行break关键字，就跳出当前的switch-case结构
  e：default： 类似于if-else中的else
        default是可选，而且位置是灵活的

4. switch-case 与if-else之间的转换
  能够使用switch-case都可以转换为if-else，反之，不成立
  开发中，如果一个问题既可以使用switch-case又可以使用if-else，推荐使用switch-case。switch-case效率更高。
*/ 
class SwitchCaseTest{
  public static void main(String args[]){

    int num1 = 1;

    switch(num1){
      case 0:
        System.out.println("zero");
        break;
      case 1:
        System.out.println("one");
        break;  // 结束当前的switch-case结构
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      default:
        System.out.println("one");
    }



    String season = "summer";
    switch(season){
      case "spring":
        System.out.println("春暖花开");
        break;
      case "summer":
        System.out.println("夏日炎炎");
        break;
      case "autumn":
        System.out.println("秋高气爽");
        break;
      case "winter":
        System.out.println("冬雪皑皑");
        break;
      default:
        System.out.println("季节有无");
    }



  }
}