package qinshi.day26.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName XmlPare
 * @Date 2021/2/22 14:32
 */
public class XmlPare2 {
    @Test
    public void test() throws Exception{
        //1.创建SaxReader对象
        SAXReader reader=new SAXReader();
        Document document=reader.read("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day26\\my.xml");

        //2.获取根节点
        Element qinshi=document.getRootElement();

        //3.获取所有子标签的元素
//        List list=qinshi.elements();
//        //List<Element> list=qinshi.elements();
//        if(list!=null){ //先判断集合是否为空
//            for(Object i:list){ //再遍历
//                Element e=(Element) i;
//                if(e.attribute("id").getText().equals("2")){ //获取id,判断是否等于指定的id
//                    System.out.println(e.getName()); //打印获取到的标签名
//                    Element name=e.element("name");
//                    System.out.println(name.getText());
//                }
//            }
//        }

        //3.获取所有子标签的元素
        List<Element> list2=qinshi.elements(); //用泛型，这样下面不用强转
        if(list2!=null){ //先判断集合是否为空
            for(Element e:list2){ //再遍历
                if(e.attribute("id").getText().equals("2")){ //获取id,判断是否等于指定的id
                    //System.out.println(e.getName()); //打印获取到的标签名
                    Element name=e.element("name");  //按顺序获取，默认获取第一个名为name的标签
                    System.out.println(name.getName()+"="+name.getText());

                    Element name2= (Element) e.elements().get(1); //子标签下获取全部标签，取第二个标签；就取得第二个名字为name的标签
                    System.out.println(name2.getName()+"="+name2.getText());
                }
            }
        }
    }
}
