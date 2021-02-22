package qinshi.day13.enum_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/17 15:44
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Leve.QT);
        System.out.println(Vip.Vip1);

        //枚举搭配switch使用
        Vip vip=Vip.Vip1;
        switch (vip){
            case Vip1:
                System.out.println("贵族1");
                break;
            case Vip2:
                System.out.println("贵族2");
                break;
            case Vip3:
                System.out.println("贵族3");
                break;
        }
    }
}
