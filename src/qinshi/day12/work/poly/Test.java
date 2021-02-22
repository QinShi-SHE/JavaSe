package qinshi.day12.work.poly;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/15 14:21
 */
/*
多态的作业：
	人类Person有开车方法:drive(Car car){
		调用车的run方法
		car.run();
	}
	车Car类:有run()方法
	子类：
		货车Truck的run()方法 跑80km/小时,并且有独有运输货物方法
		牛车BullCar的run()方法跑10km/小时,并且有独有吃草的方法
		军车的run()方法跑150km/小时,并且有独有放炮方法
	测试类中：
		人类分别开3种车，并且调用每一个车的特有方法
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Person();

        //一个人开三种车
        p.drive(new BullCar());
        p.drive(new JunCar());
        p.drive(new Truck());

        //调用独有方法
        Car c1=new Truck();
        if(c1 instanceof Truck){
            Truck truck=(Truck) c1;
            truck.transportGoods();
        }

        Car c2=new JunCar();
        if(c2 instanceof JunCar){
            JunCar junCar=(JunCar) c2;
            junCar.shooting();
        }

        Car c3=new BullCar();
        if(c3 instanceof BullCar){
            BullCar bullCar=(BullCar) c3;
            bullCar.eatGrass();
        }
    }
}
