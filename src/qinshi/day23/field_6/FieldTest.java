package qinshi.day23.field_6;

import org.junit.Test;
import qinshi.day23.user.User;

import java.lang.reflect.Field;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FieldTest
 * @Date 2021/1/31 14:18
 */
/*
字段		获取字段 的目的就是为了被 对象或者 类  赋值取值
					Field[] fields = clazz.getFields() 获取public修饰的字段
					Field[] fields = clazz.getDeclaredFields() 获取任意权限所有字段
					Field field = clazz.getDeclaredField(String fieldName) 根据字段名获取任意访问权限的指定字段
					Field field = clazz.Field(String fieldName）根据字段名获取public的指定字段

				//通过当前的字段对象:
					给某一个字段取值
				  	field.get(Object obj);//如果是属于非static，就传入一个对象，如果是静态的，就传入null
				  		obj：对象
					//给某一个字段赋值
					field.set(Object obj, Object value);//如果是属于非static，就传入一个对象，如果是静态的，就传入null
				  		obj：对象
						value：值
 */
public class FieldTest {
    @Test
    public void test() throws Exception{
        //获取字节码对象
        Class u= User.class;

        //获取公共的属性
        Field f1=u.getField("sex");
        System.out.println(f1);

        Field[] f2=u.getFields();
        for(Field i: f2 ){
            System.out.println(i);
        }


        //获取私有的属性
        Field f3=u.getDeclaredField("name");
        System.out.println(f3);

        System.out.println();
        //创建对象，设置属性值和获取值
        Object obj=u.newInstance();
        //给属性设置值
        f1.set(obj,'a');
        //取值
        Object value=f1.get(obj);
        System.out.println(value);

        //给static修饰的属性，设置值和获取  不需要创建对象，设置为null
        Field  f4=u.getField("b");
        f4.set(null,12);
        System.out.println(f4.get(null));

        //给私有化的属性设置值
        //取消访问权限
        f3.setAccessible(true);
        f3.set(obj,"琴师");
        System.out.println(f3.get(obj));
    }
}
