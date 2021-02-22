package qinshi.day12.work.abs_impl;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Door
 * @Date 2021/1/15 13:47
 */
/*
	 * 需求：
	 * 	现在有一个基类门类 Door，有两个方法
	 * 		openDoor()开门 抽象方法
	 * 		closeDoor()关门  抽象方法
	 * 	还有其他属性和方法，如门厚度、高度、宽度此处省略不写
	 *
		Door子类
	 * 		卷帘门RollingDoor：开关门方式只要写一个打印语句即可
	 * 		防盗门SecurityDoor ：开关门方式只要写一个打印语句即可
	 * 		智能门AiDoor：
				人脸识别开门 if(调用人脸识别的方法 判断)
					{通过开门}else{不同过，提示}

	 *
	 * 	人工智能接口Ai，有一个人脸识别功能：
			抽象方法boolean faceRecognition();

	 *
	 * 在测试类中调用开关门方法测试即可
	 */
public abstract class Door {
   abstract  void  openDoor();
   abstract void closeDoor();
}
