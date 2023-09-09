class Solution {
    public void reverseString(char[] s) {
        int low = 0; char tmp;
        int high = s.length-1;
        while(low < high){
            tmp = s[high];
            s[high--] = s[low];
            s[low++] = tmp;
        }
    }
}