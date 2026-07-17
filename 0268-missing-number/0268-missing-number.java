class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumO=n*(n+1)/2;
        int sumP=0;
        for(int i=0;i<n;i++){
sumP+=nums[i];
        }
        return sumO-sumP;
    }
}