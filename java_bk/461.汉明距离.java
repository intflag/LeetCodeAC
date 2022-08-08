/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 *
 * https://leetcode-cn.com/problems/hamming-distance/description/
 *
 * algorithms
 * Easy (75.19%)
 * Likes:    259
 * Dislikes: 0
 * Total Accepted:    48.7K
 * Total Submissions: 64.4K
 * Testcase Example:  '1\n4'
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 
 * 注意：
 * 0 ≤ x, y < 2^31.
 * 
 * 示例:
 * 
 * 
 * 输入: x = 1, y = 4
 * 
 * 输出: 2
 * 
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ⁠      ↑   ↑
 * 
 * 上面的箭头指出了对应二进制位不同的位置。
 * 
 * 
 */

// @lc code=start
class Solution {

    //两数异或，然后循环与1进行与操作，如果结果是1那说明最后一位为1，计数器++，右移1位
    // public int hammingDistance(int x, int y) {
    //     int z = x ^ y;
    //     int cnt = 0;
    //     while (z != 0) {
    //         cnt = ((z & 1) == 1) ? cnt + 1 : cnt;
    //         z >>= 1;
    //     }
    //     return cnt;
    // }

    //异或后的数，和比它小1的数与运算，去除最后一位的1，计数器++
    // public int hammingDistance(int x, int y) {
    //     int z = x ^ y;
    //     int cnt = 0;
    //     while (z != 0) {
    //         z &= (z - 1);
    //         cnt++;
    //     }
    //     return cnt;
    // }

    //使用API
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
// @lc code=end

