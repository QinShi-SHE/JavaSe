package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_08
 * @Date 2021/1/9 14:36
 */
public class Method_09 {
    /*
        方法签名：方法名+参数列表【参数的个数 参数的顺序 参数的类型】

        方法重载：在同一个类中，方法名相同，参数列表不同的方法称为方法的重载。
            前提：
                同一个类中，同名不同参
            条件：
                参数类型
                参数个数
                参数顺序
                要保证有一个不同就可以重载
            目的：
               方法的重载的方法一般都具有相类似的功能，只是参数列表不同，与返回值类型无关，返回值类型可以不同，
               为了在使用时方便记忆同种类似功能的方法；
         方法调用:
                方法签名不同，调用会自动匹配
     */

    /*在同一个类有计算两个整数和三个整数的两个方法*/
    public static void sumTwoNum(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    public static void sumThreeNum(int i,int j,int k){
        int t = i+j+k;
        System.out.println(t);
    }

    //方法重载的方式
    public static void getSum(int a,int b){  //2个参数 相同类型  方法签名:getSumintint
        int c = a+b;
        System.out.println(c);
    }
    public static void getSum(int i,int j,int k){  //3个参数 相同类型   方法签名:getSumintintint
        int t = i+j+k;
        System.out.println(t);
    }
    public static void getSum(int i,int j,int k,int h){  //4个参数 相同类型   方法签名:getSumintintintint
        int t = i+j+k+h;
        System.out.println(t);
    }
    public static void getSum(double x,double y){  //2个参数，但是类型不同   方法签名:getSumdoubledouble
        System.out.println(x+y);
    }
    void getSum(int x,double y){   //2个参数，类型不同，第一个int，第二个double   方法签名:getSumintdouble
        System.out.println(x+y);
    }
    void getSum(double x,int y){   //2个参数，类型不同,但顺序不一样,第一个double ,第二个int  方法签名:getSumdoubleint
        System.out.println(x+y);
    }

    public static void main(String[] args) {

    }
}
