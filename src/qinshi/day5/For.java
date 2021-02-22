package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName For
 * @Date 2021/1/5 14:03
 */
public class For {
    /*
**基本语法：**
for(初始化条件A;判断条件B;循环后语句C){
	 执行语句D;
}
初始化条件A：初始化一个值，用来作为B中的判断条件
判断条件B：布尔类型的值或者表达式
循环后语句C：循环后执行的代码，目的是为了改变初始条件A的值，使B中条件不是一个固定的值
执行语句D：当B中的判断条件满足，为true执行D，false，则不执行
**执行流程：**
		第一次：A--》B(true)--》D--》C
	  第二次：    B(true)--》D--》C
	  第三次：    B(true)--》D--》C
		…
	  第n次：     B(false)  结束整个循环

     */
    public static void main(String[] args) {
        /*打印1到10之间的数字*/
        for(int i=1;i<11;i++){
            System.out.println(i);
        }
        //初始条件中变量的作用域
        //System.out.println(i);//报错，i只作用于循环结构体中

        //特殊写法
        /*死循环*/
//        for(;;){
//            System.out.println("Hello");
//        }

        System.out.println("*********************");
        //用for循环计算1-10的 积(即10的阶乘)
        int s=1;
        for(int i=1;i<11;i++){
            s*=i;
        }
        System.out.println("10!="+s);

    }
}
