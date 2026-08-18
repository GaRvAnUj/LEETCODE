class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=0;
        //calculating sum for the window ending at high=k-1
        for(int i=0;i<k;i++){
            average+=nums[i];
        }
        double result=average;
        int low=0;
        int high=k-1; //points to the last element of the window
        while(high+1<nums.length){
            high++;//update high before adding , to prevent re-adding the element
            average=average+nums[high]-nums[low];
            low++;
            result=Math.max(result,average);
        }
        return result/k;
    }
}