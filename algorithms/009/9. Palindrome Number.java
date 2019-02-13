package algorithms

class Solution {
    public boolean isPalindrome(int x) {
        char[] c1 = String.valueOf(x).toCharArray();
        char[] c2 = new char[c1.length];

        for (int i = 0;i < c1.length;i++) {
            c2[i] = c1[c1.length - i - 1];
        }
        for (int i = 0;i < c1.length;i++) {
            if (c2[i] != c1[i]) {
                return false;
            }
        }
        return true;
    }
}
