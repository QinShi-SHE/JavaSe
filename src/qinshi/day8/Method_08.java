package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_08
 * @Date 2021/1/9 14:36
 */
public class Method_08 {
    /*
        方法签名：方法名+参数列表【参数的个数 参数的顺序 参数的类型】
        方法重载：在同一个类中，方法名相同，参数列表不同的方法称为方法的重载。
     */

    //1.无参数无返回值
    void getSum1(){  //方法签名：getSum1
        System.out.println(1+2);
    }
    //2.有参数无返回值
    void getSum2(int a,int b){   //方法签名：getSum2int
        System.out.println(a+b);
    }
    //3.无参有返回值
    int getSum3(){   //方法签名：getSum3
        return 1+2;
    }
    //4.有参有返回值
    int getSum4(int a,int b){   //方法签名：getSum4int
        return a+b;
    }

    public static void main(String[] args) {

    }
}
