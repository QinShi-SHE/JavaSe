package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task49
 * @Date 2021/2/19 22:52
 */
/*天朝有一个乞丐姓洪，去天桥要钱
第一天要了1块钱
第二天要了2块钱
第三天要了4块钱
第四天要了8块钱
以此类推
问题： 洪乞丐干10天，收入是多少？代码实现
*/
public class Task49 {
    @Test
    public void test() throws Exception{
        System.out.println(gerMoney());
    }

    int gerMoney(){
        int money=1;
        for (int i = 0; i < 10; i++) {
            money*=2;
        }
        return money;
    }
}
