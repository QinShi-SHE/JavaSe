package qinshi.day22.junit_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName JunitTest
 * @Date 2021/1/30 10:47
 */
/*
 采用单元测试
 1. 导入包，Junit4包
		选中项目，右键 => Build Path  => Add Library  => 选中Junit
		选中Junit4  => finish
	2. 写一个单元测试类，命名方式：XxxTest(测试类没有main方法)

	3. 在测试类中，设计测试方法，命名方式：testXxx（）
		在方法上方会自动添加一个@Test注解

	4. 运行，右键run as JUnit方式
		如果是全部执行，直接选中 @Test注解，右键run as JUnit方式
		如果是某一个方法，直接选中方法名，右键run as JUnit方式
		@Before// 预执行注解，每次执行方法前都会执行该注解
		@After// 每次执行方法后都会执行该注解

	5. 运行后结果解释：
		绿条：表示成功执行
		红条：表示执行失败
			1. 代码有异常
			2. 执行失败，逻辑异常

	6. 自己扩展（测试类中的断言assert）
 */
public class JunitTest {
    @Test
    public void testGet(){  //测试方法的访问修饰符，只能写public，不写用默认的也不行，也不能写static
        get();
       // get2();
    }

    @Test
    public void testGet2(){  //测试方法的访问修饰符，只能写public，不写用默认的也不行，也不能写static
        get3();
        // get2();
    }

    public void get(){
        System.out.println("测试");
    }
    @Before  // 预执行注解，每次执行方法前都会执行该注解
    public void get1(){
        System.out.println("测试之前");
    }
    @After // 每次执行方法后都会执行该注解
    public void get2(){
        System.out.println("测试之后");
    }

    public void get3(){
        System.out.println("测试3");
    }
}
