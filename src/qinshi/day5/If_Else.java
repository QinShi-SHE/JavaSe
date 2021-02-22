package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName If_Else
 * @Date 2021/1/5 9:38
 */
public class If_Else {
/*
 **基本语法**：
				if(判断条件){
					执行语句;
				}else{
					执行语句;
				}
			  判断条件:  布尔类型的值或者表达式
 			 执行语句：当条件满足时执行if中的语句  其他情况执行else中的

 */
    public static void main(String[] args) {
        int a=1;
        if (a == 2) {
            System.out.println("a=2");
        }else{
            System.out.println("a=1");
        }

        //判断一个数是否是3的倍数
        int b=9;
        if(b%3==0){
            System.out.println("是三的倍数");
        }else{
            System.out.println("不是三的倍数");
        }

        //求出2个变量中的最大值
        int x=1,y=2,max=0;
        if(x>y)
            max=x;
        if(x<y)
            max=y;
        System.out.println("max:"+max);
    }
}
