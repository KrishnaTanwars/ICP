import java.util.*;
public class _402_Remove_K_Digits {

class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > c) {
                stack.pollLast();
                k--;
            }
            stack.addLast(c);
        }
        while (k-- > 0 && !stack.isEmpty()) stack.pollLast();
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pollFirst());
        while (sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

    
}
