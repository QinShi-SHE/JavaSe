package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task13
 * @Date 2021/2/18 20:51
 */
/*有4个方法，方法名相同，参数类型分别为Object,Long,Integer,String,如果传入一个int类型的参数，哪些方法会执行？*/
public class Task13 {
    @Test
    public void test() throws Exception{
        System.out.println(getValue(1));
    }

    Object getValue(Object o){
        return o;
    }
    Long getValue(Long l){
        return l;
    }
    Integer getValue(Integer integer){
        return integer;
    }
    String getValue(String s){
        return s;
    }
}
