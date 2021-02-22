package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ForDemo
 * @Date 2021/1/5 16:22
 */
public class ForDemo {
    /*
以下两个示例中 最后i的值是多少 判断执行了几次 循环几次 代码的最终的输出结果是多少？

(1)
for(int i = 1;i<=10;i+=2){
System.out.println("i="+i);
}

（2）
for(int j = 1;j++<=10;j+=2){
	System.out.println("j="+j);
}
     */
    public static void main(String[] args) {
        //最后i的值是多少 判断执行了几次 循环几次 代码的最终的输出结果是多少？
        /**
         * 执行的流程：
         * i的值是多少    判断执行了几次   循环几次   最终的输出结果
         *  i=1             1           1        1
         *  i=3             2           2        3
         *  i=5             3           3        5
         *  i=7             4           4        7
         *  i=9             5           5        9
         *  i=11            6
         */
        int i=1,count1=0;
        for(;i<=10;i+=2){
            System.out.println("i="+i);
        }
        System.out.println("最后的i值"+i);

        System.out.println("*************************");

        //最后i的值是多少 判断执行了几次 循环几次 代码的最终的输出结果是多少？
        /**
         * 执行的流程：
         * j的值是多少    判断执行了几次   循环几次   最终的输出结果
         *  j=1             1           1        2
         *  j=4             2           2        5
         *  j=7             3           3        8
         *  j=10            4           4        11
         *  j=13            5(判断一次，j++,增加一次，所以最后j=14)
         */
        int j=1;
        for(;j++<=10;j+=2){
            System.out.println("j="+j);
        }
        System.out.println("最后j的值"+j);
    }
}
