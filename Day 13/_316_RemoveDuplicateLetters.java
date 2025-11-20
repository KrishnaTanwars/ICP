class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        boolean[] seen = new boolean[26];
        for (int i = 0; i < s.length(); i++) last[s.charAt(i) - 'a'] = i;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen[c - 'a']) continue;
            while (!stack.isEmpty() && c < stack.peek() && last[stack.peek() - 'a'] > i)
                seen[stack.pop() - 'a'] = false;
            stack.push(c);
            seen[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
