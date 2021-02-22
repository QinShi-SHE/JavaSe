package qinshi.day17.linked_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/22 14:26
 */
public class Test {
    public static void main(String[] args) {
        LinkedContainer link=new LinkedContainer();
        link.add(1);
        link.add(true);
        link.add(1.1);
        link.add("地方");

        System.out.println(link.size);
        System.out.println(link);
    }
}
