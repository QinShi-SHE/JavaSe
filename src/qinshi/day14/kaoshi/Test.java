package qinshi.day14.kaoshi;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/18 18:17
 */
public class Test {
    public static void main(String[] args) {
      /*
      给出一组学生的成绩int[] score={80,45,60,100,89,92,93,...}请求出这组成绩中，100分，90-99，80-89的学生人数。
       */
        int[] score={80,45,60,100,89,92,93};
        int a=0; //100分人数
        int b=0; //90-99分人数
        int c=0; //80-80分人数
        for(int i: score){
            if(i==100)
                a++;
            if(i>=90&&i<=99)
                b++;
            if(i>=80&&i<=89)
                c++;
        }
        System.out.println(a+"\n"+b+"\n"+c);
    }

}


