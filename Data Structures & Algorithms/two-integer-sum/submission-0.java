class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < nums.length ; i++){
            int num = target - nums[i];
            for (int j = i + 1; j < nums.length ; j++) {
                if (num - nums[j] == 0){
                    index1 = i;
                    index2 = j;
                }

            }
        }
        return new int[]{index1, index2};
    }
}
