package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Point
 * @Date 2021/1/17 11:15
 */
/*
定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，
2个构造器Point()和Point(intx0,y0),以及一个movePoint（int dx,int dy）方法实现点的位置移动，
创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。
 */
public class Point {
    private int x,y;
    Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void movePoint(int x,int y){
        this.x+=x;
        this.y-=y;
    }

    public static void main(String[] args) {
        Point p1=new Point(2,3);
        Point p2=new Point(3,2);
        p1.movePoint(1,1);
        p2.movePoint(2,2);
        System.out.println(p1.x+","+p1.y);
        System.out.println(p2.x+","+p2.y);
    }
}
