//Link:https://leetcode.com/problems/search-insert-position/submissions/2006612338/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        // if(nums[right]<target){
        //     return nums.length;
        // }else if(nums[left]>target){
        //     return 0;
        // }
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
