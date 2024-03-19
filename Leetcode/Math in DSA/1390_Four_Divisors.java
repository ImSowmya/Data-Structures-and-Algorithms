class Solution 
{
    public int FourDivisors(int num)
    {
        int count = 0, sum = 0;
        for (int i = 1; i*i <= num; i++)
        {
            if (num % i == 0)
            {
                count++;
                sum += i;
                if (i * i != num)
                {
                    count++;
                    sum += num / i;
                }
            }
            if (count > 4)
            {
                return 0;
            }
        }
        return (count==4)? sum : 0;
    }

    public int sumFourDivisors(int[] nums) 
    {
        int sum = 0;
        for (int num : nums)
        {
            sum += FourDivisors(num);
        }
        return sum;
    }
}