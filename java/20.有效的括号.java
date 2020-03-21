/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return  false;
                }
                char x = stack.pop();
                boolean b1 = ch == ')' && x != '(';
                boolean b2 = ch == '}' && x != '{';
                boolean b3 = ch == ']' && x != '[';
                if (b1 || b2 || b3) {
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
        
    }
}
// @lc code=end

