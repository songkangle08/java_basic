/*
  测试布尔类型
*/ 
public VariableCharBoolean{
  public static void main(String[] args){

    // 布尔类型: boolean;
    // 只有两个值：true  false
    boolean b1 = true;
    boolean b2 = false;

    // 常使用在流程控制语句中，比如：条件判断、循环结构等
    boolean isMarried = true;  
    if(isMarried){
      System.out.println("哈哈");
    }else{
      System.out.println("可以多谈几个女朋友");
    }

    // 我们不谈boolean类型占用的空间大小，但是，真正在内存中分配的话是4个字节。

  }
} 