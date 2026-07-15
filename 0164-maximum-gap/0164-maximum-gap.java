class Solution {
    public int maximumGap(int[] nums) {
      if(nums.length==1){
        return 0;
      }
      Arrays.sort(nums);
      int maxG=nums[1]-nums[0];
      for(int i=2;i<nums.length;i++){
        int newG=nums[i]-nums[i-1];
if(newG>maxG) maxG=newG;
      }
      return maxG;
    }
}