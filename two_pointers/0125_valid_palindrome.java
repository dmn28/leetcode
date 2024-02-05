class Solution {
    public boolean isPalindrome(String s) {
        String new_s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = new_s.length() - 1;
        while (i <= j) {
            if (new_s.charAt(i) != new_s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;    
    }
}
