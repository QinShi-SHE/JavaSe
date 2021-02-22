package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName While
 * @Date 2021/1/5 11:39
 */
public class While {
    /*
 **基本语法**：
while(循环条件){
	执行语句;
}
**循环条件：**布尔类型的值或者表达式,需要不断变化，如果是一个常量或者固定不变的值，则称为没有意义的循环或者死循环;
**执行语句：**当循环条件为true时执行语句，false终止循环，不执行语句
**执行流程：**
 1) 第一次判断条件true，继续执行
2) 第二次判断条件true，继续执行
3) 第三次判断条件true，继续执行
4) 。。。。。
5) 直到第n次判断条件false，终止循环

     */
    public static void main(String[] args) {
        /*打印10到30之间的数字*/
        int i = 10;
        while(i<31){
            System.out.println(i);
            i++;
        }
        System.out.println("********************");
        /*打印1到10之间的偶数*/
        int j = 1;
        while(j<11){
            if(j%2==0){
                System.out.println(j);
            }
            j++;
        }

        //特殊写法
//        while (true){
//           // System.out.println("你是憨憨");
//        }

        System.out.println("********************");

        //1.求出10以内2的倍数的数字 和 个数。
        //2.求出 1-10的所有偶数的和
        int x=1,num=0,sum=0;
        while (x<=10){
            if(x%2==0){
                System.out.println(x);
                sum+=x;
                num++;
            }
            x++;
        }
        System.out.println("10以内的2的倍数的数字个数："+num);
        System.out.println("10以内的偶数和："+sum);


    }
}
