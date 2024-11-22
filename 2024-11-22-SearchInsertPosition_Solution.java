class Solution {
    public int searchInsert(int[] nums, int target) {
       int start=0;
       int  end=nums.length-1;
        int index =0;
       while(start<=end){
         int mid = start + (end-start)/2;
         if(target==nums[mid]){
             return mid;
         }
         else if(target<nums[mid]){
             end=mid-1;
         }
         else{
             start = mid+1;
         }
       }
       if(start>end){
           for(int i =0; i<nums.length;i++){
                if(target<=nums[0]){
                   return 0;   
                   
               }
               if(i==nums.length-1){
                  return nums.length;
               }
               if(target>nums[i]&&target<nums[i+1]){
                   return i+1;   
                   
               }    
       }
       }
                return 0;
    }
}
