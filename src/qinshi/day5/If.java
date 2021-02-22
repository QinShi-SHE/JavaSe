package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IfDeom_1
 * @Date 2021/1/5 9:24
 */
public class If {
    /*
        **基本语法：**
 				if(判断条件){
					    执行语句;
				}
        判断条件:  布尔类型的值或者表达式
        执行语句：当条件满足时执行（可以是一条语句，也可以是一组语句）

     */
    public static void main(String[] args) {
        int a=1;
        if(a==1){
            System.out.println("a="+a);
        }

        //特殊
        if(true); //不报错，没意义

        int b=2;
        if(b>1)
            System.out.println("篱琴");
        System.out.println("if只有一个语句时，可以省略大括号");
    }
}
