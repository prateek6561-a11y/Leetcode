class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
        int n=nums.length;
        int ctt=1;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
           ctt++;
            }
        if(ctt>(int)n/2){
            return nums[i];
        }
        }
        return nums[0];
    }
}