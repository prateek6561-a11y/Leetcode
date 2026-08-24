class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mC=0;
        int cC=0;
        for(int n:nums){
            if(n==1){
                cC++;
                mC=Math.max(cC,mC);
            }else{
                cC=0;
            }
        }
        return mC;
    }
}