package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName People2Test
 * @Date 2021/1/11 19:33
 */
public class People2Test {
    //编写一个程序，输出2个人的基本信息。将每个人的姓名、性别和年龄参数的值传递给构造方法，并显示出相应的信息。
    public static void main(String[] args) {
        People2 p1=new People2("逆天而行",'男',25);
        People2 p2=new People2("随风起舞",'女',22);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
