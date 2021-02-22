package qinshi.day24.interface_1;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName UsbImp
 * @Date 2021/2/2 9:35
 */
public class UsbImp implements Usb{  //实现类
    @Override
    public void get() {
        System.out.println("接口重写的方法");
    }
}
