package simple.math;

/**
 * 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，
 * 则其数值范围为 [−2的31次方,  2的31次方 −1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 解答思路
 * 首先将数字转成字符串，根据参数判断是负数还是正数
 * 如果是负数则去掉﹣号
 * 使用StringBuilder.reverse()方法翻转*flag
 */
public class IntegerInversion {
    public static int reverse(int x) {
        String str = String.valueOf(x);
        String xStr = str;
        int flag = 1;
        if (x < 0) {
            flag = -1;
            xStr = xStr.substring(1);
        }
        try {
            return Integer.valueOf(new StringBuilder(xStr).reverse().toString()) * flag;
        }catch (Exception e) {
            return 0;
        }
    }
}
