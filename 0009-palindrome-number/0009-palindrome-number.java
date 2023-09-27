class Solution {
    public boolean isPalindrome(int x) {
        // char[] arr = String.valueOf(x).toCharArray();
        // int i =0, j=arr.length-1;
        // while(i<=j){
        //     if(arr[i] != arr[j]){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;

        int temp = x;
        int rev =0;
        while(temp >0){
            int digit = temp % 10;
            rev = (rev*10) + digit;
            temp = temp /10;
        }
        if(x != rev) return false;
        return true;
    }
}