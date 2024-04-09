import java.util.*;
public class WhileLoop 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int even = 0;
		int odd = 0;
		while(n>0)
		{
			if((n%10)%2==0)
			{
				even += n%10;
			}
			else
			{
				odd += n%10;
			}
			n /= 10;
		}
		System.out.println(even+" "+odd);
	}
}