package qinshi.day17.array_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ContainerObject
 * @Date 2021/1/22 11:30
 */
public class ContainerObject {
    public static void main(String[] args) {
        ArrayContainerObeject obeject=new ArrayContainerObeject();
        //可以传所有的数据类型，和任意个数
        obeject.add(1);       //int
        obeject.add('a');     //char
        obeject.add("字符串"); //String
        obeject.add(true);    //boolean
        obeject.add(1.1);    //double
        obeject.add(new int[]{1,3,5});  //数组

        System.out.println( obeject.getIndex());
        System.out.println(obeject);

        //根据索引值找元素
        System.out.println(obeject.findByIndex(3));
        //根据元素找第一次出现的索引值
        System.out.println(obeject.findFirstElement(true));

        //删除索引为0的值
        obeject.deleteByIndex(0);
        System.out.println(obeject);

        //删除值为‘a'的第一个元素
        obeject.deleteFirstElement('a');
        System.out.println(obeject);
    }
}
