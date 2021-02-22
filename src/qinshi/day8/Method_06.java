package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_06
 * @Date 2021/1/9 11:29
 */
public class Method_06 {
    /*
            方法几种定义方式
                     1.无参数无返回值
                        void 方法名(){}
                     2.有参数无返回值
                        void 方法名(参数类型 参数名){}
                     3.无参有返回值
                        返回值类型 方法名(){}
                     4.有参有返回值
                        返回值类型 方法名(参数类型 参数名){}
     */

    //定义一个方法，用四种方式分别求两个数的和

    //1.无参数无返回值
    void getSum1(){System.out.println(1+2);}
    //2.有参数无返回值
    void getSum2(int a,int b){System.out.println(a+b);}
    //3.无参有返回值
    int getSum3(){return 1+2;}
    //4.有参有返回值
    int getSum4(int a,int b){return a+b;}

    public static void main(String[] args) {
        Method_06 method_06=new Method_06();

        method_06.getSum1();//1.无参数无返回值
        method_06.getSum2(1,2); //2.有参数无返回值
        System.out.println(method_06.getSum3());//3.无参有返回值
        System.out.println(method_06.getSum4(1,2));//4.有参有返回值
    }
}
