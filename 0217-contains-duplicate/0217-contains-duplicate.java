class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res=new HashSet<>(nums.length);
        for(int num:nums){
            if(res.add(num)==false){
                return true;
            }
        }
        return false;
    }
}