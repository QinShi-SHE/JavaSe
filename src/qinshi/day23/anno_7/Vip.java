package qinshi.day23.anno_7;

import java.lang.annotation.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Vip
 * @Date 2021/1/31 15:17
 */
/*
注解
 就是一个标签
 元注解：在注解上面的限制

 使用自定义的标签（掌握）

*		  1.JDK的元注解：就是专门用来声明其他注解的注解
*				作用：通过元注解了解其他注解的使用特点，还可以自定义注解
*		2.元注解：
*				1.
*				@Target
                @Target 作用
                    用来限制被修饰注解的使用范围，即注解可以在类的哪些成员上使用
                @Target 取值使用ElementType.（）
                    1.	CONTeSTRUCTOR:可以在构造器上使用注解
                    2.	FIELD:可以在字段上使用注解
                    3.	LOCAL_VARIABLE:可以在局部变量上使用注解
                    4.	METHOD:可以在普通方法上使用注解
                    5.	PACKAGE:可以在包上使用注解
                    6.	PARAMETER:可以在参数列表上使用注解
                    7.	TYPE:可以在类、接口(包括注解类型) 或enum上使用注解

                    例如：@Target(ElementType.METHOD)//意味着@Override只能在普通方法上使用
                        public @interface Override {
                        }
      2.
        @Retention
        @Retention 作用
            限制注解的作用时间
            注解的生命周期和三个阶段有关：源代码阶段、CLASS文件中有效、运行时有效，
            故其取值也就三个值，分别代表着三个阶段
        @Retention RetentionPolicy.（枚举）
            1.	SOURCE:在源文件中有效（即源文件保留），这个一般用来校验代码
            2.	CLASS:在class文件中有效（在源文件和字节码文件时有作用）
            3.	RUNTIME:在运行时有效（在源文件、字节码文件、运行的时候起作用）
                一般是通过反射技术使用，通过程序的扩展性

            例如：@Retention(RetentionPolicy.SOURCE)//编译期有效，主要用来校验代码
                public @interface Override {
                }

        3.
        @Documented
        @Documented 作用:文档注解，可以使用javadoc生成文档注释
            Documented是一个标记注解，没有成员。
        4.
        @Inherited
        @Inherited 作用：从该类的子类上可以继承父类的注解
            假设一个注解在定义时，使用了@Inherited，然后该注解在一个类上使用，
            如果这个类有子类，那么通过反射我们可以从类的子类上获取到同样的注解
自定义注解声明步骤：（掌握）
					1. 创建一个注解类@Annotation：
					2. 在类上用元注解修饰（注意，根据情况，决定写几个）
						@Target({ElementType.TYPE,ElementType.METHOD})
						@Retention(RetentionPolicy.RUNTIME)
						@Documented
						@Inherited
 */
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Vip {
    /*
语法：
    @4大元注解
    public @interface 注解名{
        数据类型 属性名()  default 默认值; //default表示一个默认取值，可以不写
    }
    数据类型支持：数组、String、8个基本类型、枚举
    属性名：见名知意，小驼峰，如果只有一个属性，建议声明为：value
    因为使用的时候，value可以省略。
使用注解（掌握）
    @注解名(属性名=值)//类型要一致
    @注解名(属性名={值1,值2})  //注解类型为数组，如果属性名是value可以省略

     */
    String value() default "默认值";
    int vip() ;
}
