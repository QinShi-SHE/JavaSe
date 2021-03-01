# 一.JDBC的认识

> JDBC : Java DataBase Connectivity (Java数据库连接)
>
> ![1602730345703](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602730345703.png)



- JDBC是sun公司制定的一个规范
- 具体实现由各大数据库厂商完成
- # 咱们要使用JDBC必需要引入数据库厂商为我们准备的jar包(驱动包)
  
  - 连接mysql要使用mysql提供的jar包
  - 连接oracle要使用oracle提供的jar包
  - ...

![1602730362428](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602730362428.png)

# 二.Hello JDBC

> 咱们要在JAVA代码执行一段 DDL 语句,给数据库创建一张表！！！

## 2.1 前置工作

- 创建项目 jdbc-day01
- **引入mysql的jar包到项目中**
- 创建类 `cn.itsource.test.HelloJdbcTest`
- 引入`junit4`进行开发

## 2.2 贾琏欲执事

### ①  贾 : 加载驱动 `Driver`

- 方式一 : 创建驱动对象，再手动进行注册

  ```java
  Driver driver = new Driver();	
  DriverManager.registerDriver(driver);
  ```

- 方式二 : 反射读取，自动注册(建议使用)

  ```java
  Class.forName("com.mysql.jdbc.Driver");
  ```

### ② 琏 : 获取连接 `connection`

```java
//2.琏:建立连接(Connection)
//  参数1:url -> 连接数据库的地址
//  	jdbc:mysql: 协议
//  	localhost/127.0.0.1/..: ip地址
//  	3306:端口号
//  	java0827：数据库的名称
//  	参数2:user -> 用户名
//  	参数3:password -> 密码
Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/java0827", "root", "123456");
```

### ③ 欲 : 获取语句对象 `Statement`

```java
//3.欲：获取语句对象(Statement)
//	有语句对象才可以操作执行SQL(DDL,DML,DQL)
Statement st = conn.createStatement();
```

### ④ 执 : 执行sql `execute`

```java
//4.执:执行SQL语句
st.execute("CREATE TABLE `dept` ("+
	  "`id` bigint(20) NOT NULL AUTO_INCREMENT,"+
	  "`name` varchar(30) DEFAULT NULL,"+
	  "PRIMARY KEY (`id`)"+
	") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;");
```

### ⑤.事 : 释放资源 `close`

```java
//5.事:释放资源
//   注:释放资源从小到大
st.close();
conn.close();
```

> 完整代码显示

```java
/**
 * 贾琏欲执事
 */
@Test
public void testDDL() throws Exception {
	//1.贾:注册驱动(Driver) -> 类里面有对应的静态代表块，它会自动执行注册驱动的方法
	//  好处:不依赖于某个数据库的API，并且方便咱们解决硬编码问题
	//  坏外:写字符串容易写错单词(自己小心点)
	Class.forName("com.mysql.jdbc.Driver");
	//2.琏:建立连接(Connection)
	//  参数1:url -> 连接数据库的地址
	//  	jdbc:mysql: 协议
	//  	localhost/127.0.0.1/..: ip地址
	//  	3306:端口号
	//  	java0827：数据库的名称
	//  	参数2:user -> 用户名
	//  	参数3:password -> 密码
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/java0827", "root", "123456");
	//3.欲：获取语句对象(Statement)
	//	有语句对象才可以操作执行SQL(DDL,DML,DQL)
	Statement st = conn.createStatement();
	//4.执:执行SQL语句
	st.execute("CREATE TABLE `dept` ("+
		  "`id` bigint(20) NOT NULL AUTO_INCREMENT,"+
		  "`name` varchar(30) DEFAULT NULL,"+
		  "PRIMARY KEY (`id`)"+
		") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;");
	//5.事:释放资源
	//   注:释放资源从小到大
	st.close();
	conn.close();
	
}
```



# 三. 增删改查(CRUD)

## 3.1 添加数据

```java
/**
 * 贾琏欲执事
 * 添加一条数据 
 * @throws Exception
 */
@Test
public void testSave() throws Exception {
	//1.贾:加载驱动
	Class.forName("com.mysql.jdbc.Driver");
	//2.琏:创建连接
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/java0827", "root", "123456");
	//3.欲:获取执行语句
	Statement st = conn.createStatement();
	//4.执:执行SQL语句
	//  execute(执行DDL,DQL【查询】,DML【增删改】),但是我们平时只使用它执行DDL
	//  执行DML建议都使用 executeUpdate，它更加专业
	st.executeUpdate("insert into employee(name,age,sex) values ('强少爷',15,0)");
	//5.释:释放资源(从小到大)
	st.close();
	conn.close();
}
```

