package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task4
 * @Date 2021/1/6 16:29
 */
public class Task4 {
    public static void main(String[] args) {
        //5、井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米
        //计算蜗牛需要多少天才能从井底到爬出来

        int day2 = 0;
        //56.7-5=51.5,如果最后一天刚好爬出来，则最后一天的前一天只少要爬到51.5米处
        for (; day2 * 1.5 < 51.5; ) { //只要大于51.5米，那么最后一天就不会往下掉
             day2++;
        }
        System.out.println("需要："+(day2+1)+" 天才能出来");

        //方法一
        int day=1;//天数
        double sum=0;//爬过的距离
        while(true) {
            //白天向上爬5米
            sum+=5;
            //System.out.println("day:"+day+",sum:"+sum);
            if(sum>=56.7) {//如果爬出了井
                //退出循环
                break;
            }
            //晚上掉3.5;
            sum-=3.5;
            day++;
        }
        System.out.println(day);

        //方法二
        int day3=1;
        for(double s=5;s<=56.7;s+=5){
            s-=3.5;
            day3++;
        }
        System.out.println(day3);
    }
}
