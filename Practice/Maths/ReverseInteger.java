import java.util.Scanner;

public class ReverseInteger 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int flag = 0;
        int rev = 0;
            while(x!=0)
            {          
                if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && x%10 > 7))
                {
                    System.out.println(0);
                    flag = 1;
                    break;
                }
                if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x%10 < -8))
                {
                    System.out.println(0);
                    flag = 1;
                    break;
                }
                rev = (rev*10) + (x%10);
                x /= 10;
            }
            if (flag == 0) 
            {
                System.out.println(rev);
            }
    }
    
}