## 3.2 修改数据

```java
/**
 * 贾琏欲执事
 * 修改一条数据 
 * @throws Exception
 */
@Test
public void testUpdate() throws Exception {
	//1.贾
	Class.forName("com.mysql.jdbc.Driver");
	//2.琏 ip和端口可以不写，默认就是本机找3306
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql:///java0827", "root", "123456");
	//3.欲
	Statement st = conn.createStatement();
	//4.执 -> 执行DML【增删改】建议都使用 executeUpdate
	st.executeUpdate("update employee set name='口口老师',age=13 where id=13");
	//5.事(从小到大)
	st.close();
	conn.close();
}
```

## 3.3 删除数据

```java
@Test
public void testDelete() throws Exception {
	//1.贾
	Class.forName("com.mysql.jdbc.Driver");
	//2.琏 ip和端口可以不写，默认就是本机找3306
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql:///java0827", "root", "123456");
	//3.欲
	Statement st = conn.createStatement();
	//4.执 -> 执行DML【增删改】建议都使用 executeUpdate
	st.executeUpdate("delete from employee where id=13");
	//5.事(从小到大)
	st.close();
	conn.close();
}
```

## 3.4 查询数据

```java
/**
 *  贾琏欲执事
 *  查询所有的员工数据
 */
@Test
public void testFindAll() throws Exception {
	//贾：加载驱动
	Class.forName("com.mysql.jdbc.Driver");
	//琏
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql:///java0827","root","123456");
	//欲
	Statement st = conn.createStatement();
	//执：执行SQL语句
	//  DDL:execute  DML:executeUpdate  DQL:executeQuery
	// DQL:executeQuery -> 查询完成后会返回一个结果集对象【ResultSet】
	ResultSet rs = st.executeQuery("select * from employee");
	
	//向下走一走 (每次next都会返回 一个结果：true/false)
	//rs.next();
	//System.out.println(rs.getString("name")); //根据名称获取
	//System.out.println(rs.getString(2)); //根据位置获取【从1开始计算】
	//rs.next();
	//System.out.println(rs.getString("name"));
	//next执行后，光标指向下一条数据，如果有数据，返回true，如果没有数据，返回false
	// 每次循环就指向下一条数据,还会告诉你是否有数据
	while (rs.next()) {
		Long id = rs.getLong("id"); //拿到一条数据
		String name = rs.getString("name");
		Integer age = rs.getInt("age");
		Boolean sex = rs.getBoolean("sex");
		System.out.println(id+","+name+","+age+","+sex);
	}
	
	//事(从内到外)
	rs.close();
	st.close();
	conn.close();
}
```



## 3.5 飘准的写法

```java
/**
 * 	我们要写一个 标准的代码格式
 *  贾琏欲执事
 *  查询所有的员工数据
 */
@Test
public void testQueryAll(){
	//为了在finally中关闭，声明应该放到try外面
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(
				"jdbc:mysql:///java0827","root","123456");
		st = conn.createStatement();
		//1.执行查询 ，获取结果集对象
		rs = st.executeQuery("select * from employee");
		//2.结果集进行遍历 (移到它的光标)
		//  当next()后查不到数据了，就会返回 false
		while(rs.next()){
			//这里可以 使用名称，也可以使用列的位置(从1开始)
			Long id= rs.getLong("id"); 
			String name = rs.getString("name");
			Integer age = rs.getInt("age");
			Boolean sex = rs.getBoolean("sex");
			System.out.println(id+","+name+","+age+","+sex);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		//每个关闭都在finally中
		//保证每个需要关闭的资源一定会关闭
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(st!=null){
					st.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(conn!=null){
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
```



# 四. 工具类 `JDBCUtil`

- 驱动只需要注册一次
- 准备一个或者直接获取到`Connction`的方法
- 准备一个关闭资源的方法

## 4.1 准备 jdbc.properties

> 注意:这个文件只能在资源文件夹下面咱们才可以读取

![1602743796718](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602743796718.png)

