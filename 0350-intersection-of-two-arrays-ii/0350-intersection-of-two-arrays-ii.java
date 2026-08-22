class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int n:nums1){
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // int res[]=new int[nums1.length];
        // int k=0;
        // for(int n:nums2){
        //     int count=map.getOrDefault(n,0);
        //     if(count==0){
        //         continue;
        //     }else{
        //         res[k]=n;
        //         k++;
        //         map.put(n,count-1);
        //     }
        // }
        // return Arrays.copyOfRange(res,0,k);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int res[]=new int[nums1.length];
        int k=0;
        int i=0;
        int j=0;
        while(i< nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                res[k]=nums1[i];
                k++;
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
j++;
            }else{
                i++;
            }
        }
        return Arrays.copyOfRange(res,0,k);
    }
}