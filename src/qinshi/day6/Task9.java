package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task9
 * @Date 2021/1/6 18:26
 */
public class Task9 {
    public static void main(String[] args) {
        /*
            现有如下的数组			（有点难）
          int[] oldArr = {1,3,4,5,6,6,0,5,6,7,0,5};
          取出以上数组不为0的值，然后将不为0的值存入一个新的数组，生成新的数组为：
          int[] newArr = {1,3,4,5,6,6,5,6,7,5}
         */
        int[] oldArr = {1,3,4,5,6,6,0,5,6,7,0,5};
        int count=0;
        int[] newArr= new int[10];
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
               newArr[count]=oldArr[i];
                count++;
            }
        }
        for (int i : newArr){
            System.out.print(i+"\t");
        }
    }
}
