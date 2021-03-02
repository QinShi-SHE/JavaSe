# 一. 基础概念认知

## 1.1 访问一个软件【重点】

> 访问一个软件的路径 : 协议://ip地址:端口/资源路径

 例:  http://39.156.66.18:80/index.html

 例:  mysql.jdbc://127.0.0.1:3306/mydb

## 1.2 软件的架构(BS与CS)【重点】

### 1.2.1 C/S结构

- C/S结构是Client/Server（客户端/服务器）的简称
- 桌面应用程序采用的多是这种结构，比如我们使用的QQ、Foxmail等

### 1.2.2 B/S结构

- B/S结构是Browser/Server（浏览器/服务器）的简称
- 通过浏览器就可以访问，比如我们使用淘宝、京东、百度等；

### 1.2.3 区别(优劣势)

- C/S : 更加安全（面向相对固定的用户群），速度更快（专用服务器），但是需要单独安装客户端，而且每次升级都要重新安装客户端；

- B/S : 不用安装任何专门的软件，只要有一个浏览器就可以，客户端不必维护。但是安全性和稳定性相对CS架构的软件较弱；

## 1.3 静态页面与动态页面【了解】

### 1.3.1 静态页面

指的是开发的页面数据是不变的，它和后台/数据库之间没有连系

咱们今天学习的 `html` 做的就是静态页面

### 1.3.2 动态页面

指的是开发的页面和后台/数据库有连系，根据情况数据会发生改变

过几天咱们学习的 `jsp` 做的就是动态页面

## 1.4 网页三剑客【了解】

- html : 完成网页的**结构** - 清水房
- css : 完成网页的**样式** - 墙刷成红色 ...
- javascript : 控制网页的**行为**- 动态修改结构和样式

## 1.5 浏览器【了解】

- IE浏览器 - 万恶的IE,不建议使用
- Chrome(谷歌)浏览器 - 棒棒的 - 自带前端调试工具(英文) - 紧跟标准 - 建议使用
- Firefox (火狐)浏览器  - 棒棒的 - 自带前端调试工具(中文) - 紧跟标准 - 建议使用
- Safari(苹果)浏览器
- 其它浏览器(360,qq,...) - 基本使用的都是Chrome与IE的内核

## 1.6 Html开发工具【了解】

- 记事本 - 装逼必备
- Adobe Dreamweaver - 拥有图形界面 - 不用也不学
- Vscode - 非常优秀 - 前端用的就是这个
- hbuilder - 国产,非常优秀
- eclipse - 我们用这个,因为懒得不想换工具
- idea - 前端支持也非常好
- ...

# 二. HTML

> 1. HTML(Hypertext Markup Language)超文本标记语言，是一种编写网页的技术；
> 2. 整体结构和咱们以前学习的xml非常相似，但是它的语法要求没有xml那么严格

## 2.1 准备工作

<img src="C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602987291597.png" alt="1602987291597" style="zoom:50%;" />

![1602987393952](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602987393952.png)

## 2.2 文档结构

- 文档声明:告诉浏览器该文档的版本

- <!-- 注释写在这个里面  --> 

- html ： 确定这是一个html文档

- head ：头部，里面的标签都是功能解释，不在网页正文中显示出来

- body ：主体，结构展示在页面的标签都写在这里面

  ```html
  <!-- 注释:ctrl+shift+/ -->
  <!-- 
  	声明:下面这句代码代表咱们这个网页是HTML5版本的网页
  		浏览器看到它直接就知道使用HTML5的方案来解析
   -->
  <!DOCTYPE html>
  <!-- 根标签【最外面只有一个】，意思就是它里面装其它的标签 -->
  <html>
  	<!-- 头部标签【里面一般放一些看不见的东西】 -->
  	<head>
  		<!-- 设置编码集 -->
  		<meta charset="UTF-8">
  		<!-- 标题，这个网页的名称 -->
  		<title>凡人修鬼传2</title>
  	</head>
  	<!-- 身体标签【里面就放一些内容】 -->
  	<body>
  		我是一个中国人
  	</body>
  </html>
  ```

## 2.3 基本标签

