// Last updated: 11/08/2026, 14:55:35
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int ans =0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int even =0;
            int odd=0;
        for(int j=i;j<n;j++){
            if(nums[j]%2==0)
                even++;
            else
                odd++;
            if(odd>0 && (long)even*b<=(long)odd*a)
                ans++;
        }
        }
        return ans;
    }
}