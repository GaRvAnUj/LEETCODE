class Solution {
    public boolean isPerfectSquare(int num) {
        if(num <1 )return false;
        long left=1;
        long right=num;
        while(left<=right){
            long mid=left+(right-left)/2;
            long square=mid * mid;
            
            if(square==num){
                return true;
            }
            else if(square < num){
                left=mid+1;//If mid*mid < num: mid is too small, so any number smaller than mid will also be too small. Shift the search to the right half: left = mid + 1.
            }
            else{
                right=mid-1;//if mid*mid > num: mid is too large . Shift the search to the left half: right=mid-1
            }
        }
        return false;
    }
}