class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int num:nums){
        //     if(!map.containsKey(num)){
        //         map.put(num,0);
        //     }
        //     map.put(num,map.get(num)+1);
        // }
        // for(int n:nums){
        //     if(map.get(n)==1){
        //         return n;
        //     }
        // }
        // return -1;
        int res=0;
        for(int n:nums){
            res=res^n;
        }
        return res;
    }
}