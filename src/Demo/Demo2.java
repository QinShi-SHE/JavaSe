package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Demo2
 * @Date 2021/1/10 13:15
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //1.先准备一个URL类的对象
        URL url=new URL("https://itdage.com/kkb/kkbsms?=key=xzk&number=17784235935&code=123456");
        //2. 打开服务器链接，得到连接对象
        URLConnection connection=url.openConnection();
        //3.获取加载数据的字节输入流
        InputStream inputStream=connection.getInputStream();
        //4. 将字节输入流装饰为能一次读取一行的字符输入流
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        //5. 加载一行数据
        String text=bufferedReader.readLine();
        //6. 显示
        System.out.println(text);
        //7. 释放资源
        bufferedReader.close();
    }
}
