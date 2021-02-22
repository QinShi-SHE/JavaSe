package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task6
 * @Date 2021/1/6 16:47
 */
public class Task6 {
    public static void main(String[] args) {
        //7、打印100-999之间的水仙花数。所谓的水仙花数是指一个三位数，每一位数的立方和等于该数本身。
        // 例如：153 = 1*1*1 + 5*5*5 + 3*3*3
        int a,b,c;
        for(int i=100;i<=999;i++){
            a=i%10;
            b=(i/10)%10;
            c=(i/100)%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}
