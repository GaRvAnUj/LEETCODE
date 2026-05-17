class Solution {
    public int removeDuplicates(int[] nums) {
        int low=0;
        int high=1;
        int k=1;
        while(high<nums.length){
            if(nums[high]==nums[high-1]){
                high++;
                continue;
            }
            if(nums[high]!=nums[high-1]){
                nums[low+1]=nums[high];
                high++;
                low++;
                k++;
            }
        }
        return k;
    }
}