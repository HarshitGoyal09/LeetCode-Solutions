import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    // Brute T.C- O(n^2)
    // int[] arr = new int[2];
    //   for(int i=0;i<n;i++){
    //       for(int j=i+1;j<n;j++){
    //           if(nums[i] + nums[j] == target)
    //           {
    //               arr[0] =i;
    //               arr[1] =j;
    //           }
    //       }
    //  }
    //  return arr;

    //  Better T.C - O(n)
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i =0;i<n;i++){
            int complement = target - nums[i];
            if(hash.containsKey(complement)){
                return new int[]{hash.get(complement),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{};
}

    // T.C = O(n2)
} 