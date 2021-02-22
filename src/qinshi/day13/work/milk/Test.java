package qinshi.day13.work.milk;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/17 18:33
 */
public class Test {
    public static void main(String[] args) {
        Beer beer=new Beer("啤酒","苦涩");
        beer.drink();

        Tea tea=new Tea("茶","清淡");
        tea.drink();

        Coffee coffee=new Coffee("咖啡","醇香");
        coffee.drink();

        System.out.println(beer);
        System.out.println(tea);
        System.out.println(coffee);
    }
}
