class Solution {
    public int fib(int n) {
        int sum=0;
        if(n==0||n==1)
        {
            return n;
        }
        int fnm1=fib(n-1)+fib(n-2);
        sum=sum+fnm1;
        return sum;
        


        
    }
}