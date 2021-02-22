package qinshi.day20.generic_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName GenericTest
 * @Date 2021/1/25 16:37
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 泛型的上限下限
 * 		?号: 表示通配符,不确定的类型，可以表示任意类型【? extends Object】;
 *
 ?      extends　Number : 表示通配符 T的[上限],必须是Number及Number的子类

 ?      super    Number : 表示通配符 T的[下限],必须是Number及Number的父类
 * */
public class GenericTest4 {

    //<?  extends Number>:最高可以传入的类型是Number及其子类类型  上限最大为Number
    public static void get1(ArrayList<? extends Number> list){}

    //get2(list2);//<?  super Number> :最低可以传入本类类型Number及其父类类型    下限最低为Number
    public static void get2(ArrayList<? super Number> list){}

    public static void main(String[] args) {
        get1(new ArrayList<Integer>());
        get2(new ArrayList<Object>());

        //泛型嵌套
        ArrayList<HashMap<HashMap<String, String>, Integer>> list = new ArrayList<HashMap<HashMap<String, String>, Integer>>();
        HashMap<HashMap<String, String>, Integer> map = new HashMap<HashMap<String, String>, Integer>();
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("姓名", "琴师");
        map.put(map1, 2020);
        list.add(map);
        System.out.println(list);
        for (HashMap<HashMap<String, String>, Integer> hashMap : list) {
            System.out.println(hashMap);
            Set<Map.Entry<HashMap<String, String>, Integer>> set = hashMap.entrySet();
            for (Map.Entry<HashMap<String, String>, Integer> entry : set) {
				/*System.out.println(entry);
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());*/
                HashMap<String, String> key = entry.getKey();
                Set<Map.Entry<String, String>> set2 = key.entrySet();
                for (Map.Entry<String, String> entry2 : set2) {
                    System.out.println(entry2.getKey());
                    System.out.println(entry2.getValue());
                }
                //值
                System.out.println(entry.getValue());
            }
        }
    }
}
