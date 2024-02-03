class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       List<Integer>[] frequency = new List[nums.length + 1];
        HashMap<Integer, Integer> freq_map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            freq_map.put(num, freq_map.getOrDefault(num, 0) + 1);
        }

        for (int key : freq_map.keySet()) {
            if (frequency[freq_map.get(key)] == null)
                frequency[freq_map.get(key)] = new ArrayList<>();
            frequency[freq_map.get(key)].add(key);
        }

        for (int i = frequency.length - 1; i >= 0 && result.size() < k; i--) {
            if(frequency[i] != null){
                result.addAll(frequency[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
