class Solution {
    public String longestCommonPrefix(String[] strs) {
        int arrLen = strs.length;
        String res ="";
        int maxLenStr = 200;
        for( int i=0; i<arrLen;i++){
            maxLenStr =Math.min(strs[i].length(), maxLenStr);
        }
        for(int i=0; i<maxLenStr;i++){
            for(int j=1;j<arrLen;j++)
            {
                if(strs[j-1].charAt(i) != strs[j].charAt(i)){
                    return res;
                }
                
            }
            res = res + strs[0].charAt(i);
        }
        return res;
    }
}