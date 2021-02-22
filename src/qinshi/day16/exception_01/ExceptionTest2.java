package qinshi.day16.exception_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ExceptionTest2
 * @Date 2021/1/21 10:26
 */
/*
获取异常的三种方式
    方式1:   System.out.println(e);
    方式2:   System.out.println(e.getMessage());
    方式3:   e.printStackTrace();//获取并打印异常信息最常用的方式

 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
            //数组下标越界
            int[] i={1,3};
            System.out.println(i[3]);
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();  //常用
        }
    }
}
