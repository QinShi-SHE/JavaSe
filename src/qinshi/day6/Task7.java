package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task7
 * @Date 2021/1/6 16:58
 */
public class Task7 {
    public static void main(String[] args) {
        //4.统计一个字符'a'在字符数组char[] c = {'a','f','j','j','a','e','g'};中出现的次数	(中级 必做)
        char[] c = {'a','f','j','j','a','e','g'};
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'){
                count++;
            }
        }
        System.out.println("次数："+count);
    }
}
