package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_8
 * @Date 2021/1/6 15:02
 */
public class AarryDemo_8 {
    /*
        数组的遍历
            1.普通for循环
            2.增强for循环:
                for(数组类型 变量名 : 数组名字){}
                作用： 主要是用来遍历数组和集合的；
                缺点： 没有索引，凡是涉及有索引相关操作还是用普通for循环;

语法结构
for(源中元素类型   e  ： 源 ){
	直接使用e就可以了
}
源 ：可以是***\*数组\****或者集合（Iterable接口的实现类）
e  :  形式参数,每次从源中遍历的数据,都临时存放在里面,可以在循环内部,通过e使	用到每一个元素

     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        for(int i : arr){
            System.out.println(i);
        }
    }
}
