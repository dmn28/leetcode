class Solution {
    public  List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, LinkedList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] s_array = s.toCharArray();
            Arrays.sort(s_array);
            String s_sorted = new String(s_array);
            if (!map.containsKey(s_sorted)) {
                map.put(s_sorted, new LinkedList<>(List.of(s)));
            } else {
                LinkedList<String> inner_list =  map.get(s_sorted);
                inner_list.add(s);
                map.put(s_sorted,inner_list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public  HashMap<Character, Integer> anagram(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
    }
}
