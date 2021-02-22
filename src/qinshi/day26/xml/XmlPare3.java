package qinshi.day26.xml;

import org.dom4j.Attribute;
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
import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName XmlPare3
 * @Date 2021/2/22 15:22
 */
public class XmlPare3 {
    /**因为每一个方法都要使用到以下的变量，所以，将其声明为成员变量，并且在预执行语句中赋值*/
    private SAXReader reader;
    private Document doc;
    private Element contacts;
    private String str = "xml/contacts.xml";

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
                    if(id!=null && id.getText().equals("69")){
                        //找到了id为69的linkman,只需要拿到linkman下面的name元素
                        Element name = linkman.element("name");
					/*这一段 获取id为69的linkman下面的所有子节点，并打印文本的值
					 * List<Element> names = linkman.elements();
						if(names!=null && names.size()>0){
						for (Element e : names) {
							System.out.println(e.getText());
						}
					}*/
                        if(name!=null){
                            //打印name标签的名称和文本值
                            System.out.println(name.getName()+"="+name.getText());
                        }
                    }
                }
            }
        }
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
