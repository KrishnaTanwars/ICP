import java.util.*;

public class _438_FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        // Fill frequency for p and first window in s
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        // Compare first window
        if (Arrays.equals(pFreq, sFreq)) {
            result.add(0);
        }

        // Slide the window
        for (int i = p.length(); i < s.length(); i++) {
            // Add new char
            sFreq[s.charAt(i) - 'a']++;
            // Remove old char
            sFreq[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}
