class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int target = n/3+1;
        List arr = new ArrayList<>(1);
        int e1=0,e2=0,cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=e2){
                cnt1++;
                e1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=e1){
                cnt2++;
                e2=nums[i];
            }
            else if(nums[i]==e1) cnt1++;
            else if(nums[i]==e2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
            
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1) c1++;
            else if(nums[i]==e2) c2++;
           
        }
        if(c1>=target) arr.add(e1);
        if(c2>=target) arr.add(e2);
        return arr;
    }
} 