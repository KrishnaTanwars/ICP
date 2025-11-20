class Solution {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String curr = "";
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(curr);
                num = 0;
                curr = "";
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int times = numStack.pop();
                for (int i = 0; i < times; i++) temp.append(curr);
                curr = temp.toString();
            } else {
                curr += c;
            }
        }
        return curr;
    }
}
