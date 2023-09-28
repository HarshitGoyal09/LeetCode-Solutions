class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = t.length();
        HashMap<Character, Character> hash = new HashMap<>();
        for(int i=0; i< n;i++){
            if(hash.containsKey(s.charAt(i))){
            if(hash.get(s.charAt(i))!= t.charAt(i)){
                return false;
            }
            }
            else{
                if(hash.containsValue(t.charAt(i)))  return false;
                hash.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
