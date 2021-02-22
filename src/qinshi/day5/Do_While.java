package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Do_While
 * @Date 2021/1/5 11:50
 */
public class Do_While {
    /*
**基本语法:**
do{
 	执行语句；
}while(循环条件);

**循环条件：**布尔类型的值或者表达式,需要不断变化，如果是一个常量或者固定不变的值，则称为没有意义的循环或者死循环;

**执行语句：**当循环条件为true时执行语句，false终止循环，不执行语句
**执行流程**：
1. 	首先执行do后面结构体中的执行语句
2. 	判断循环条件是否为true，如果true，执行do后执行语句，如果为false终止循环

 */
    public static void main(String[] args) {
        /*打印1到10之间的数字*/
        int i =1;
        do{
            System.out.println(i);
            i++;
        }while(i<11);

    }
}
