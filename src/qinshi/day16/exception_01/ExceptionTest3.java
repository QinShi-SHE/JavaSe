package qinshi.day16.exception_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ExceptionTest3
 * @Date 2021/1/21 10:30
 */
/*
异常完整结构
        try{
            //可能出现异常的代码
        }catch (Exception e){
            //解决办法
        }finally{
            //不管是否异常都会执行，一般不要在这里写返回语句return
        }

        finally作用：
                    释放锁
                    关闭流资源  IO

       final,finally,finalize的区别？
       三者之间没有任何关系
       final 修饰符 最终的（除了构造方法不能修饰，final修饰的不能被重写和改变）
       finally  try语句块中的一部分
       finalize 方法，用于垃圾回收
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        try{
            //数组下标越界
            int[] i={1,3};
            System.out.println(i[1]);
            //关闭虚拟机
            //System.exit(1);  //关闭虚拟机，下面任何语句都不会执行
        }catch (Exception e){
            e.printStackTrace();//输出异常
        }finally {
            System.out.println("都能执行");
        }
        System.out.println();

        try{
            //数组下标越界
            int[] i={1,3};
            System.out.println(i[1]);
            //关闭虚拟机
            System.exit(1);  //关闭虚拟机，下面任何语句都不会执行
        }catch (Exception e){
            e.printStackTrace();//输出异常
        }finally {
            System.out.println("都能执行");
        }
    }
}
