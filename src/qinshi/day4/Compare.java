package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Compare
 * @Date 2021/1/3 11:50
 */
public class Compare {
    public static void main(String[] args) {
        /*
            比较运（关系）算符
                ==  !=  >  <  >=  <=
                返回true或flase

            =  表示赋值
            ==  表判断两个值是否相等，返回true或flase
        */

        System.out.println(1==1); //true
        System.out.println(1!=1); //flase
        System.out.println(1>=1); //true
        System.out.println(1<=1); //true
        System.out.println(1>1);  //flase
        System.out.println(1<1); //flase

        System.out.println(0/1.1);
        System.out.println(1/0); //运行会报错，除数不能为零
    }
}
