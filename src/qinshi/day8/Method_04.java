package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_04
 * @Date 2021/1/9 10:36
 */
public class Method_04 {
    /*
           含参的调用
     */
    static void getSum(int a,int b){
        System.out.println(a+b);
    }
    double  getSum1(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        getSum(7,7);
        Method_04.getSum(4,6);

        int a=3,b=3;
        getSum(a,b);

        Method_04 method_04=new Method_04();
        System.out.println(method_04.getSum1(3,5));
    }
}
