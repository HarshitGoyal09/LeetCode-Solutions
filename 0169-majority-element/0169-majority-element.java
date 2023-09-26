class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        //Moore's Voting Algorithm
        int cand =0;
        int count =0;
        
        for(int i=0;i<n;i++){
            if(count==0){
                cand = nums[i];
                count++;
            }
            else if(nums[i] == cand){
                count++;
            }
            else{
                count--;
            }
        }
    return cand;
    }
}