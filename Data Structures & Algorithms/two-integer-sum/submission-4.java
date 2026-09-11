class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<nums.length;i++){
            int jval=target-nums[i];
            if(map.containsKey(jval)){
                return new int[]{map.get(jval),i};
            }
                map.put(nums[i],i);
        }
        return new int[]{};
    }
}
