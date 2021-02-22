package qinshi.day20.generic_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName GenericTest3
 * @Date 2021/1/27 11:08
 */

import java.util.Arrays;

/**
 * 2. 泛型方法
 *		语法：在修饰符后，返回值前加上<数据类型>
 *
 * 需求1：
 * 	请设计一个方法，合并两个相同数据类型的数组，并且升序排序，然后返回该数组
 * 分析：
 * 	1. 数组类型不确定，就要用泛型
 * 	问题：
 * 		1. 静态方法是在类加载的时候，就加载到静态区，这里要求T必须是已知的类型 =>泛型方法解决
 * 		2. new 后面必须是具体的数据类型，不能是泛型	=》用Arrays.copyOf()解决
 */
public class GenericTest3 {
    public static void main(String[] args) {
        Integer[] t1 = {1,2,4,34,6};
        Integer[] t2 = {1,67,4,2344,69};
        Integer[] array = mergeArray(t1, t2);
        System.out.println(Arrays.toString(array));

    }
    //定义一个泛型方法  要么用static<T>，要么就在类名后面加 GenericTest3<T>
    public static<T> T[] mergeArray(T[] t1,T[] t2) {
        if(t1==null || t2==null){
            throw new NullPointerException("错误！数组为null了");
        }

        //T[] newArr = new T[t1.length+t2.length];  // 不能这样，new 后面必须是具体的数据类型

        //使用Arrays数组扩容方法copyOf，将t1直接扩容，并且复制了t1中的元素到新数组
        T[] newArr = Arrays.copyOf(t1, t1.length+t2.length);

        //将数组t2中元素复制到新数组,
        System.arraycopy(t2,0,newArr,t1.length,t2.length);

        //排序数组的元素
        Arrays.sort(newArr);
        return newArr;
    }
}
