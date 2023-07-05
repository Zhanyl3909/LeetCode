class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int res=0;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(nums[mid]<target) {
                res=mid+1;
            }
            if(nums[mid]==target) {
                return mid;
            }
            if(nums[mid]>target) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return res;
    }
}
