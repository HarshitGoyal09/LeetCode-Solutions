class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0,end=0,max=0;
        HashSet<Character> set=new HashSet();
        while(start<s.length()){
            if(!set.contains(s.charAt(start))){
                set.add(s.charAt(start));
                start++;
                max=Math.max(set.size(),max);
            }
            else{
                set.remove(s.charAt(end));
                end++;
            }
        }
        return max;
    }
}