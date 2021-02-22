package qinshi.day18.threeset_04;

import java.util.Comparator;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MyComparator
 * @Date 2021/1/24 17:01
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1==null||o2==null){//判断，若两个有一个为null都直接返回
            return 0;
        }
        if(o1 instanceof Student && o2 instanceof Student){
            Student s1=(Student)o1;
            Student s2=(Student)o2;
            if(s1.getAge()>s2.getAge()){//先判断年龄后判断姓名
                return 1;
            }else if(s1.getAge()<s2.getAge()){
                return -1;
            }else{
                return s1.getName().compareTo(s2.getName());
            }
        }
        return 0;
    }
}
