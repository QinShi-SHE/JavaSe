package qinshi.day13.enum_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Leve
 * @Date 2021/1/17 15:39
 */
/*
定义一个枚举，和类相似
语法：
    public enum 枚举名{
    }
作用：定义一些固定不变的值，用于替换全局常量
哪些成员
    实例变量
	实例方法
	类方法
	构造方法 - 枚举中的构造方法默认都是private修饰，不能够是public，protected修饰
		构造方法作用：只能在当前枚举类中使用，就是给当前枚举类对象初始化实例变量的

普通用法：
    枚举名.属性名

枚举类编译完成也会生成字节码文件
每一个自定义的枚举类都隐式继承于Enum抽象类，Enum继承Object
 */
public enum Leve  {
    //青铜,白银,铂金,钻石,星耀,最强王者,荣耀王者; //可以写中文，不介意
    QT,BY,HJ;

    Student s1=new Student("张三",2,Vip.Vip1.toString());
}
