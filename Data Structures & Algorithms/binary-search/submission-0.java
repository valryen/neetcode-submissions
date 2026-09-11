class Solution {
    public int search(int[] nums, int target) {
        int high=nums.length-1,low=0;
        int mid=(high+low)/2;
        while(mid<=high && mid>=low){
            if(nums[mid]<target){               
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                return mid;
            }
            mid=(high+low)/2;
        }
        return -1;
    }
}
