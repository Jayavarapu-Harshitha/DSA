class Solution {
    public long[] sumOfThree(long num) {
       long[] a = {};
        int flag=0;
        long b[]=new long[3];
     
        if(num%3==0)
        {
            b[0]=num/3-1;
            b[1]=num/3;
            b[2]=num/3+1;
            flag=1;
        }
        if(flag==1)
        return b;
        else
             return a;
    }
}
