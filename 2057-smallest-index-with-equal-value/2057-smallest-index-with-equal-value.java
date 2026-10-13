class Solution {
    public int smallestEqual(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(i % 10 == nums[i])
            {
                return i;
            }
             i++;
        }
        return -1;
    }
}