package simple.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 独一无二的出现次数
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 *
 * 解答思路
 * map统计各个数字出现的次数
 * 将map的value存入set，利用set的不可重复机制比较两个集合的长度
 * 得出是否有相同出现次数的数字
 */
public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
}
