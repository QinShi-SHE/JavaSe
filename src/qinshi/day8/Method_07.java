package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_07
 * @Date 2021/1/9 14:26
 */
public class Method_07 {
    /*
        已知这样的整型数组 int[] arr = {1,2,3,4,5,6,7,8,9,11,22}， 计算出其中的奇数和以及偶数和  返回结果到主方法中
     */

    int[] getSum(){  //数组类型的方法
        int[] arr = {1,2,3,4,5,6,7,8,9,11,22};
        int sum1=0;
        int sum2=0;
        for(int i : arr){
            if(i%2==0){
                sum1+=i;
            }else {
                sum2+=i;
            }
        }
        int[] sum={sum1,sum2};
        return sum; //返回数组类型
    }
    public static void main(String[] args) {
        Method_07 method_07=new Method_07();
        for(int i: method_07.getSum()){
            System.out.println(i);
        }
    }
}
