package qinshi.day7;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task1
 * @Date 2021/1/8 8:56
 */
public class Task1 {
    //设计一个方法,统计一个字符在字符数组中出现的次数（直接输出）
    void  getCount(){
        char[] arry={'a','b','c','e','a'};
        int count=0;
        for(int i=0;i<arry.length;i++){
            if(arry[i]=='a'){
                count++;
            }
        }
        System.out.println("a在此数组中出现："+count+"次");
    }

    //设计一个方法,统计一个字符在字符数组中出现的次数（main中输出）
    int getCont2(){
        char[] arry={'a','b','c','e','a'};
        int count=0;
        for(int i=0;i<arry.length;i++){
            if(arry[i]=='a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();

        task1.getCount(); //直接输出

        System.out.println("a在此数组中出现"+task1.getCont2()+"次"); //主方法中输出
    }
}