- h1 - h6 ：标题标签

  ```html
  <!-- 
  	标题标签【修改字体大小,文字加粗】 
  	标题一共有6级 ： h1-h6  
  		h1最大，h6最小
  -->
  <h1>7次会议，习近平这样布局这件大事</h1>
  <h2>7次会议，习近平这样布局这件大事</h2>
  <h3>7次会议，习近平这样布局这件大事</h3>
  <h4>7次会议，习近平这样布局这件大事</h4>
  <h5>7次会议，习近平这样布局这件大事</h5>
  <h6>7次会议，习近平这样布局这件大事</h6>
  ```

- br ： 换行标签

```html
<!-- 
	如果你想要换行，你需要告诉html(浏览器),这个地方我要换行
	<br />：换行
 -->
昨天皇马输球了,<br>我很伤心 <br />
但是看到巴萨也输球了,就兴奋了
```

- hr ：分隔线

  `<br />`

- p : 一个段落

```html
<p>
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。<br />
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。<br />
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。<br />
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。<br />
</p>
<p>
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。<br />
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。<br />
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。<br />
　　当晚9点50分左右，同村人跟张先生说他家着火了，张先生跑回家时发现，火已经冒到上面天线的位置。
</p>

```

- `&nbsp;` : 空格

## 2.4 图片标签 img

### 2.4.1 功能实现

```html
<!-- 
	img:用于展示图片！
		src：代表图片的路径
		alt:如果没有图片,就看到它的值
		width:设置宽度
		height:设置高度
 -->
<img alt="没图片了吧" src="images/g4.gif" width="600px">
```

### 2.4.2 路径分析

- 绝对路径 ：以协议（http://、https://、file://）或者以“/”作为前缀
  - http://www.baidu.com/img/bd_logo1.png
  - https://img.alicdn.com/tfs/TB1MaLKRXXXXXaWXFXXXXXXXXXX-480-260.png
  - file://c:/1.JPG

- 相对路径  : 以文件本身为参照路径进行定位

  - ../ 代表上一层路径

  - ../../ 代表上一层的上一层路径



## 2.5  超连接标签 a

```html
<!-- 
	a:超连接标签
		href:要连接的地址
		target:打开的页面出现的位置
			_self:本页面(默认)
			_blank:打开新页面
 -->
<a href="http://www.baidu.com">度娘子</a>
<a href="http://www.jd.com">狗东</a>
<a href="03_图片标签.html">我的页面</a>
```





## 2.6 表格标签 table

### 2.2.1 表格基础语句

- table: 表格(根)
- tr: 行(必需在table里面)
- td: 列，格子(必需在tr里面)

```html
<!-- 
	table:表格 
		border:边框
		要求:第一行有多少个格子，后面都需要有这么多格子
-->
<table border="1" width="500px" height="300px">
	<!-- tr:行 -->
	<tr>
		<!-- td:列(是一个格子) -->
		<td>第一格</td>
		<td>第二格</td>
	</tr>
	<tr>
		<td>第三格</td>
		<td>第四格</td>
	</tr>
</table>
```



### 2.2.2 表格结构语句

- thead ：表头(不必需)   一般会用th
- tbody : 表的身体
- tfoot : 表脚(不必需)

```html
<table border="20" width="300px">
	<!-- 
		thead:表头(一般用th，不用td)
	 -->
	<thead>
		<tr>
			<!-- 加粗并居中 -->
			<th>id</th>
			<th>name</th>
			<th>age</th>
		</tr>
	</thead>
	<!-- tbody:表的内容 -->
	<tbody>
		<tr>
			<td>1</td>
			<td>C罗</td>
			<td>35</td>
		</tr>
		<tr>
			<td>2</td>
			<td>梅老板</td>
			<td>33</td>
		</tr>
		<tr>
			<td>3</td>
			<td>伊布</td>
			<td>39</td>
		</tr>
	</tbody>
	<!-- tfoot:表的底部 -->
	<tfoot>
		<tr>
			<td>上一页 【1，2，3】下一页</td>
			<td></td>
			<td></td>
		</tr>
	</tfoot>
</table>
```

### 2.2.3 跨行跨列

- rowspan : 跨行
- colspan : 跨列

