package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName If_ElseIf
 * @Date 2021/1/5 9:41
 */
public class If_ElseIf {
 /*
 **基本语法**：
				if(判断条件){
					执行语句;
				}else if(判断条件){
					 执行语句;
                }else if(判断条件){
					执行语句;
				}。。。。
			  判断条件:  布尔类型的值或者表达式
 			 执行语句：所有条件只能满足一个 条件互斥 因此执行语句只能有一条被执行到

  */
 public static void main(String[] args) {
     /*
   判断一个成绩分数 如果成绩分数大于90 输出  优秀 80~90良好  70~80中等  60~70  及格
*/

     //定义成绩
     int  score = 68;
    //判断成绩是否满足
     if(score>90){
         System.out.println("优秀");
     }else if(score>80&&score<=90){
         System.out.println("良好");
     }else if(score>70&&score<=80){
         System.out.println("中等");
     }else if(score>60&&score<=70){
         System.out.println("及格");
     }

 }
}
