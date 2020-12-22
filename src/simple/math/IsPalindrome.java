package simple.math;

/**
 * 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x>=0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
            if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
