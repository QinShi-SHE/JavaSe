package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Swtich
 * @Date 2021/1/5 9:48
 */
public class Switch {
/*
**基本语法**：
switch(key){
	 case  v1:
				执行语句;
				break;
   case  v2:
				执行语句;
				break;
................
  default:
				执行语句;
				break;
}
**key：** 限定类型的局部变量或常量

			java5之前  ：  byte short char int

			java5支持  ：  enum枚举

			java7支持  ：  String 类型

v1，v2：与key同种类型的值 常量

执行原理：
	将key的值与case中列举的值进行匹配  如果匹配 执行 执行语句 找到break  跳出选择结构
	如果都没有匹配上的值 则执行default中的执行语句，找到break 跳出选择结构

注意事项：
1.    每个case之间顺序可以交换 不影响代码运行
2.    default不一定放在末尾 在所有case失效的时候就会被执行到
3. 	   case中值与 key类型必须一致
4.     最后一个break可以省略，但不建议
5.     break可以省略，但会导致后续case条件判断失效 按照从上到下顺序 直到找到第一个break跳出选择结构 如果没有找到  执行到末尾 自动跳出选择结构


 */
    public static void main(String[] args) {
        //一周 七天   星期一到星期六上班  星期天休息
        int number = 3;
        switch (number) {
            case 1:
                System.out.println("上班1");
                //break;
            case 2:
                System.out.println("上班2");
                break;
            case 3:
                System.out.println("上班3");
                //break;
            case 4:
                System.out.println("上班4");
                break;
            case 5:
                System.out.println("上班5");
                break;
            case 6:
                System.out.println("上班6");
                break;
            default:
                System.out.println("今天不用上班，休息");
                break;
        }

    }
}
