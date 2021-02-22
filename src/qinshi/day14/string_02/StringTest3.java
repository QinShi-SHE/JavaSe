package qinshi.day14.string_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringTest3
 * @Date 2021/1/18 15:48
 */
/*
字符串创建对象和常量池
    在创建一个字符串以后，会先把这个值放入了到常量池中，下一次创建时，赋值的时候，先去常量池中看看有没有这个值，
    有就直接引用，没有就会创建新的地址
 */
public class StringTest3 {
    public static void main(String[] args) {
        String s1="123";
        String s2="123"; //这两句话创建了一个对象
        System.out.println(s1==s2); //地址值还是同一个
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3="1"+"23"; //拼接为123，常量池中没有创建新对象
        System.out.println(s1==s3);  //true
        System.out.println(s1.equals(s3));

        String s4="1";
        String s5=s4+"23"; //地址值+某一个值 //会创建一个新地址值
        System.out.println(s1==s5); //false
        System.out.println(s1.equals(s5)); //true

        String s=new String("111");//创建一个或二个对象，如果111，在上下文（常量池)里有，则只创建一个对象；没有就是创建两个对象；new 必创建一个对象
    }
}
