class Solution 
{
    boolean isPalindrome(int sum)
    {
        int reversed = 0;
        int original = sum;
        while(sum != 0)
        {
            reversed = (reversed * 10) + sum % 10;
            sum /= 10;
        }
        return reversed==original;
    }
    int isDigitSumPalindrome(int n) 
    {
        int sum = 0;
        while(n != 0)
        {
            sum += n%10;
            n /= 10;
        }
        return isPalindrome(sum)? 1:0;
    }
}