package qinshi.day26.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName XmlPare
 * @Date 2021/2/22 14:32
 */
public class XmlPareXpath {
    /**因为每一个方法都要使用到以下的变量，所以，将其声明为成员变量，并且在预执行语句中赋值*/
    private SAXReader reader;
    private Document doc;
    private Element qinshi;
    private String str = "D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day26\\my.xml";
    /*
    * 使用dom4j支持xpath的操作的几种主要形式
		   　　第一种形式
		        　　　　/a/b/c： 表示一层一层的，a下面 b下面的c
		    　  第二种形式
		       　　　　 //b： 表示和这个名称相同，表示只要名称是b，都得到
		         第三种形式
		        　　　　/* : 所有元素
		         第四种形式
		       　　　　a[1]：　表示第一个a元素
		        　  　　a[last()]：表示最后一个a元素
		         第五种形式
		        　　　　//a[@id]： 表示只要a元素上面有id属性，都得到
		         第六种形式
		        　　　　//a[@id='b1'] 表示元素名称是a,在a上面有id属性，并且id的属性值是b1

			使用dom4j支持xpath具体操作
		         默认的情况下，dom4j不支持xpath，如果想要在dom4j里面是有xpath，
		         第一步需要，引入支持xpath的jar包，如下：
				jaxen-1.1-beta-6.jar

		         在dom4j里面提供了两个方法，用来支持xpath
		       　　　　selectNodes("xpath表达式")，获取多个节点
		　　　　　　 selectSingleNode("xpath表达式")，获取一个节点
	*/

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
        /*　第一种形式
		        　　　　/a/b/c： 表示一层一层的，a下面 b下面的c
		    　  第二种形式
		       　　　　 //b： 表示和这个名称相同，表示只要名称是b，都得到
		*/

        //selectSingleNode("xpath表达式")，获取一个节点
        Node name=qinshi.selectSingleNode("/qinshi/group/name");//默认获取第一个group中的第一个name
        System.out.println(name.getName()+"="+name.getText());

        Node age=qinshi.selectSingleNode("//age");  //虽然//可以获取全部age，但是方法selectSingleNode只能获取一个，默认取第一个
        System.out.println(age.getName()+"="+age.getText()+"\n");

        //selectNodes("xpath表达式")，获取多个节点
        List<Element> nameList = qinshi.selectNodes("//name");//格式双斜线+指定标签名，或者但斜线+具体的标签路径（/qinshi/group/name）也表示获取标签名为name的
        for(Element i:nameList){
            System.out.println(i.getName()+"="+i.getText());
        }
        System.out.println();
        List<Element> ageList = qinshi.selectNodes("/qinshi/group/age");
        for(Element i:ageList){
            System.out.println(i.getName()+"="+i.getText());
        }
        System.out.println();

       /* List<Element> allList = qinshi.selectNodes("/*");
        for(Element i:allList){
            System.out.println(i.getName()+"="+i.getText());
        }*/

        /*第四种形式
		       　　　　a[1]：　表示第一个a元素
		        　  　　a[last()]：表示最后一个a元素
		         第五种形式
		        　　　　//a[@id]： 表示只要a元素上面有id属性，都得到
		*/
        Node group=qinshi.selectSingleNode("group[last()]");  //group[n]获取第n个
        System.out.println(group);

        /*
        *  第五种形式
		        　　　　//a[@id]： 表示只要a元素上面有id属性，都得到
		         第六种形式
		        　　　　//a[@id='b1'] 表示元素名称是a,在a上面有id属性，并且id的属性值是b1
		*/
        List<Element> listId = qinshi.selectNodes("//name[@cid]"); //要加@符号，后面是属性名
        for (Element i:listId){
            System.out.println(i.getName()+"="+i.getText());
        }


    }


}
