class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        Map h = new HashMap<Character,Integer>();
        int l=0,r=0;
        while(r<s.length()){
            if(h.containsKey(s.charAt(r))){
                 int last_occuring = (int)h.get(s.charAt(r));
                    l=Math.max(last_occuring+1,l);
            }
            
                h.put(s.charAt(r),r);
            len=Math.max(r-l+1,len);
            r++;
        }
        return len;
    }
}