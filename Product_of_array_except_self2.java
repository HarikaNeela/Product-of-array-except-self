class Solution {
    public int[] productExceptSelf(int[] nums) {
                int n=nums.length;
        int[] out=new int[n];
        if(n<1)
            return out;
        
        int product=1;
        for(int i=0;i<n;i++)
        {
            product*=nums[i];
            out[i]=product;
        }
        product=1;
        for(int i=n-1;i>0;--i)
        {
            out[i]=out[i-1]*product;
            product*=nums[i];
        }
        out[0]=product;
    return out;
    }
}