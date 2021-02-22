package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task1
 * @Date 2021/1/3 12:07
 */
public class Task1 {
    public static void main(String[] args) {
        int  grade = 96;
        System.out.println("当前成绩:"+grade);
        int grade2 = (int) (grade * (1+0.2));
        System.out.println("加20%后的成绩:"+grade2);

        int menoy=1000;
        System.out.println("当前价格："+menoy);
        System.out.println("八折后："+(int)(menoy*0.8));
    }
}