```properties
driver=com.mysql.jdbc.Driver
url=jdbc:mysql://localhost:3306/java0827?useUnicode=true&characterEncoding=utf8
username=root
password=123456
```

## 4.2 完成JDBCUtil

```java
package cn.itsource.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


/**
 * 一个JDBC的工具类
 * 	使用静态方法/单例模式(懒汉,饿汉,枚举)
 *
 */
public class JDBCUtil {
	//在静态代码块中使用，声明必需是静态的
	private static Properties props = null;
	/**
	 * 一.加载驱动只需要执行一次
	 * 	  只需要执行一次的代码写在静态代码块中
	 */
	static{
		try {
			//创建一个Properties对象
			props = new Properties();
			//加载(读取资源文件夹中的jdbc.properties文件)
			props.load(
					Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties")
					);
			//贾:加载驱动
			Class.forName(props.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// 保证这里面的方法都可以获取到
			e.printStackTrace();
		}
	}
	
	/**
	 * 二.涟:每次操作数据库都要获取一个新的连接对象
	 * 	提供一个静态方法
	 */
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(
					props.getProperty("url"), 
					props.getProperty("username"),
					props.getProperty("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 三.操作完成之后要关闭资源
	 * 	注意:把要关闭的对象传过来，不能自己创建
	 */
	public static void close(ResultSet rs,Statement st,Connection conn){
		//每个关闭都在finally中
		//保证每个需要关闭的资源一定会关闭
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(st!=null){
					st.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(conn!=null){
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

```

# 五. Domain与DAO实现

## 5.1 三层结构分析

> 方便一群人一起开发，方便项目以后的维护

- 表现层 `controller`
- 业务层 `service`
- 数据层 `DAO`

![1602748399006](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602748399006.png)

## 5.2 Domain的创建

- 用于三层之间的数据传输
- 就是咱们以前写的一个实体类
- 注意规范
  - 就是一个普通类
  - 需要一个公共无参构造器
  - 字段都是私有，提供 `getter,setter`

```java
package cn.itsource.domain;

/**
 * 这就是个domain的类
 *
 */
public class Employee {

	//为了安全性,不能让人直接访问
	private Long id;
	private String name; //姓名
	private Integer age; //年龄
	private Boolean sex; //性别
	
	//必需要提供一个公共无参的构造器-不写默认就是公共无参的构造器
//	public Employee(){}
//	public Employee(Long id, String name, Integer age, Boolean sex) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//	}
	
	//提供getter,setter方法
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	
	//为了方便后面做测试
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}

```

## 5.3 DAO的完成

- 准备dao包  `cn.itsource.dao`
  - 这个包中写的是接口
  - 接口的名称规范: `IXxxDao`  例: `IUserDao,IEmployeeDao,IDepartmentDao`

- 准备dao的实现包 `cn.itsource.dao.impl`
  - 这个包中是接口的实现
  - 类名的名称规范: `XxxDaoImpl` 例: `UserDaoImpl,EmployeeDaoImpl,DepartmentDaoImpl`

### 5.3.1 `IEmployeeDao` 接口代码

```java
package cn.itsource.dao;

import java.util.List;

import cn.itsource.domain.Employee;

public interface IEmployeeDao {
	//添加方法
	void save(Employee employee);
	//修改方法
	void update(Employee employee);
	//删除方法
	void delete(Long id);
	//查询一条数据  select * from employee where id=?
	Employee findOne(Long id);
	//查询所有数据  select * from employee
	// 返回很多员工数据，我们使用List集合
	List<Employee> findAll();
}
```

### 5.3.2 EmployeeDaoImpl 功能实现代码

