package qinshi.day5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SwtichSpecail
 * @Date 2021/1/5 10:45
 */
public class SwitchSpecail {
    /*
    注意事项：
1.    每个case之间顺序可以交换 不影响代码运行
2.    default不一定放在末尾 在所有case失效的时候就会被执行到
3. 	   case中值与 key类型必须一致
4.     最后一个break可以省略，但不建议
5.     break可以省略，但会导致后续case条件判断失效 按照从上到下顺序 直到找到第一个break跳出选择结构 如果没有找到  执行到末尾 自动跳出选择结构
     */
    public static void main(String[] args) {
        switch (3) {
            case 1:
                System.out.println("上班1");
                //break;
            case 3:
                System.out.println("上班3");
                //break;
            case 2:
                System.out.println("上班2");
                //break;
            case '1':
                System.out.println("上班4");
                //break;
            default:
                System.out.println("今天不用上班，休息");
                break;
        }
        System.out.println("******************************************************");
        switch (49) {
            case 1:
                System.out.println("上班1");
                //break;
            case 3:
                System.out.println("上班3");
                //break;
            case 2:
                System.out.println("上班2");
                //break;
            case '1': //字符1可以转换应ASSCI值49
                System.out.println("上班4");
                break;
            default:
                System.out.println("今天不用上班，休息");
                //break;  //可要不要，建议加上
        }
    }
}
