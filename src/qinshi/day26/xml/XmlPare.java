package qinshi.day26.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName XmlPare
 * @Date 2021/2/22 14:32
 */
public class XmlPare {
    @Test
    public void test() throws Exception{
        //1.创建SaxReader对象
        SAXReader reader=new SAXReader();
        Document document=reader.read("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day26\\my.xml");
        System.out.println(document); //打印document对象

        //2.获取根节点
        Element qinshi=document.getRootElement();
        System.out.println(qinshi); //打印根节点对象

        //3.获取指定名字的子标签元素,默认获取第一个子标签名为group的
        Element group=qinshi.element("group");
        //System.out.println(group);  //打印Element对象

        //获取标签的name，默认获取第一个标签名为name
        Element name=group.element("name");
        System.out.println("标签名："+name.getName()+"，标签内容："+name.getText()); //打印标签的内容

        //获取标签的age
        Element age=group.element("age");
        System.out.println("标签名："+age.getName()+"，标签内容："+age.getText());

        //获取标签的sex
        Element sex=group.element("sex");
        System.out.println("标签名："+sex.getName()+"，标签内容："+sex.getText());

        //根据group标签的id属性值去获取到对应的标签
        Attribute attr=group.attribute("id");
        System.out.println(attr);  //打印属性对象
        System.out.println("属性名："+attr.getName()+",属性值："+attr.getText());

    }
}
