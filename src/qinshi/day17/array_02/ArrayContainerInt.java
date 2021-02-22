package qinshi.day17.array_02;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ArrayContainer2
 * @Date 2021/1/22 10:34
 */
public class ArrayContainerInt {
    int[] arr;
    int index=0;  //数组下标

    public ArrayContainerInt() {  //创建固定长度的数组的构造方法
        this(5);  //巧用this,调用下面那个构造方法，传入5，跟下面一句一样
        //arr=new int[5];
    }
    public ArrayContainerInt(int length) {  //创建指定长度的数组的构造方法
        arr=new int[length];
    }
    //提供添加数据的方法
    public void add(int num){
//        if(index<=arr.length){
//            arr[index]=num;
//            index++;
//        }else {
//            int[] newArr=new int[arr.length*2];
//            System.arraycopy(arr,0,newArr,0,arr.length);
//            arr=newArr;
//            arr[index++]=num;
//        }

        //上下两种方法一个意思
        if(index==arr.length){  //如果下标等于数组的长度，就是原数组已经装满了
            //创建新数组使长度翻倍
            int[] newArr=new int[arr.length*2];
            //旧数组赋值给新数组
            System.arraycopy(arr,0,newArr,0,arr.length);
            arr=newArr;
        }
        arr[index++]=num;  //先赋值，后增1，跟下面两句一样
//        arr[index]=num;
//        index++;
    }

    //提供一个获取数组的大小
    public int getIndex(){
        return index;
    }

    //重写toString方法，方便打印对象，得到想要的结果
    @Override
    public String toString() {
        //返回新数组，将原来的数组，和已经赋值了的长度，复制给新数组
        return Arrays.toString(Arrays.copyOf(arr,index));
        //return Arrays.toString(arr);  //如果是这样，会打印出没有赋值的下标，没有赋值，默认为0
    }
}
