package qinshi.day7;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task3
 * @Date 2021/1/8 11:11
 */
public class Task3 {
    /*
          现在有数组 double[] scores = {11,34,76,77,88,99,58,97,56};
          定义一个方法统计并打印出每一个阶段的学生人数(分段方式:0-60; 60-80;80-100)
     */
    public static  void getCount(double[] arry){
        int a=0,b=0,c=0;
        for(int i=0;i<arry.length;i++){
            if(arry[i]>0 && arry[i]<=60){
                a++;
            }
            if(arry[i]>60 && arry[i]<=80){
                b++;
            }
            if(arry[i]>80 && arry[i]<=100){
                c++;
            }
        }
        System.out.println("0~60有"+a+"人");
        System.out.println("60~80有"+b+"人");
        System.out.println("80~100有"+c+"人");
    }
    public static void main(String[] args) {
       getCount(new double[]{11,34,76,77,88,99,58,97,56});
    }
}
