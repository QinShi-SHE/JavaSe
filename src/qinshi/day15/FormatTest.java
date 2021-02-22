package qinshi.day15;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/20 13:55
 */
public class FormatTest {
    public static void main(String[] args) {
        String formatted = String.format("%s今年%d岁。", "小李", 30); // "小李今年30岁。"
        // 补齐空格并右对齐：
        String.format("%10s, world", "Hello");  // 输出 "  Hello, world"
        String.format("%8d", 123);     // 输出 "  123"

        // 补齐空格并左对齐：
        String.format("%-10s, world", "Hello"); // 输出 "Hello  , world"
        String.format("%-8d", 123);    // 输出 "123  "

        // 补齐 0 并对齐（仅对数字有效）
        String.format("%08d", 123);    // 输出 "123  "
        String.format("%-08d", 123);    // 错误！不允许在右边补齐 0

        // 输出最多N个字符
        String.format("%.5s", "Hello, world");  // 输出 "Hello"
        String.format("%.5s...", "Hello, world"); // 输出 "Hello..."
        String.format("%10.5s...", "Hello, world"); // 输出 "  Hello..."

        // 输出逗号分隔数字
        String.format("%,d", 1234567);    // 输出 "1,234,567"
        System.out.println(formatted);
    }
}
