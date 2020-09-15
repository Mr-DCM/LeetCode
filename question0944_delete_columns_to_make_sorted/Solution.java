package question0944_delete_columns_to_make_sorted;

/**
 * 时间复杂度是O(m * n)，其中m是数组A的长度，n是数组A中字符串的长度。空间复杂度是O(1)。
 *
 * 执行用时：10ms，击败78.10%。消耗内存：39.9MB，击败12.50%。
 */
public class Solution {
    public int minDeletionSize(String[] A) {
        int result = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j + 1].charAt(i) < A[j].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}