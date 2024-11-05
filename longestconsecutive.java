//better 
class Solution {
    public int longestConsecutive(int[] nums) {
        int curcnt = 0;
        int lastsml=Integer.MIN_VALUE;
        int longest = 1;
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==lastsml+1){
                lastsml=nums[i];
                curcnt++;
            }
            else if(nums[i]!=lastsml){
                
                lastsml=nums[i];
                curcnt=1;
            }
            longest=Math.max(longest,curcnt);
            
        }
        return longest;
    }
}
//optimal
class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> h = new HashSet<>();
       int curcnt=0;
       int longest=1;
       if(nums.length==0) return 0;
       for(int i=0;i<nums.length;i++){
        h.add(nums[i]);
       }
       for(int i=0;i<nums.length;i++){
        int prev = nums[i]-1;
        if(!h.contains(prev)){
            curcnt=1;
            int el=nums[i]+1;
            while(h.contains(el)){
                ++curcnt;
                ++el;
            }
            longest=Math.max(longest,curcnt);
        }
       }
       return longest;
    }
}