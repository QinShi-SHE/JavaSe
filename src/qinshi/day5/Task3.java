package qinshi.day5;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task3
 * @Date 2021/1/4 19:32
 * 10到30之间所有奇数的和（用for实现）
 */
public class Task3 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("10到30之间所有奇数有：");
        for(int i=10;i<31;i++){
            if(i%2 !=0){
                sum+=i;
                if(i!=29)
                    System.out.print(i+"、");
                else
                    System.out.print(i+"\n");
            }
        }
        System.out.println("所以10到30之间所有奇数的和="+sum);
    }
}
