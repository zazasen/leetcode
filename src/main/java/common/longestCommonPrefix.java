package common;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int maxLength = getMinLen(strs);
        if(maxLength == -1) return res;
        for (int i = 0; i < maxLength; i++) {
            char temp = strs[0].charAt(i);
            for (int i1 = 1; i1 < strs.length; i1++) {
                if (temp != strs[i1].charAt(i)) {
                    return res;
                }
            }
            res = res + temp;
        }
        return res;
    }

    public int getMinLen(String[] strs) {
        if(strs.length == 0) return -1;
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = strs[i].length() > min ? min : strs[i].length();
        }
        return min;
    }

    public static void main(String[] args) {
        String[] temp = {"","b"};
        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(temp));
    }
}
