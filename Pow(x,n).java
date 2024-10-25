class Solution {
    public double myPow(double x, int n) {
        
        long tempn = n;
        if(n<0) tempn*=-1;
        double ans = 1.0;
        while(tempn>0){
            if(tempn%2==1){
                ans = ans*x;
                tempn-=1;
            }
            else{
                x=x*x;
                tempn/=2;
            }
        }
        if(n<0) ans=(double)1.0/(double)ans;
        return ans;
    }
}