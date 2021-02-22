package qinshi.day13.code_04;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/17 14:28
 */
public class Test {
    /*
    代码块 {} 首先想到的就是作用域的问题

    静态代码块
        语法：
            static{
            //可以写很多代码
            }
        作用：优先加载，只会执行一次
        优先于主方法
    普通代码块
        {
        }
    构造代码块
        {
        }
     */
    static int b;
    static {  //静态代码块
        int a=10;
        b=2;
    }

    {
        System.out.println("构造代码块"); //构造代码块，与构造方法类似
    }

    Test(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(b);
        {
            System.out.println("普通代码跨");
        }
        new Test();
    }

    static { //静态代码块
        System.out.println(111); //优先执行
    }
}
