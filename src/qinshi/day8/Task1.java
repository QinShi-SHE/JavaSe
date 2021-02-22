package qinshi.day8;


import java.util.Arrays;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task1
 * @Date 2021/1/8 16:29
 */
public class Task1 {

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

    int getCont(char[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                count++;
            }
        }
        return count;
    }

    void getSum(){
        int[] arr2 = {1,2,3,4,5,6,7,8,9,11,22};
        int sumJ=0;
        int sumO=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]%2==0){
                sumO+=arr2[i];
            }else {
                sumJ+=arr2[i];
            }
        }
        System.out.println("偶数和："+sumO);
        System.out.println("奇数和："+sumJ);
    }

    int getMax(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }

    int getMin(int a,int b,int c){
        int min=a;
        if(min>b){
            min=b;
        }
        if(min>c){
            min=c;
        }
        return min;
    }

    int getCj(int[] arr){
        int cj=1;
        for(int i=0;i<arr.length;i++){
            cj*=arr[i];
        }
        return cj;
    }

    int getCj2(int...x){
        int cj=1;
        for(int i: x){
            cj*=i;
        }
        return cj;
    }

    int getArryMax(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                if(arr[i]>arr[i+1]){
                    max=arr[i];
                }
            }else{
                if(arr[arr.length-1]>max){
                    max=arr[arr.length-1];
                }
            }
        }
        return max;
    }

    int getCharIndex(){
        int counts=0;
        char[] arr={'c','b','a','d','a','c'};
        for (int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                counts++;
                break;
            }
        }
        return counts;
    }

    int getCharCounts(){
        int counts=0;
        char[] arr={'a','b','a','d','a','c'};
        for (int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                counts++;
            }
        }
        return counts;
    }

    int getJiShuSum(){
        int sum=0;
        int[] arr = {1,2,3,4,5,6,7,8,9,11,12};
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }

    void getCount(double[] arry){
        int a=0,b=0,c=0;
        for(int i=0;i<arry.length;i++){
            if(arry[i]>0 && arry[i]<=60){
                a++;
            }
            if(arry[i]>60 && arry[i]<=80){
                b++;
            }
            if(arry[i]>80 && arry[i]<=100){
                c++;
            }
        }
        System.out.println("0~60有"+a+"人");
        System.out.println("60~80有"+b+"人");
        System.out.println("80~100有"+c+"人");
    }

    String getArry(int[] arr){
        int temp;
        for(int i=0;i<arr.length/2;i++){  //两两交换，第一个和最后一个交换，只需要交换一半的数组
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return Arrays.toString(arr);
    }

    void getArry(){
        int[] arr = {1,2,3,4,5,1,9,4,12,67,1};
        int[] arr2=new int[8];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int x : arr2){
            System.out.print(x+"\t");
        }
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();

        //设计一个方法,统计一个字符在字符数组中出现的次数（直接输出）
        task1.getCount(); //直接输出

        //设计一个方法,统计一个字符在字符数组中出现的次数（main中输出）
        System.out.println(task1.getCont(new char[]{'a','b','c','e','a'}));

        // int[] arr = {1,2,3,4,5,6,7,8,9,11,22}， 计算出其中的奇数和以及偶数和
        task1.getSum();

        //定义一个方法getMax，接收两个int参数，返回较大的一个数。
        System.out.println(task1.getMax(9,99));

        //定义一个方法，接受三个int参数，返回最小的一个数。
        System.out.println(task1.getMin(4,3,6));

        //设计一个方法求多个整数积的方法(数组)
        int cj=task1.getCj(new int[]{1,2,4,3});
        System.out.println(cj);

        //定一个求多个整数积的方法（使用可变参数完成）;
        System.out.println(task1.getCj2(1,2,4,5,5,9));

        //设计一个方法，传入一个int的数组，返回该数组中最大的值(中级)
        System.out.println(task1.getArryMax(new int[]{1,3,2,5,6,1}));

        //设计一个方法，查询并返回一个字符在字符数组中第一次出现的位置(高级)
        System.out.println(task1.getCharIndex());

        //设计一个方法,统计返回一个字符在字符数组中出现的次数(高级)
        System.out.println(task1.getCharCounts());

        //设计一个方法,已知这样的整形数组  int[] arr = {1,2,3,4,5,6,7,8,9,11,12}返回其中的奇数和
        System.out.println(task1.getJiShuSum());

        //现在有数组 double[] scores = {11,34,76,77,88,99,58,97,56};定义一个方法统计并打印出每一个阶段学生人
        //数(分段方式：0-60;60-80;80-100)(高级)
        task1.getCount(new double[]{11,34,76,77,88,99,58,97,56});

        //设计一个方法，传入一个int数组，翻转该数组中的元素，并且返回反转后的数组
        System.out.println(task1.getArry(new int[]{1,2,3,4,5,6}));


        //移除数组int[] arr = {1,2,3,4,5,1,9,4,12,67,1};中1这个元素，
        //返回一个新的数组 （不带有1）；即新数组为int[] arr2 ={2,3,4,5,9,4,12,67};
        task1.getArry();
    }
}