```java
package cn.itsource.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.itsource.dao.IEmployeeDao;
import cn.itsource.domain.Employee;
import cn.itsource.util.JDBCUtil;

/**
 * dao层中 对于IEmployeeDao的实现
 * @author Admin
 */
public class EmployeeDaoImpl implements IEmployeeDao {

	//贾琏欲执事
	@Override
	public void save(Employee employee) {
		Connection conn = null;
		Statement st = null;
		try {
			//1.贾琏 ：获取连接对象
			conn = JDBCUtil.getConnection();
			//2.欲 : 语句对象
			st = conn.createStatement();
			//3.执: 执行sql
			st.executeUpdate("insert into employee (name,age,sex) values ('"
						+employee.getName()+"',"
						+employee.getAge()+","
						+employee.getSex()+")");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//4.释放资源
			JDBCUtil.close(null, st, conn);
		}
	}
	
	//贾琏欲执事
	@Override
	public void update(Employee employee) {
		Connection conn = null;
		Statement st = null;
		try {
			//1.贾琏
			conn = JDBCUtil.getConnection();
			//2.欲:语句对象
			st = conn.createStatement();
			//3.执:执行sql (拼字符串超级麻烦)
			st.executeUpdate("update employee set name='"+
					employee.getName()+"',age="+employee.getAge()+
					",sex="+employee.getSex()+" where id="+employee.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, st, conn);
		}
	}
	//贾琏欲执事
	@Override
	public void delete(Long id) {
		Connection conn = null;
		Statement st = null;
		try {
			//1.贾琏
			conn = JDBCUtil.getConnection();
			//2.欲:语句对象
			st = conn.createStatement();
			//3.执:执行sql (拼字符串超级麻烦)
			st.executeUpdate("delete from employee where id="+id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(null, st, conn);
		}
	}
	
	//贾琏欲执事
	@Override
	public Employee findOne(Long id) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.贾琏
			conn = JDBCUtil.getConnection();
			//2.语句对象
			st = conn.createStatement();
			//3.执:执行语句
			rs = st.executeQuery("select * from employee where id="+id);
			//关键步骤：拿到结果集的第一行数据,把这行数据 转化成Employee对象并返回
			//一.准备一个Employee对象
			/**
			 * 不建议大家在这里创建对象,如果这里创建了，我就算没有找到数据，我也很难判断是否有值
			 */
			Employee employee = null;
			//二.遍历 
			while(rs.next()){
				//确信查询到数据，才会创建对象
				employee = new Employee();
				//二.拿到所有的值
				//	把拿到的值放到Employee对象中
				employee.setId(rs.getLong("id"));
				employee.setName(rs.getString("name"));
				employee.setAge(rs.getInt("age"));
				employee.setSex(rs.getBoolean("sex"));
			}
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, st, conn);
		}
		return null;
	}

	@Override
	public List<Employee> findAll() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.贾琏
			conn = JDBCUtil.getConnection();
			//2.语句对象
			st = conn.createStatement();
			//3.执:执行语句
			rs = st.executeQuery("select * from employee");
			
			//关键步骤: 把查询到的所有数据都装到一个List集合中
			//一.准备一个装数据的容器
			/**
			 * 以后看到集合先new出来再说，不然各种空指针异常，麻烦得很
			 */
			List<Employee> list = new ArrayList<Employee>();
			//二.从结果集中获取数据
			while(rs.next()){
				//三.把每行数据都放到一个Employee对象中
				//  百分百确认:这里肯定有一行数据,需要接收，所以new出来
				Employee employee = new Employee();
				employee.setId(rs.getLong("id"));
				employee.setName(rs.getString("name"));
				employee.setAge(rs.getInt("age"));
				employee.setSex(rs.getBoolean("sex"));
				//四.把每个对象装到集合中
				list.add(employee);
			}
			//五.返回 数据
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, st, conn);
		}
		return null;
	}

}
```



![1602748746218](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602748746218.png)

# 六.PreparedStatement(预处理语句对象)

> 前置工作