```html
<table border="20" width="300px">
	<!-- 
		thead:表头(一般用th，不用td)
	 -->
	<thead>
		<tr>
			<!-- 加粗并居中 -->
			<th>id</th>
			<th>name</th>
			<th>age</th>
		</tr>
	</thead>
	<!-- tbody:表的内容 -->
	<tbody>
		<tr>
			<!-- rowspan:跨行  -->
			<td rowspan="2">超星</td>
			<td>C罗</td>
			<td>35</td>
		</tr>
		<tr>
			<td>梅老板</td>
			<td>33</td>
		</tr>
		<tr>
			<td>3</td>
			<td>伊布</td>
			<td>39</td>
		</tr>
	</tbody>
	<!-- tfoot:表的底部 -->
	<tfoot>
		<tr>
			<!-- 
				colspan:跨列 
			-->
			<td colspan="3">上一页 【1，2，3】下一页</td>
		</tr>
	</tfoot>
</table>
```



## 2.7 表单标签

### 2.7.1 `form` :表单标签

- form是表单标签，我们所有的表单元素都放到这个标签中
  - action:访问后台的路径
  - method:访问的方法(GET/POST)

```html
<!-- 
	form:表单标签
		如果你想把你的 表单元素(用户名,密码,性别)等等数据提交到后台
		你必需把所有的表单元素放到form标签中
		action:路径
			把你的表单元素中的值提到到后台的哪个位置（访问哪一个类中的代码）
		method:访问的方法
			get:有大小的限制，并且不安全
			post:没有大小限制，并且安全一些【建议都使用post】
 -->
<form action="/login" method="post">
	...	
</form>
```

### 2.7.2 `input` : 多种表单元素

```html
<!--
		input:非常功能多的标签
			type:(不同的值代表不同的元素):
				text:普通的文本输入(默认)
				password:密码的输入【看不出输入的值】
				hidden:隐藏域(别人看不到，但是他在那)
				submit:提交按钮(点击后会直接把表单中的内容提交到后台)
				button:按钮(没有效果,以后结合javascript使用)
				reset:重置
				radio:单选(name相同的单选是同一组,必需有value)
					checked:默认选中
				checkbox:多选(name相同的多选是同一组,必需有value)
				file:文件选择
			name:(代表这个元素的名称)	
				元素必需有name属性才会向后台提交值
			value:当前元素的值
				在submit,button,reset等按钮中它代表的是按键中的文字
	 -->
	 <!--
	 	如果咱们是一个修改功能，想要知道修改的是谁，就必需把修改的这个人的id传到后台
	   -->
	<input type="hidden" name="id" value="5" />
	用户名:<input type="text" name="username" value="小赤佬" /> <br />
	密码:<input type="password" name="password" /> <br />
	姓别: <input type="radio" name="sex" value="1" checked />男    
		<input type="radio" name="sex" value="0" />女
		<br />
	爱好:<input type="checkbox" name="hobby" value="1" checked>吃饭  
		<input type="checkbox" name="hobby" value="2">睡觉  
		<input type="checkbox" name="hobby" value="3" checked>打豆豆
		<br />
	头像:<input type="file" name="headImage"> <br />
```

### 2.7.3 `select` ：下拉

```html
<!-- 
	做开发的千万不要拼音和英文混用
	select:选择(下拉)
		name:向后台传递的参数的名称
		value:向后台传的参数对应的值(如果不写value，默认值是中间的文字)
		  例:如果你选择日本 -> gj=3
		option:每一个选择
			selected:默认选择
 -->
国基:<select name="gj">
		<option value="">---请选择---</option>
		<option value="1" selected>中华人民共和国</option>
		<option value="2">M国</option>
		<option value="3">日本...</option>
		<option value="4">法国</option>
	</select><br />
```

### 2.7.4 `textarea` : 文本域

```html
<!-- 文字比较多，使用文本域 (两个标签要挨着)
		rows:行数
		cols:列数
-->
简介:<textarea name="intro" rows="5" cols="20"></textarea><br />
<input type="submit" value="登录你个鬼">
<input type="button" value="我是一个没用的按钮">
<input type="reset" value="重置">
```

块级元素：块级大多为结构性标记

<address>...</adderss>   

<center>...</center>  地址文字

<h1>...</h1>  标题一级

