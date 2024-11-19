class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new  int[2] ; 
        int j = 1;
       for(int i = 0; i< nums.length; ) {
             if(nums[i]+nums[j]==target && j<nums.length) {
                twoSum[0]=i
                twoSum[1]=j;
                
             }
             else{
                j++ 
             }
    }
}
