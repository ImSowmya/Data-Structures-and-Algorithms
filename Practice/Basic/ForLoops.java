import java.util.*;
public class ForLoops 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		int a = 1;
		int b = 1;
		for(int i=3; i<=n;i++)
		{
			int temp = a+b;
			a = b;
			b = temp;
		}
		System.out.println(b);
    }
}