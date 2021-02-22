package qinshi.day5;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task1
 * @Date 2021/1/4 16:12
 */
public class Task1 {
    public static void main(String[] args) {
        int num=0;
        for (int i=1;i<=20;i++){
            if(i%3==0){
                System.out.println(i);
                num++;
            }
        }
        System.out.println("20以内3的倍数有:"+num+"个");
    }
}
