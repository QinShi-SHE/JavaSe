package qinshi.day16.exception_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ExceptionTest4
 * @Date 2021/1/21 10:47
 */
/*
主动跑出异常
    在
 */
public class ExceptionTest4 {
    //抛出异常
    public static void checkName() throws MyException{
        String str="时光，久远，依旧";
        String s="久远";
        if(str.contains(s)){
            throw new MyException("此昵称已被注册,请重新输入"); //抛出异常
        }else{
            System.out.println("这个昵称可以使用");
        }
    }

    //自己解决
    public static void checkName2() {
        String str="时光，久远，依旧";
        String s="久远";
        if(str.contains(s)){
            try {
                throw new MyException("此昵称已被注册,请重新输入"); //抛出异常
            } catch (MyException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("这个昵称可以使用");
        }
    }

    public static void main(String[] args) throws MyException {
         //checkName(); //谁调用谁解决，不解决抛出异常
        //new ExceptionTest4().checkName(); //checkName()不加static，就通过new对象.方法
        checkName2();
    }

}
