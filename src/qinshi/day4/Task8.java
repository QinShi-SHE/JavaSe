package qinshi.day4;

import java.util.Scanner;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task8
 * @Date 2021/1/4 11:25
 * 7、定义4个变量,分别表示1长方形、2正方形、3三角形、4圆形
 * 长方形有长和宽、
 * 正方形有边长、
 * 三角形有底和高、
 * 圆形有半径，
 * 计算输出指定形状的面积(使用switch结构)
 */
public class Task8 {
    public static void main(String[] args) {
        String rectangle="长方形",square="正方形",triangle="三角形",circle="圆形";
        double a,b,h,r,s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要计算面积的形状：");
        String  shape=scanner.nextLine();
        switch (shape){
            case "长方形":
                System.out.println("你选择了"+shape);
                System.out.println("请输入"+rectangle+"的长和宽：");
                a=scanner.nextDouble();b=scanner.nextDouble();
                s=a*b;
                System.out.println(rectangle+"的面积是："+String.format("%.2f",s ));
                break;
            case "正方形":
                System.out.println("你选择了"+square);
                System.out.println("请输入"+square+"的边长：");
                a=scanner.nextDouble();
                s=a*a;
                System.out.println(square+"的面积是："+String.format("%.2f",s ));
                break;
            case "三角形":
                System.out.println("你选择了"+triangle);
                System.out.println("请输入"+triangle+"的底和高：");
                a=scanner.nextDouble();h=scanner.nextDouble();
                s=(a*h)/2;
                System.out.println(triangle+"的面积是："+String.format("%.2f",s ));
                break;
            case "圆形":
                System.out.println("你选择了"+shape);
                System.out.println("请输入"+shape+"的半径：");
                r=scanner.nextDouble();
                s= 3.14*r*r;
                System.out.println(shape+"的面积是："+String.format("%.2f",s ));
                break;
            default:
                System.out.println("Sory Dont You Want Shape!");
        }
    }
}
