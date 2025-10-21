public class _1209_Remove_All_Adjacent_Duplicates_in_String_II {
    class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[s.length()];
        for (char c : s.toCharArray()) {
            sb.append(c);
            int i = sb.length() - 1;
            count[i] = i > 0 && sb.charAt(i) == sb.charAt(i - 1) ? count[i - 1] + 1 : 1;
            if (count[i] == k) sb.delete(i - k + 1, i + 1);
        }
        return sb.toString();
    }
}

    
}
