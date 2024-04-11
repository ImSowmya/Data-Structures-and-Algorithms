import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int rev = 0;
        while(x>rev)
        {
            rev = rev*10+x%10;
            x /= 10;
        }
        if(rev==x || rev/10 == x)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}
