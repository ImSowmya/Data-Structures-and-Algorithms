public class MaximumProductSubarray 
{
    public static void main(String[] args) 
    {
        int [] nums = {2,3,-2,4};

        int max = Integer.MIN_VALUE;
        int l = 1;
        int r = 1; 
        for(int i=0; i<nums.length; i++)
        {
            if (l==0)
            {
                l = 1;
            }
            if(r==0)
            {
                r=1;
            }
            l = l*nums[i];
            r = r*nums[nums.length-1-i];
            max = Math.max(max, Math.max(l, r));
        }
        System.out.println(max);
    }
}