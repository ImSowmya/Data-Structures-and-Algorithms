// 1. https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;
public class Two_Sum 
{

    public static int [] two_sum_map(int n, int [] arr, int target)
    {
        int ans [] = new int[2];
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++)
        {
            int expected = target - arr[i];
            if (map.containsKey(expected))
            {
                ans[0] = map.get(expected);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        int ans [] = two_sum_map(n, arr, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}