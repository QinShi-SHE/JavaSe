package qinshi.day13.inner_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/17 11:33
 */
/*
匿名内部类语法
    new 接口名(){
        重写的接口方法
    };

注意：这里不是根据接口创建对象，而是是一种语法而已
 */
public class Test {
    public static void main(String[] args) {
        //不用实现类来实现接口，采用匿名内部类的方法
        new Usb(){

            @Override
            public void cha() {
                System.out.println("匿名内部类");
            }

            @Override
            public void ba() {

            }
        }.ba(); //只能使用一次

        Usb u=new Usb() {
            @Override
            public void cha() {
                System.out.println("dd");
            }

            @Override
            public void ba() {
                System.out.println("c");
            }
        };
        u.cha(); //多次使用
        u.ba();
    }
}
