package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BreakContinueReturn
 * @Date 2021/1/5 15:29
 */
public class BreakContinueReturn {
    /*
        break,continue,return的区别
        不管是break、continue、return，后面都不能再写语句
     */
    public static void main(String[] args) {
        //break,终止当前循环  后面的也不再执行
        for(int i=1;i<8;i++){
            if(i==6){
                break;  /*  一个循环 如果循环中出现了6 则终止循环 后面的也不再执行*/
                //System.out.println("break后面不能再写语句");
            }
            System.out.println(i);
        }
        System.out.println("\n");



        //continue 跳出(暂停)当前循环 后面的继续执行
        for(int i=1;i<8;i++){
            if(i==6){
                continue;  /*  一个循环 如果循环中出现了6 则跳过循环 后面的继续执行*/
                //System.out.println("continue后面不能再写语句");
            }
            System.out.println(i);
        }
        System.out.println("\n");



        //return 终止当前方法 后面的循环也不会被执行 循环外面的语句也不会被执行到
        for(int i=1;i<8;i++){
            if(i==6){
                return;  /*  一个循环 如果循环中出现了6  终止当前的方法 后面的循环也不会被执行 循环外面的语句也不会被执行到*/
                //System.out.println("return后面不能再写语句");
            }
            System.out.println(i);
        }

        System.out.println("循环外面的语句也不会被执行到");  //不会执行，return,会跳出整个方法，在这里跳出了main方法
        System.out.println("循环外面的语句也不会被执行到");  //不会执行
        System.out.println("循环外面的语句也不会被执行到");  //不会执行
    }
}
