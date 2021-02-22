package qinshi.day9;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StudentTest
 * @Date 2021/1/11 11:26
 */
public class StudentTest {
    /*
        创建对象：
            数据类型 对象名 = new 数据类型（）;
            数据类型：类名

         对象名不能重复
         地址值不一样，就说明是两个不同的对象

         创建的对象赋值:
                    对象名.属性=值
                取值：
                    对象名.属性=值
     */
    public static void main(String[] args) {
        //创建对象
        Student student=new Student();
        Student student2=new Student();

        System.out.println(student);  //打印输出对象，类是引用型数据类型，打印会是地址值
        System.out.println(new Student()); //地址值不一样，是两个不同的对象

        //通过对象名.属性=值
        student.name="琴师";
        student.age=22;
        student.sex='女';
        student.phoneNum=14780270332l;
        //取值
        System.out.println(student.name);
        System.out.println(student.sex);
        //拼接显示
        System.out.println("姓名："+student.name+" 年龄："+student.age+" 性别："+student.sex+" 电话号码："+student.phoneNum+" 喜欢的游戏是："+student.playGame2());

        //成员变量没有赋值的时候，返回默认值（默认值是由数据类型决定的）  成员变量可以不赋初始值
        System.out.println("姓名："+student2.name+" 年龄："+student2.age+" 性别："+student2.sex+" 电话号码："+student2.phoneNum);
        String name;
        //System.out.println(name); //报错，局部变量必须赋初始值

        //调用类中的方法:对象名.方法名();
        student.playGame(); //无返回值
        student.playGame2();//有返回值，必须要打印才能显示
        System.out.println(student.playGame2());

    }
}
