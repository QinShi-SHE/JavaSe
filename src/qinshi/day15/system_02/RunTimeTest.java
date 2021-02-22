package qinshi.day15.system_02;

import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RunTimeTest
 * @Date 2021/1/20 10:43
 */
/*
 Process exec(String command)
          在单独的进程中执行指定的字符串命令。
static Runtime getRuntime()
          返回与当前 Java 应用程序相关的运行时对象
 */
public class RunTimeTest {
    public static void main(String[] args) throws IOException {
        //Runtime.getRuntime().exec("mspaint");  //打开画图工具

        Runtime r=Runtime.getRuntime();
        r.exec("calc");  //计算机
    }
}
