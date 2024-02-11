class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length + 1];

        for (int num : nums) {
            if (visited[num - 1] == true) {
                return num;
            }
            visited[num - 1] = true;
        }
        return 0;
    }
}
