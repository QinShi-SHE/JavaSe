package qinshi.day17.array_02;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ArrayContainerObeject
 * @Date 2021/1/22 11:27
 */
public class ArrayContainerObeject {
    Object[] arr;  //定义一个能装任意类型的对象数组
    int index=0;  //数组下标，已经赋了值的下标

    public ArrayContainerObeject() {  //创建固定长度的数组的构造方法
        this(5);  //巧用this,调用下面那个构造方法，传入5，跟下面一句一样
        //arr=new int[5];
    }
    public ArrayContainerObeject(int length) {  //创建指定长度的数组的构造方法
        arr=new Object[length];
    }
    //提供添加数据的方法
    public void add(Object num){
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
            Object[] newArr=new Object[arr.length*2];
            //旧数组赋值给新数组
            System.arraycopy(arr,0,newArr,0,arr.length);
            arr=newArr;
        }
        arr[index++]=num;  //先赋值，后增1，跟下面两句一样
//        arr[index]=num;
//        index++;
    }

    //查找  指定索引  处的 元素
    public Object findByIndex(int index){
        if(index<0||index>=arr.length){
            //主动抛出异常！！！
            throw new ArrayIndexOutOfBoundsException("错误！数组下标越界！");
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                return arr[i];
            }
        }
        return -1;  //没有找到
    }

    //查找 指定元素 第一次出现的  索引
    public int findFirstElement(Object object){
        for (int i = 0; i <arr.length ; i++) {
            if(object.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }

    //删除指定索引处的元素
    public void deleteByIndex(int index){
        if(index<0||index>=arr.length){
            //主动抛出异常！！！
            throw new ArrayIndexOutOfBoundsException("错误！数组下标越界！");
        }
        //从指定元素的位置后面开始复制，复制到原数组的指定元素位置，长度为指定元素后面的个数
        System.arraycopy(arr,index+1,arr,index,this.index-index-1);
        //不打印最后一个值
        this.index--;
    }

    //删除指定的第一个元素
    public void deleteFirstElement(Object object){
        //先查找指定元素第一次出现的下标
        int index=findFirstElement(object);
        //再根据指定下标来删除元素
        deleteByIndex(index);
    }

    //提供一个获取数组的大小
    public int getIndex(){
        return index;
    }

    //重写toString方法，方便打印对象，得到想要的结果
    @Override
    public String toString() {
        //返回新数组，将原来的数组，和已经赋了值的长度，复制给新数组
        return Arrays.toString(Arrays.copyOf(arr,index));
        //return Arrays.toString(arr);  //如果是这样，会打印出没有赋值的下标，没有赋值，默认为0
    }
}
