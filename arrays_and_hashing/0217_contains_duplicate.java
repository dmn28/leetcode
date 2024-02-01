class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen_unique_elements = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen_unique_elements.contains(nums[i])) {
                return true;
            } else {
                seen_unique_elements.add(nums[i]);
            }
        }
        return false;
    }
}
