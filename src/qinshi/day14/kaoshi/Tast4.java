package qinshi.day14.kaoshi;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Tast4
 * @Date 2021/1/18 19:31
 */
public class Tast4 {
    public static void main(String[] args) {
        /*
        题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
        第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下   的一半零一个。
        到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
         */
        int x=1;
        int day=9;
        while (day>0){
            x+=1;
            x*=2;
            day--;
        }
        System.out.println(x);
    }





}
//class A {
//    public static void prt() {
//        System.out.println("1");
//    }
//    public A() {
//        System.out.println("A");
//    }
//}
// class B extends A {
//    public static void prt() {
//        System.out.println("2");
//    }
//    public B() {
//        System.out.println("B");
//    }
//    public static void main(String[] args) {
//        A a = new B();
//        a = new A();
//    }
//}
class Parent {
    protected String value = "123";
    public String getValue() {
        return value;
    }
}
class Child extends Parent {
    protected String value = "456";
    public static void main(String[] args){
        Child c=new Child();
        System.out.println(c.getValue());
    }
}
class Animal{
    String name = "物种";
    Animal(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
class Pig extends Animal{
    String name;
    Pig(String name){
        super(name);
    }
    public String toString(){
        return name;
    }
}
 class B{
    public static void main(String[] args) {
        Animal pig = new Pig("小猪");
        pig.setName("渣渣");
        System.out.println(pig.name);
    }
}
