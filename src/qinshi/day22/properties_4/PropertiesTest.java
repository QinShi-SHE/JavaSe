package qinshi.day22.properties_4;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PropertiesTest
 * @Date 2021/1/30 14:23
 */
/*
	Properties资源（配置）文件的解析（重点）
---------------------------------（注意：重点）-------------------------------------
	以后配置文件都要放到项目中的一个或者几个单独的文件夹中，为了好管理。
	该文件夹类型是source folder类型，源文件夹，eclipse工具会自动编译
---------------------------------------------------------------------------------

	传统方式获取流是new创建的，而在web开发中有可能获取不到配置文件，为了避免这种情况，用以下方式获取流：

 	1. 通过当前类字节码文件的方式，一般是用当前类的字节码文件
 		当前类.class.getResourceAsStream("/文件路径/文件名");
 		/:如果是resource文件夹，直接写文件名，如果是普通文件夹写文件夹名/文件名
 		/还是需要

 	2. 通过类加载器的方式
 		1.同当前类的加载器获取
 			1.当前类.class.getClassLoader();//获取当前类加载器
 			2.classLoader.getResourceAsStream("文件路径/文件名");//通过类加载器获取流对象,如果是源文件夹，直接文件名

 		2.通过当前线程的类加载器获取流
 			1、ClassLoader classLoader = Thread.currentThread().getContextClassLoader();	//获取当前线程类加载器
			2、InputStream is = classLoader.getResourceAsStream("文件路径/文件名");//通过当前线程的类加载器获取流对象,如果是源文件夹，直接文件名

		建议用当前线程类的加载器方式获取流，线程安全问题

		类加载器：（ 扩展，5个月后会讲）
			加载字节码的一个类而已：
				1. 启动类加载器(Bootstrap classLoader) c++
					本地代码实现的类加载器，它负责将 <JAVA_HOME>/lib下面的核心类库
					或 -Xbootclasspath选项指定的jar包等 虚拟机识别的类库 加载到内存中。
					由于引导类加载器涉及到虚拟机本地实现细节，开发者无法直接获取到启动类加载器的引用，
					所以 不允许直接通过引用进行操作。

				2. 拓展类加载器(Extension classLoader):
					扩展类加载器是由Sun的ExtClassLoader（sun.misc.Launcher$ExtClassLoader）
					实现的，它负责将 <JAVA_HOME >/lib/ext或者由系统变量-Djava.ext.dir指定位置
					中的类库 加载到内存中。开发者可以直接使用标准扩展类加载器。

				3. 系统类 （应用类）加载器(Application classLoader):
					系统类加载器是由 Sun 的 AppClassLoader（sun.misc.Launcher$AppClassLoader）实现的，
					它负责将 用户类路径(java -classpath或-Djava.class.path变量所指的目录，
					即当前类所在路径及其引用的第三方类库的路径，如第四节中的问题6所述)下的类库 加载到内存中。
					开发者可以直接使用系统类加载器。
 */
public class PropertiesTest {
    @Test
    public void testName() throws IOException {
        Properties prp=new Properties();
        //读取
        prp.load(new FileInputStream("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\user.properties"));
        System.out.println(prp.getProperty("pwd"));  //根据key找值

        //设置
        prp.setProperty("id","12");
        //写入
        prp.list(new PrintStream("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\user.properties"));

        //通过当前类字节码文件的方式，一般是用当前类的字节码文件
        Properties prop =new Properties();                      //要加一个 /
        InputStream is=PropertiesTest.class.getResourceAsStream("/user.properties");
        prop.load(is);
        System.out.println(prop);

        //同当前类的加载器获取
        Properties prop2=new Properties();                                      //不要加 /
        InputStream is2=PropertiesTest.class.getClassLoader().getResourceAsStream("user.properties");
        prop2.load(is2);
        System.out.println(prop2);

        //通过当前线程的类加载器获取流     建议用当前线程类的加载器方式获取流，线程安全问题
        Properties prop3=new Properties();                                              //不要加  /
        InputStream is3=Thread.currentThread().getContextClassLoader().getResourceAsStream("user.properties");
        prop3.load(is3);
        System.out.println(prop3);
    }
}
