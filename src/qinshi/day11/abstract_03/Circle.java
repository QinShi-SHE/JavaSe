package qinshi.day11.abstract_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Circle
 * @Date 2021/1/14 14:22
 */

public class Circle extends AbstractGraph {  //重写了所有抽象方法
    /*
        圆形
     */
    double r=3;
    double PI=3.13;

    @Override
    public void getArea() {
        System.out.println(PI*r*r);

    }

    @Override
    public int getArea2() {
        return 0;
    }

    public static void main(String[] args) {
        Circle c=new Circle();
        c.getArea();
    }
}
