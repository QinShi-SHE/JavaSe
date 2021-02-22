package qinshi.day21.autoclose_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BufferedTest
 * @Date 2021/1/28 16:15
 */
/*
jdk7关流的新方式：
	 用新结构可以自动关流
	前提：该流必须是实现了一个接口	AutoCloseable
	语法：
		try(
			//只能写创建流的操作，不能写其他业务操作
		){
			//可能有异常的代码
		}catch(异常类型1 e){

		}...不需要finally关流了
 */
public class BufferedTest {
    public static void main(String[] args) {

        try(
                //只能写创建流的操作，不能写其他业务操作
                BufferedReader bur=new BufferedReader(new FileReader("src/qinshi/day21/node.txt"));
                BufferedWriter buw=new BufferedWriter(new FileWriter("src/qinshi/day21/node2.txt"));
                ) {

            String str="";
            while ((str=bur.readLine())!=null){
                buw.write(str);
                //写完一行换行写
                buw.newLine();
            }
            //刷新
            //buw.flush();      //这种自动关流方式，会自动刷新流，一般建议手动开启
            buw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
