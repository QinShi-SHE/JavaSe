package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task3
 * @Date 2021/1/6 16:06
 */
public class Task3 {
    public static void main(String[] args) {
        //4、有一个400米一圈的操场，一个人要跑10000米，第一圈50秒，
        // 其后每一圈都比前一圈慢1秒，按照这个规则计算跑完10000米需要多少秒
        int num=25;  //10000米需要跑25圈；
        int time=50;
        int sumTime=0;
        for(int i=1;i<=25;i++){
            sumTime+=time;
            time++;
        }
        System.out.println("跑一万米需要："+sumTime+"秒");
    }
}
