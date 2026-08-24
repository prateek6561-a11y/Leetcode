class Solution {
    public int findNumbers(int[] nums) {
        int ctt=0;
        for(int n:nums){
            if(Integer.toString(n).length()%2==0){
                ctt++;
            }
        }
        return ctt;
    }
}