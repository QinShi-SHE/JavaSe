package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AutoAdd
 * @Date 2021/1/3 14:14
 */
public class AutoAdd {
    public static void main(String[] args) {
        /*
                自增自减运算符：
                    自增 ++
                    自减 --

                注意，自增、自减运算符只能对变量有效，常量不能使用

                目的：将变量的数据自增加1或者减1

                语法：
                    int i=1;
                    i++
                    ++i
                    最终结果i都为2
                 如果++i在变量名前面，先自增，在赋值
                 如果i++在变量名后面，先赋值，再自增
         */

        //常规
        int i=1;
        i++;
        System.out.println(i);
        int i1=1;
        ++i1;
        System.out.println(i1);

        //特殊
        int a=10;
        a++; //a++=10,a=11
        System.out.println(a++); //a++=11
        System.out.println(a); //a=12

        int b=10;
        ++b; //++b=11,b=11
        System.out.println(++b); //++b=12
        System.out.println(b); //b=12

        //面试题
        int i2 = 3;
        i2 = i2++;  //i2++=3,i2=3,
        System.out.println("i2 = " + i2); //3

        int b2=3,b3;
        b3=b2++; //b3=3,b2=4,b2++=3

        int i3 = 3;
        i3 = ++i3;
        System.out.println("i3 = " + i3); //4

//        int i = 3;
//        int a = i++ + i++ + i++;
//        int b = ++i + ++i + ++i;
//        System.out.println(“i=” + i);
//        System.out.println(“a=” + a);
//        System.out.println(“b=” + b);

        int e=5;
        e++; //e=6
        System.out.println("e="+e); //6
        ++e;  //e=7
        System.out.println("e="+e); //7
        int f=++e; //f=8
        System.out.println("f="+f); //8
        f = f++; //f=8
        System.out.println("f="+f); //8
        f = ++f; //9
        System.out.println("f="+f); //9



    }
}
