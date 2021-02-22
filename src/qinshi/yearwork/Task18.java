package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task18
 * @Date 2021/2/19 14:54
 */
/*写一个方法，判断一个字符串是否对称
*     1 . 正序或者逆序的字符串都是一样。

      2 . 那么就从中间把它一分为二

      3 . 遍历一分为二的字符串

      3 . 使用charAt()获取指定索引处的 char 值。

      4 .判断正序的char值和逆序的chat值是否相等，如果相等，那就是对称的，如果不相等，那就是不对称的*/
public class Task18 {
    @Test
    public void test() throws Exception{
        System.out.println(isSymmetry("abcecba"));
        System.out.println(isSymmetry("abab"));
    }

    boolean  isSymmetry(String s){
        if (s == null)   //如果字符串为空
            return false;
        if (s.equals("") || s.length() == 1)   //如果字符串等于空串，或者它的长度为1
            return true;
        for (int i = 0; i < s.length() / 2; i++){   //遍历字符串的一半
            if (s.charAt(i) == s.charAt(s.length() - i - 1))  //判断字符串序的char值和逆序的chat值是否相等
                return true;
        }
        return false;
    }
}
