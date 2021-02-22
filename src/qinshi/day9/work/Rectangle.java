package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Rectangle
 * @Date 2021/1/11 16:33
 */
public class Rectangle {
    /*
       定义一个长方形的类（Rectangle），类中定义
       两个成员变量：一个长(height)和一个宽(width)；
       定义求面积的方法：public double getArea(){方法体}
       并写测试类进行测试；
	    创建2个长方形对象，给成员变量赋值，并且调用求面积方法
     */

    int height,width;

    Rectangle(){}

    Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }

    double getArea(){
        return height*width;
    }
}
