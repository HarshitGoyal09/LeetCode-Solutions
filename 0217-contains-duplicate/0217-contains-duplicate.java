class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i-1] == nums[i]){
                flag = true;
                break;
            }
        }
        return flag;
    }
}