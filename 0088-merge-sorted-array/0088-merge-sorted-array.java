class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num3[]=new int[m+n];
        for(int i=0;i<m;i++){
            num3[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            num3[m+j]=nums2[j];
        }
        Arrays.sort(num3);
        for(int k=0;k<m+n;k++){
            nums1[k]=num3[k];
        }
    }
}