- 创建一张表

  ```sql
  SET FOREIGN_KEY_CHECKS=0;
  -- ----------------------------
  -- Table structure for `t_user`
  -- ----------------------------
  DROP TABLE IF EXISTS `t_user`;
  CREATE TABLE `t_user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `username` varchar(255) DEFAULT NULL,
    `password` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
  
  -- ----------------------------
  -- Records of t_user
  -- ----------------------------
  INSERT INTO `t_user` VALUES ('1', 'admin', '123456');
  INSERT INTO `t_user` VALUES ('2', 'root', 'root');
  INSERT INTO `t_user` VALUES ('3', '孙子兵法', '123');
  ```

- 准备项目

  - 导包
  - JDBCUtil准备好(包含读取的properties)
  - 准备domain `User`
  - 准备dao的接口与对应的实现
    - 提供一个方法 ->` User login(String username,String password);`

  ![1602811016374](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602811016374.png)

## 6.1 登录功能实现

- 登录使用 `Statement` 会出现SQL注入问题 
  - 密码设置为 `' OR 1=1 OR '` 则可以测试SQL注入效果

```java
//贾琏欲执事
public User login(String username, String password) {
	//贾琏
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		conn = JDBCUtil.getConnection();
		//欲：获取语句对象
		st = conn.createStatement();
		//执:执行sql -> 这里是有sql注入问题的(只要是拼接字符串就会出现sql注入问题)
		rs = st.executeQuery("select * from t_user where username='"+username+"' and password='"+password+"'");
		//处理结果集 -> 准备容器
		User user = null;
		while(rs.next()){
			//容器中装东西
			user = new User();
			user.setId(rs.getLong("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
		}
		// 返回数据
		return user;
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBCUtil.close(rs, st, conn);
	}
	
	return null;
}
```

## 6.2 PreparedStatement的使用

- 可以使用SQL语句模板
- 对应的值使用 ? 占位
- 不要忘了?中的值后面需要进行设置

```java
//贾琏欲执事
@Override
public User login(String username, String password) {
	//贾琏
	Connection conn = null;
	PreparedStatement st = null;
	ResultSet rs = null;
	try {
		conn = JDBCUtil.getConnection();
		//欲：得到预处理语句对象
		//   特别注意:需要你先把sql写出来,这个sql就是一个模板,?中的值是可以替换的
		//   ？代表占位符，咱们等会需要给这个占位符加上值
		st = conn.prepareStatement("select * from t_user where username=? and password=?");
		//   给占位符加上相应的值(从1开始计算)
		//st.setString(1, username);
		//st.setString(2, password);
		st.setObject(1, username);
		st.setObject(2, password);
		
		//执: 执行功能 这里不需要加sql
		rs = st.executeQuery();
		//处理结果集 -> 准备容器
		User user = null;
		while(rs.next()){
			//容器中装东西
			user = new User();
			user.setId(rs.getLong("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
		}
		// 返回数据
		return user;
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		JDBCUtil.close(rs, st, conn);
	}
	
	return null;
}
```

## 6.3 PreparedStatement与Statement对比

- PreparedStatement : 预处理语句对象

- 1 允许咱们写SQL模板 可以**避免字符串拼接的麻烦**

  - 造成注意 : ? 只能要特定的地方写

- 2 避免SQL注入问题(只要拼接字符就会SQL注入的危险)

- 3 `PreparedStatement` 在某些数据库中性能比`Statement`更好

  ![1602815141656](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602815141656.png)

# 七.事务

>  程序中的一组操作，要不都成功，要不都失败(同生共死)

## 7.1 事务的四大特性（ACID）

- **原子性（Atomicity）** 原子性是指事务是一个不可分割的工作单位，事务中的操作要么都发生，要么都不发生。
- **一致性（Consistency）**事务前后数据的完整性必须保持一致。
- **隔离性（Isolation）**事务的隔离性是多个用户并发访问数据库时，数据库为每一个用户开启的事务，不能被其他事务的操作数据所干扰，多个并发事务之间要相互隔离。
- **持久性（Durability）**持久性是指一个事务一旦被提交，它对数据库中数据的改变就是永久性的，接下来即使数据库发生故障也不应该对其有任何影响

## 7.2 事务的代码演示

### 7.2.1 准备数据库

```sql
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bank`
-- ----------------------------
DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bank
-- ----------------------------
INSERT INTO `bank` VALUES ('1', '明明', '8000');
INSERT INTO `bank` VALUES ('2', 'baby', '2000');

```

![1602816966923](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602816966923.png)

### 7.2.2 代码实现

1. 关闭自动提交事务  `conn.setAutoCommit(false);`
2. 正常执行到最后手动提交事务  `conn.commit();`
3. 如果加问题需要回滚事务 `conn.rollback();`

```java
//转账功能，每次明明转1000给baby
/**
 *  JDBC自带事务(自动提交事务)，每提交一条SQL,就提交一次事务
 */
@Test
public void testTran() throws Exception {
	//贾连
	Connection conn = JDBCUtil.getConnection();
	try {
		//① : 关闭JDBC的自动提交 【变成手动提交】
		//   set(设置)Auto(自动)Commit(提交)
		conn.setAutoCommit(false);
		
		//一.明明把钱取出来  减去1000
		//拿到语句对象
		PreparedStatement st1 = 
				conn.prepareStatement("update bank set money=money-1000 where id=1");
		//执行语句
		st1.executeUpdate();
		
		//中图断电了/程序员代码出错了
		int i = 1/0;
		
		//二.baby把钱加进去  加上1000
		PreparedStatement st2 = 
				conn.prepareStatement("update bank set money=money+1000 where id=2");
		//执行语句 
		st2.executeUpdate();
		//② : 手动提交事务 
		//  commit：提交
		conn.commit();
	} catch (Exception e) {
		//③ : 回滚事务 
		conn.rollback();
		e.printStackTrace();
	}
}
```

# 八. 添加时返回主键 【了解】

- 以后开发会遇到一种情况，就是添加完后立即拿到添加的数据的主键值
  - 用得不多，但是会用，所以说还是需要了解
- 功能关键 : `Statement.RETURN_GENERATED_KEYS`

## 8.1 Statement获取主键

- 执行SQL的时候加上参数 `Statement.RETURN_GENERATED_KEYS`
- 返回的是一个结果集，拿第一个值即可拿到主键

```java
/**
 * 咱们要完成的功能 就是一条数据添加完成后，拿到它的主键
 *   Statement:返回主键的方式
 *   JDBC提供了返回 主键的功能,但是它觉得这个功能有点影响性能,所以把它关闭
 *   	如果我们想要主键，我们就告诉JDBC
 */
@Test
public void testStatementSave() throws Exception {
	Connection conn = JDBCUtil.getConnection();
	Statement st = conn.createStatement();
	//添加SQL的执行
	//  执行完后有一个返回值，这个值指的是你操作了几条数据
	/**
	 * 第一个参数：执行的sql语句
	 * 第二个参数：你执行完想要获取什么 
	 * 		Statement.RETURN_GENERATED_KEYS:意思就是你需要这个主键
	 * 		加上这个之后，你就有能力去获取主键
	 */
	st.executeUpdate("insert into t_user (username,password) values ('小强','123456')"
			,Statement.RETURN_GENERATED_KEYS);
	//加句代码拿到主键 -> 是一个结果集
	//  这个结果集长什么样子是不知道的
	ResultSet rs = st.getGeneratedKeys();
	//从结果集中拿主键
	while(rs.next()){
		//拿到主键的时候我们根据不知道主键的列是什么
		System.out.println(rs.getLong(1));
	}
	
	JDBCUtil.close(null, st, conn);
}
```

## 8.2 PreparedStatement获取主键

- 设置预定义SQL的时间加上参数 `Statement.RETURN_GENERATED_KEYS`
- 返回的是一个结果集，拿第一个值即可拿到主键

```java
/**
 * PrepareStatement返回主键的方式
 * 	1.需要先告诉JDBC，你想要主鍵
 */
@Test
public void testPrepareStatementSave() throws Exception {
	Connection conn = JDBCUtil.getConnection();
	//定义预执行语句
	// 写SQL的时候确定要返回主键
	PreparedStatement st = 
			conn.prepareStatement("insert into t_user (username,password) values (?,?)",
					Statement.RETURN_GENERATED_KEYS);
	//需要给占位符赋值
	st.setObject(1, "旺财");
	st.setObject(2, "10");
	//执行SQL
	st.executeUpdate();
	//获取主键的结果集
	ResultSet rs = st.getGeneratedKeys();
	while(rs.next()){
		System.out.println(rs.getLong(1));
	}
}
```

# 九. 连接池(数据源)

> 顾名思义， 就是装连接对象的容器，可以极大的提升咱们操作数据库的性能

## 9.1 常见连接池框架

- `boneCP` : 淘汰了

- `DBCP`: Spring推荐的（Spring框架已经集成DBCP）

- `C3P0`:  Hibernate推荐的(早期)（Hibernate框架已经集成C3P0）

- `Druid`：	阿里的，综合性能很好

- `Hikari` `HikariCP`：SpringBoot推荐使用(非常非常牛皮)

## 9.2 连接池的基本属性

### 四大金刚(必需配置)

- 驱动名称 `driverClassName`
- 地址路径 `url`
- 用户名 `username`
- 密码 `password`

### 其它常用属性

- 初始连接数 `initialSize`
- 最大连接数 `MaxActive`
- 最大等待时间 `maxWait`
- ...

![1602837617720](C:\Users\Admin\AppData\Roaming\Typora\typora-user-images\1602837617720.png)

## 9.3 DBCP功能实现

### 9.3.1 导入DBCP的jar包

- `commons-dbcp-1.4.jar` : 数据源的功能包
- `commons-pool-1.5.6.jar` : 池子包

### 9.3.2 准备jdbc.properties

```properties
#连接字符串
url=jdbc:mysql://localhost:3306/jdbcdemo
#用户名
username=root
#密码
password=admin
#驱动的类路径
driverClassName=com.mysql.jdbc.Driver
#连接池启动时的初始值
initialSize=1
#连接池的最大值
maxActive=50
#连接池的最大空闲数
maxIdle=20
```

### 9.3.3 使用关键对象:`BasicDataSource` 

> 一般不直接使用这种方式，因为比较麻烦

```java
//1.创建数据源(连接池)对象
BasicDataSource dataSource = new BasicDataSource();
//2.加载数据
//2.配置四大金刚(dirver,url,username,password)
dataSource.setDriverClassName(props.getProperty("driver"));
dataSource.setUrl(props.getProperty("url"));
dataSource.setUsername(props.getProperty("username"));
dataSource.setPassword(props.getProperty("password"));
//3.可以配置自己的一些属性
//dataSource.setInitialSize(5); //初始5个连接
//dataSource.setMaxActive(100);
```

### 9.3.4 使用`BasicDataSourceFactory` 工厂一步到位 

```java
static{
	//①:准备相应的properties，里面有咱们所有的属性
	Properties props = new Properties();
	try {
		props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
		//1.工厂生成 数据源的时候，把配置也加进去
		dataSource = BasicDataSourceFactory.createDataSource(props);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
```

### 9.3.5 `DBCPUtil` : 连接池工具类

``` java
package cn.itsource.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;


/**
 * 一个DBCP的连接池(数据源)工具
 * 	记住:这个连接池为我们提供了一个类:Basic(基础)DataSource(数据源)
 *
 */
public class DBCPUtil {
	
	private static DataSource dataSource = null;
	
	static{
		//①:准备相应的properties，里面有咱们所有的属性
		Properties props = new Properties();
		try {
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
			//1.工厂生成 数据源的时候，把配置也加进去
			dataSource = BasicDataSourceFactory.createDataSource(props);
			
			//1.创建数据源(连接池)对象
			//dataSource = new BasicDataSource();
			//2.加载数据
			//2.配置四大金刚(dirver,url,username,password)
			//dataSource.setDriverClassName(props.getProperty("driver"));
			//dataSource.setUrl(props.getProperty("url"));
			//dataSource.setUsername(props.getProperty("username"));
			//dataSource.setPassword(props.getProperty("password"));
			//3.可以配置自己的一些属性
			//dataSource.setInitialSize(5); //初始5个连接
			//dataSource.setMaxActive(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 二.涟:每次操作数据库都要获取一个新的连接对象
	 * 	提供一个静态方法
	 */
	public static Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 三.操作完成之后要关闭资源
	 * 	注意:把要关闭的对象传过来，不能自己创建
	 */
	public static void close(ResultSet rs,Statement st,Connection conn){
		//每个关闭都在finally中
		//保证每个需要关闭的资源一定会关闭
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(st!=null){
					st.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(conn!=null){
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

```

# 十. 工具类扩展更新

> 只做增删改的功能增强

```java
/**
 * 工具类的扩展(解决增删改的问题)
 * 	String sql:要执行的sql语句
 *  Object... params:模板sql中 ?对应的值
 *  	因为不确定值的类型，所以使用Object
 *  	因为不确定值的数量，所以使用可变参数
 */
public static void executeUpdate(String sql,Object... params){
	Connection conn = null;
	PreparedStatement st = null;
	try {
		//连 -> 1.拿到连接
		conn = DBCPUtil.getConnection();
		//欲 -> 2.创建PreperStatement
		 st = conn.prepareStatement(sql);
		// 为预定义语句中的?提供值
		//st.setObject(1, user.getUsername());
		//st.setObject(2, user.getPassword());
		for (int i = 0; i < params.length; i++) {
			st.setObject(i+1, params[i]);
		}
		 
		//执 -> 3.执行功能
		st.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DBCPUtil.close(null, st, conn);
	}
}
```







