package qinshi.day11.work;

import java.util.Objects;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Model
 * @Date 2021/1/14 13:53
 */

/*
1. 设计一个父类Model类，
		有成员变量：
			姓名name
			腰围 double类型
			臀围 double类型
			胸围 double类型

		有普通非static方法：
			走台方法walkThrough()，每个子类模特走台方式完全相同
			换衣服方法changeClothes()，每个子类模特换衣服方式完全 不 相同
 */
public class Model {
    String name;
    double yw;
    double xw;
    double tw;

    void walkThrough(){
        System.out.println("父类走秀");
    }
    void changeClothes(){
        System.out.println("父类换衣服");
    }

    public String getName() {
        return name;
    }

    public double getYw() {
        return yw;
    }

    public double getXw() {
        return xw;
    }

    public double getTw() {
        return tw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYw(double yw) {
        this.yw = yw;
    }

    public void setXw(double xw) {
        this.xw = xw;
    }

    public void setTw(double tw) {
        this.tw = tw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Double.compare(model.yw, yw) == 0 && Double.compare(model.xw, xw) == 0 && Double.compare(model.tw, tw) == 0 && Objects.equals(name, model.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Model(){

    }

    public Model(String name, double yw, double xw, double tw) {
        this.name = name;
        this.yw = yw;
        this.xw = xw;
        this.tw = tw;
    }

    @Override
    public String toString() {
        return "[" +
                "姓名=" + name +
                ", 胸围=" + xw +
                ", 腰围=" + yw +

                ']';
    }
}
/*
	现在有如下，子类：
			T台模特
			广告模特
			平面模特

	请使用标准封装+继承+方法重写的方式完成该案例
 */
class Model1 extends Model{
    @Override
    void changeClothes(){
        System.out.println("子模特1换衣服");
    }

//    @Override
//    public boolean equals(Object o) {
//        Model1 model1=null;
//        if(o instanceof Model1){
//            model1=(Model1) o;
//        }
//        return super.xw==model1.xw&&super.tw==model1.tw&&super.yw==model1.yw;
//    }

    public Model1(double xw,double tw,double yw){
        super.xw=xw;
        super.tw=tw;
        super.yw=yw;
    }
}
class Moedel2 extends Model{
    @Override
    void changeClothes(){
        System.out.println("子模特2换衣服");
    }

   public Moedel2(String naem,double xw){
        super.name=naem;
        super.xw=xw;
   }
}
class Model3 extends Model{
    @Override
    void changeClothes(){
        System.out.println("子模特3换衣服");
    }

    public Model3(double xw,double yw){
        super.xw=xw;
        super.yw=yw;
    }
}

/*
在测试类中，请实现如下效果：
		1. 分别给每个子类创建2个对象，每个对象调用方法测试

		2. 希望打印对象的时候，实现效果如下：[姓名,胸围,腰围]

		3. 判断两个T台模特对象，是否相等依据：胸围+臀围+腰围
		   判断两个广告模特对象，是否相等依据：姓名+胸围
		   判断两个平面模特对象，是否相等依据：胸围+腰围
 */
class Test{
    public static void main(String[] args) {
        Model1 m1_1=new Model1(23.1,24.1,25.1);
        Model1 m1_2=new Model1(23.1,24.1,25.1);
        m1_1.walkThrough();
        m1_1.changeClothes();
        m1_2.walkThrough();
        m1_2.changeClothes();
        System.out.println();

        Moedel2 m2_1=new Moedel2("李1",24);
        Moedel2 m2_2=new Moedel2("李1",24);
        m2_1.walkThrough();
        m2_1.changeClothes();
        m2_2.walkThrough();
        m2_2.changeClothes();
        System.out.println();

        Model3 m3_1=new Model3(22,24);
        Model3 m3_2=new Model3(28,24);
        m3_1.walkThrough();
        m3_2.changeClothes();
        m3_1.changeClothes();
        m3_2.walkThrough();
        System.out.println();

        System.out.println(m1_1);
        System.out.println(m1_2);
        System.out.println(m2_1);
        System.out.println(m2_2);
        System.out.println(m3_1);
        System.out.println(m3_2);
        System.out.println();

        System.out.println(m1_1.equals(m1_2));
        System.out.println(m2_1.equals(m2_2));
        System.out.println(m3_1.equals(m3_2));
    }
}