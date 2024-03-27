// 238. https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class ProductOfArrayExceptSelf 
{
    static int [] Solution (int [] nums)
    {
        int result [] = new int [nums.length];
        result[0]=1;
        int post = nums[nums.length-1];

        for (int i = 0; i<nums.length-1; i++)
        {
            result[i+1] = result[i] * nums[i];
        }
        System.out.println(Arrays.toString(result));
        for (int i=nums.length-2; i>=0; i--)
        {
            result[i] = post * result[i];
            post = post*nums[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        int arr [] = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(Solution(arr)));
    }   
}