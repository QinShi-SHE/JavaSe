package qinshi.day8;


import java.util.HashSet;
import java.util.Set;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_02
 * @Date 2021/1/9 9:31
 */
public class Method_02 {
    /*
    自定义方法
            public：非必须
            static：非必须
            返回值类型 ：没有写void
            方法名: 必须
            ()    : 必须
            String[] args: 根据实际需要 可以有 也可以没有
     */

    static  void getAge(){
        System.out.println("你是憨憨");
    }

    void getSum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
       Method_02 method_02=new Method_02();
       method_02.getSum(3,5);
    }
}
