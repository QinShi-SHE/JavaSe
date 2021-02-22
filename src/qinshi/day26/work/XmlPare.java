package qinshi.day26.work;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
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
 * @ClassName XmlParm
 * @Date 2021/2/22 19:26
 */
public class XmlPare {
    /**因为每一个方法都要使用到以下的变量，所以，将其声明为成员变量，并且在预执行语句中赋值*/
    private SAXReader reader;
    private Document doc;
    private Element root;
    private String str = "D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day26\\work\\student.xml";

    @Before
    public void testB() throws Exception {
        //1.创建SaxReader对象
        reader = new SAXReader();
        //获取到文档树模型
        doc = reader.read(str);
        //获取文档的根节点
        root= doc.getRootElement();

    }

    @Test
    public void test() throws Exception{
        //1、得到某个具体的文本节点的内容:取出第二个联系人的名字
        Node name = root.selectSingleNode("linkman[@id='2']/name");
        System.out.println(name.getText());

        //2.修改某个元素节点的主体内容：把第一个联系人的邮箱改掉
        Node email = root.selectSingleNode("linkman[1]/email");
        email.setText("11111");

        //3.向指定元素节点中增加子元素节点：增加一个联系人信息
        Element linkman= root.addElement("linkman").addAttribute("id", "3");
        linkman.addElement("name").addText("琴师");
        linkman.addElement("email").addText("22222");
        linkman.addElement("address").addText("苏州");
        linkman.addElement("school").addText("千峰");

        //4、操作XML文件属性：设置/获取联系人的id属性
        Node linkman2 = root.selectSingleNode("/root/linkman");
        System.out.println(linkman2.getNodeType());

        //5、删除指定元素节点：删除第三个联系人信息
        Node linkman3 = root.selectSingleNode("linkman[@id='3']");
        linkman3.getParent().remove(linkman3);
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
