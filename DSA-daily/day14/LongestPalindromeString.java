public class LongestPalindromeString {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {

            int left = i, right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}

