package qinshi.day14.integer_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IntegerTest3
 * @Date 2021/1/18 11:40
 */
/*
享元模式(Integer有效，int无效)
    将【-128-127】这个范围的值，放入到缓存区,在赋值的时候，只要这个值没有超过缓存范围，就不会创建新对象，都是指向的同一个地址值
    只要数字超过了范围，就会创建新对象
 */
public class IntegerTest3 {
    public static void main(String[] args) {
        //范围之内
        Integer a=17;
        Integer b=17;
        System.out.println(a==b);          //true
        System.out.println(a.equals(b));   //true

        //超过了范围
        Integer a1=177;   //这里改成，int，==就是true
        Integer b1=177;
        System.out.println(a1==b1);          //false
        System.out.println(a1.equals(b1));   //true

        //明确的创建了新对象
        Integer i1=new Integer(222);
        Integer i2=new Integer(222);
        System.out.println(i1==i2);         //false
        System.out.println(i1.equals(i2));  //true
    }
}
