// 217 https://leetcode.com/problems/contains-duplicate/description/

import java.util.HashMap;

public class ContainsDuplicate 
{
    static boolean solution(int nums[])
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,1};
        System.out.println(solution(arr));
    }
    
}
