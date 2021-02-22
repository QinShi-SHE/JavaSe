package qinshi.day12.work;

import javax.sound.midi.Soundbank;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName HashCode_Equals
 * @Date 2021/1/15 18:43
 */
public class HashCode_Equals {
    /*
        如果两个对象equals相等，hashCode值是否相等？
            假如这个类没有重写equals方法，如果两个对象值相同(x.equals(y) == true)，那么那么它们的hashCode值一定要相同；
            但是如果重写equals方法，没有重写hashCode的方法，就会出现不相等的情况。
        如果两个对象hashCode相等，equals值是否相等？
            不一定，两个对象的hashCode（）相同，equals（）不一定为true
     */
    public static void main(String[] args) {

        //两个对象hashCode相等，equals值不一定相等
        String str1 = "通话";String str2 = "重地";
        System. out. println(str1. hashCode());    //1179395
        System.out.println(str2. hashCode());     //1179395
        System. out. println(str1. equals(str2));  //false
        /*
        两个字符串的hashCode（）相同，但是equals（）却为false
        因为在散列表中，hashCode（）相等即两个键值对的哈希值相等，然而哈希值相等，并不一定就是它们的键值对相等。
         */


        //== 和 equals又有什么区别呢？
        /*
             ==：
                基础数据类型，  比较的是值
                引用数据类型，  比较的是地址值
            equals:
                没重写之前：比较的是一直都是值
                重写之后： 比较的是对象的属性值
         */
        String x = "string";
        String y = "string";
        String z = new String("string");
        System.out.println(x==y); // true
        System.out.println(x==z); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true
        /*
        由上我们可以看出，因为x和y指向的是同一个引用，所以==也是true，
        而new String()方法则重写开辟了新的内存空间， 所以==结果为false，而equals比较的一直是值，所以结果都为true。
         */
        class Cat{
            String name;
            Cat(String name){this.name=name;}
        }

        Cat c1=new Cat("张三");
        Cat c2=new Cat("张三");
        System.out.println(c1);  //打印出来是地址值
        System.out.println(c2);  //打印出的地址值不一样，因为是两个不同的对象
        System.out.println(c1==c2);               //false
        System.out.println(c1.equals(c2)+"\n");  //他们比较的是两个对象的地址值，由于是两个不同的对象，地址值肯定不同，所以结果为false

        String s1="张三";
        String s2="张三";
        System.out.println(s1);  //打印出来是值
        System.out.println(s2);  //打印出来的值相同
        System.out.println(s1==s2);              //true
        System.out.println(s1.equals(s2)+"\n"); //他们比较的是两个字符串的值，由于值相等，所以结果为true

        String s3=new String("张三");
        String s4=new String("张三");
        System.out.println(s3); //打印出来是值
        System.out.println(s4); //打印出的值相同
        System.out.println(s3==s4);          //false
        System.out.println(s3.equals(s4));   //true
    }
}
