package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Rectangle
 * @Date 2021/1/17 11:22
 */
/*
定义一个矩形类Rectangle：（知识点：对象的创建和使用）
定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
有2个属性：长length、宽width
通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
创建一个Rectangle对象，并输出相关信息
 */
public class Rectangle {
    int width;
    int length;
    public Rectangle(){}

    int getArea(){
       return width*length;
    }

    int getPer(){
       return (width+length)*2;
    }

    void showAll(){
        System.out.println("长："+length+" 宽："+width+" 面积"+getArea()+" 周长："+getPer());
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
}
