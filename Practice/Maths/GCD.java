import java.util.Scanner;

public class GCD 
{
    public static int FindGCD(int a, int b)
    {
        if (b==0) 
        {
            return a;            
        }
        else
        {
            return FindGCD(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(FindGCD(Math.max(a,b), Math.min(a, b)));
    }
    
}
