class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
        {
            int prod=1;
            for(int j=0;j<l;j++)
            {
                if(j!=i)
                {prod*=nums[j];}
                else
                    continue;
            }
            arr[i]=prod;
        }
        return arr;
    }
}