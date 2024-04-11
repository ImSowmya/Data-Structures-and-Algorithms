import java.util.*;
public class CheckAmstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int digits = (int)Math.log10(num)+1;
		int n = num;
		int ams = 0;

		while(n>0)
		{
			ams = ams+((int)Math.pow(n%10, digits));
			n /= 10;
		}
		if(ams == num)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
    }
}