package qinshi.day12.work.abs_impl;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AiDoor
 * @Date 2021/1/15 13:51
 */
/*
智能门AiDoor：
		人脸识别开门 if(调用人脸识别的方法 判断)
		{通过开门}else{不同过，提示}
 */
public class AiDoor extends Door implements Ai{
    @Override
    void openDoor() {
        System.out.println("人脸识别成功！");
    }

    @Override
    void closeDoor() {
        System.out.println("人脸识别失败！！！");
    }

    @Override
    public boolean faceRecognition() {
        return true;
    }

    void faceAi(){
        if(faceRecognition()){
            openDoor();
        }else {
            closeDoor();
        }
    }
}
