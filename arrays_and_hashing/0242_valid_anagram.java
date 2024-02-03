class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_array = s.toCharArray();
        Arrays.sort(s_array);
        char[] t_array = t.toCharArray();
        Arrays.sort(t_array);

        if (s.length() == t.length()) {
            for(int i=0;i<s.length();i++){
                if(s_array[i] != t_array[i]){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
