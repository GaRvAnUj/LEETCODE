class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts=new int[26];
        int left=0;
        int maxCount=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            //Increment frequency of current character
            counts[s.charAt(right)-'A']++;
            //Track maximum frequency in current window
            maxCount=Math.max(maxCount,counts[s.charAt(right)-'A']);
            //Window is invalid if remaining characters to replace exceed k 
            while((right-left+1)-maxCount>k){
                counts[s.charAt(left)-'A']--;
                left++;
            }
            //Update maximum valid length found
            maxLength=Math.max(maxLength,right-left+1);

        }
        return maxLength;
    }
}