<h2>...</h2>  标题二级

<h3>...</h3>  标题三级

<h4>...</h4>  标题四级

<h5>...</h5>  标题五级

<h6>...</h6>  标题六级

  <hr>  水平分割线

  <p>...</p>  段落

  <pre>...</pre>  预格式化

  <blockquote>...</blockquote>  段落缩进   前后5个字符

<marquee>...</marquee>  滚动文本

  <ul>...</ul>  无序列表

  <ol>...</ol>  有序列表

  <dl>...</dl>  定义列表

  <table>...</table>  表格

  <form>...</form>  表单

  <div>...</div>

行内元素：行内大多为描述性标记

<span>...</span>

<a>...</a>  链接

  <br>  换行

<b>...</b>  加粗

<strong>...</strong>  加粗

  <img >  图片

<sup>...</sup>  上标

<sub>...</sub>  下标

<i>...</i>  斜体

<em>...</em>  斜体

<del>...</del>  删除线

<u>...</u>  下划线

<input>...</input>  文本框

<textarea>...</textarea>  多行文本

<select>...</select>  下拉列表

·块级元素

1.总是从新的一行开始

2.高度、宽度都是可控的

3.宽度没有设置时，默认为100%

4.块级元素中可以包含块级元素和行内元素

·行内元素

1.和其他元素都在一行

2.高度、宽度以及内边距都是不可控的

3.宽高就是内容的高度，不可以改变

4.行内元素只能行内元素，不能包含块级元素

## 2.8 Div与Span

### 2.8.1 Div 块级元素

- 特点 ： 独占一行
- 标签 :  div,h1-h6,p,hr,...

### 2.8.2 Span 行内元素

- 特点: 不会独占一行
- 标签：span,a,img,....

# 三. CSS : 样式

## 3.1 CSS的认识

- 层叠样式表

```css
<!-- 
	style:样式的意思(所有能显示的标签都有这个属性)
		样式的写: key:value;
 -->
<div style="color:red;font-size: 60px;">我是一个中国人！！！ 我骄傲！！！</div>
```



## 3.2 CSS的基本写法（3种）

### 3.2.1 行内样式

```html
<!-- 第一种(方便):行内样式  ，直接在标签中使用style属性【只能用于当前标签】 
	font-size:字体大小
	font-weight:加粗
	color:颜色
-->
<div style="font-size:50px;color:red;font-weight: bold;font-family:楷体;">火箭总亚军</div>
```

### 3.2.2 style标签

```html
<!-- 第二种方式:样式标签:告诉咱们这里面写CSS【只能用于当前文件】 -->
<style type="text/css">
	h3{
		color:green;
	}
</style>
```

### 3.2.3 外连样式

> 准备CSS文件 
>
> ```css
> /* 给所有的h5加样式 */
> h5{
> 	color:pink;
> 	font-size: 50px;
> }
> ```
>
> html文件引入
>
> ```html
> <!-- 第三种方式(责任分离):外连式(找到其它一个css文件，就可以用里面的样式) -->
> <link rel="stylesheet" type="text/css" href="css/index.css" />
> ```



## 3.3 CSS的选择器（4种）

- 通用选择器 *
- 标签选择器
- 类选择器  .
- id选择器 #

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	/* 通用选择器:一般来说，前端会使用通用选择器把标签原本的样式给干掉 */
	/*
	*{
	   color:blue;
	}
	*/
	/* 标签选择器 */
	/*
	h2{
		color:green;
	}
	h2,h4{
		font-size: 30px;
	}
	*/
	/* class(类)选择器 重要的就是一个. */
	.qq{
		color:green;
	}
	/* id选择器 -> 只能用作一个元素 重要的是一个# */
	#sanguo{
		color:red;
		font-size: 30px;
	}
</style>
</head>
<body>

	<div class="qq">西游记</div>
	<div class="qq">白蛇传</div>
	<!-- id是不能够重复的,其它的所有元素都不允许叫这个名字 -->
	<div id="sanguo">三国演义</div>
	<div>还珠格格</div>

	<h2 class="qq">西施</h2>
	<h2 class="qq">如花</h2>
	<h4>容默默</h4>
	
</body>
</html>
```













