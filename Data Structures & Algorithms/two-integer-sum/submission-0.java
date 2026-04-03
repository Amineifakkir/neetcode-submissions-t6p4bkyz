class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int step = i + 1;

            while (step < nums.length) {
                if (nums[i] + nums[step] == target) {
                    return new int[]{i, step};
                }
                step++;
            }
        }

        return null;
    }
}