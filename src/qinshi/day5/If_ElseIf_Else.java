package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName If_ElseIf_Else
 * @Date 2021/1/5 9:43
 */
public class If_ElseIf_Else {
/*
**基本语法**：
				if(判断条件){
					执行语句;
				}else if(判断条件){
					 执行语句;
                }.....else if(判断条件){
					执行语句;
		   	}else{
					执行条件;
			  }
			  判断条件:  布尔类型的值或者表达式
 			 执行语句：所有条件只能满足一个 条件互斥 因此执行语句只能有一条被执行到  如果条件都不满足 则执行else中的语句。

 */
    public static void main(String[] args) {
        //判断一个成绩分数 如果成绩分数大于90 输出  优秀 80~90良好  70~80中等  60~70  及格  其他的输出  需要好好加油啦

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
        }else{
            System.out.println("继续加油啦");
        }

    }
}
