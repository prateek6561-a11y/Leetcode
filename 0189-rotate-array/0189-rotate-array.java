class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // int idx=0;
        // int curr=nums[idx];
        int count=0;
        for(int i=0;count<n;i++){
       int  idx=i;
        int curr=nums[i];
        do{
         int next=nums[(idx+k)%n];
         nums[(idx+k)%n]=curr;
         curr=next;
         idx=(idx+k)%n;
         count=count+1;
        }while(idx!=i);
        }
    }
}