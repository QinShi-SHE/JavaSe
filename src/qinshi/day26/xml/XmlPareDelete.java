package qinshi.day26.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileWriter;
import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName XmPareUpdate
 * @Date 2021/2/22 15:23
 */
public class XmlPareDelete {
    /**因为每一个方法都要使用到以下的变量，所以，将其声明为成员变量，并且在预执行语句中赋值*/
    private SAXReader reader;
    private Document doc;
    private Element contacts;
    private String str = "D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day26\\my.xml";

    @Before
    public void testB() throws Exception {
        //1.创建SaxReader对象
        reader = new SAXReader();
        //获取到文档树模型
        doc = reader.read(str);
        //获取文档的根节点
        contacts = doc.getRootElement();

    }
    /**
     * 1. 查询id是69的linkman元素中，子元素name的值
     */
    @Test
    public void testName() throws Exception {
        //获取到根节点下面的所有子节点  通过根元素去获取到下面子元素 必须集合上加上泛型，避免强转
        List<Element> linkmans = contacts.elements();
        //先判断linkmans是否为null且 集合的大小要大于0 才去遍历
        if(linkmans!=null && linkmans.size()>0){
            for (Element linkman : linkmans) {
                //判断linkman是否为null
                if(linkman!=null){
                    //获取每一个元素linkman的id属性值，如果是69，则打印name的值： Attribute attribute("属性名");
                    Attribute id = linkman.attribute("id");
                    //判断当前Attribute对象是否为null 并且是否等于69这个值
                    if(id!=null && id.getText().equals("4")){
                        //找到了id为69的linkman,只需要拿到linkman下面的name元素
                        Element name = linkman.element("name");
                        //根据父元素删除子元素
                        //contacts.remove(linkman); //移除了整个子节；根据根节点，移除根节点下面对应的子节点
                        linkman.remove(name); //根据字节点，移除在子节点内中的对应标签
                    }
                }
            }
        }
    }

    @After
    public void testA() throws Exception {
        //将内存里面的数据写出到xml文件中   str是xml文件的路径
        XMLWriter writer = new XMLWriter(
                new FileWriter(str)
        );
        writer.write(doc);
        writer.close();
    }
}
