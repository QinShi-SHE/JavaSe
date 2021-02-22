package qinshi.day16.exception_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MyException
 * @Date 2021/1/21 10:44
 */
/*
自定义异常
        1.自定义类继承Exception
        2.参考父类的构造方法来重写子类的构造方法（一个无参一个有参）
 */
public class MyException extends Exception{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
