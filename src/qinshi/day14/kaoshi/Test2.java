package qinshi.day14.kaoshi;

import javax.sound.midi.Soundbank;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test2
 * @Date 2021/1/18 19:00
 */
public class Test2 {
    public static void main(String[] args) {
        /*
        4，请以计算圆形(πr2)、矩形（长*宽）和三角形（低*高/2）三种几何图形的面积为例，列出关键代码。
         */

        int r=2; //半径
        int a=2;//长或低
        int b=2;//宽
        int h=2;//高

        System.out.println("圆形面积："+3.14*r*r);
        System.out.println("矩形面积："+a*b);
        System.out.println("三角形面积："+(a*h)/2);
    }
}
