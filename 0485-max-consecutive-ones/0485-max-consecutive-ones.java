class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mC=0;
        int cC=0;
        for(int n:nums){
            if(n==1){
                cC++;
            }else{
                mC=Math.max(cC,mC);
                cC=0;
            }
        }
        return Math.max(cC,mC);
    }
}