package qinshi.day4;

import java.util.Scanner;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task3
 * @Date 2021/1/3 18:33
 */
/*
* 6. 用if-else if else实现通过变量age的值判断，如果age小于18打印“父母负责”，
* age大于等于18并且小于60打印自己负责，age大于等于60打印“子女负责”*/
public class Task3 {
    void ifAge(int i){
        if(i>0 && i<18){
            System.out.println("--------------------");
            System.out.println("兄弟你这个想法有点危险哦！");
        }
        else if(i>=18 && i<60){
            System.out.println("--------------------");
            System.out.println("没事儿！稳得一批！");
        }
        else if(i>=60 && i<100){
            System.out.println("--------------------");
            System.out.println("好家伙！重口味！你随意！");
        }
        else{
            System.out.println("--------------------");
            System.out.println("哈哈哈！你是傻逼吧！");
        }
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        System.out.println("--------------------");
        System.out.println("请输入您想要艹的年龄：");
        System.out.println("--------------------");
        Scanner scanner=new Scanner(System.in);
        task3.ifAge(scanner.nextInt());
        System.out.println("--------------------");
    }
}
