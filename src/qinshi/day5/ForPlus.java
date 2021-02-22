package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ForPlus
 * @Date 2021/1/5 15:14
 */
public class ForPlus {
    /*
    嵌套循环
顾名思义，嵌套循环指的是循环中嵌套一个循环；但最好嵌套不要超过两层，效率太低；

     */
    public static void main(String[] args) {
        /*需求：需要打印五行*每行五颗 */
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println(); //打印一行空白行

        //优化1  用循环控制了打印的行数
        for(int i=1;i<6;i++){
            System.out.println("*****");
        }
        System.out.println("\n"); //打印两行空白行

        //优化2  用循环控制了打印的行数和列数
        for(int j=1;j<6;j++){
            for(int i=1;i<6;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
