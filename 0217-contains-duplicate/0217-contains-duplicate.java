class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Approach-1
        Arrays.sort(nums);
        boolean flag = false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                flag = true;
                break;
            }
        }
    return flag;
    }
}