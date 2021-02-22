package qinshi.day11.equas_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/14 16:32
 */
public class Test {
    /*
        判断对象是否相等

        1.== :
        比较基本数据类型:    比较的就是值是否相等;
        比较引用数据类型:    比较的是对象的地址是否相等
        2. equals 只能用于引用类型
        根据实际业务比较两个对象是否相等。默认是不重写是==比较。在实际开发中,我们一般比较对象都是通过对象的属性值进行比较(一般比较对象的地址没有多大用处),所以我们会覆写Object中的此方法,把自己的判断机制写在方法里面;
     */
    public static void main(String[] args) {
        Student stu1=new Student("张三",19);
        Student stu2=new Student("张三",19);

        System.out.println(stu1==stu2);  //== 比较引用型数据类型，是比较对象的地址是否相等
        System.out.println(stu1.equals(stu2));
    }
}
