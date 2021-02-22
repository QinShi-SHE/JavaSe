package qinshi.day26.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName XmlPare
 * @Date 2021/2/22 14:32
 */
public class XmlPareInsert {
    /**因为每一个方法都要使用到以下的变量，所以，将其声明为成员变量，并且在预执行语句中赋值*/
    private SAXReader reader;
    private Document doc;
    private Element qinshi;
    private String str = "D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day26\\my.xml";

    @Before
    public void testB() throws Exception {
        //1.创建SaxReader对象
        reader = new SAXReader();
        //获取到文档树模型
        doc = reader.read(str);
        //获取文档的根节点
         qinshi= doc.getRootElement();

    }

    @Test
    public void test() throws Exception{

        //添加一个标签，并给此标签赋予属性和属性值
        Element group=qinshi.addElement("group").addAttribute("id","4");
        //在此标签下再添加一个标签,并且给标签添加内容
        group.addElement("name").addText("张三");
        group.addElement("sex").addText("女");
        group.addElement("age").setText("20");
    }

    @After
    public void after() throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter(str));
        //以漂亮的形式把文件打印到系统输出流中
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter = new XMLWriter(bw,format);
        xmlWriter.write(doc);
        //通过关流将缓冲区的内容写到xml文件中
        xmlWriter.close();
    }
}
