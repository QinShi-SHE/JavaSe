package qinshi.day19.work;

import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTEst
 * @Date 2021/1/25 17:49
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        new DisposeFileUtil().writeToDisk("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day19/work/a.txt");
        new DisposeFileUtil().readFromDisk("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day19/work/a.txt");
    }
}
