class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int secMax = 0;
        for(int i=0 ;i<nums.length ;i++){
            int digit = nums[i];
            if(digit > max){
                secMax = max;
                max = digit;
            }else if(digit>secMax){
                secMax = digit;
            }
        }
        return (max-1) * (secMax-1);
    }
}