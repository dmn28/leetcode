class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(set);

        int count = 1;
        int max = 1;
        int first = pq.poll();
        while (!pq.isEmpty()) {
            int temp = pq.poll();
            if (first + 1 == temp) {
                count++;
            }else{
                count = 1;
            }
            if (max < count) {
                max = count;
            }
            first = temp;
        }
        return max;
    }
}
