public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public long[] repeatedNumber(final int[] A) {
        int n = A.length;
        long s=0,s2=0,sn=(n*(n+1))/2,s2n=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            s+=A[i];
            s2+=(long)A[i]*(long)A[i];
        }
        long val1=s-sn;
        long val2=s2-s2n;
        val2=val2/val1;
        long x = (val1+val2)/2;
        long y = x-val1;
        Long arr[] = new Long[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
        
        
    }
}
