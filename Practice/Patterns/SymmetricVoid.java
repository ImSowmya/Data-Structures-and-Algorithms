import java.util.*;

public class SymmetricVoid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=0; i<n; i++)
        {
            int stars = n-i;
            int space = 2*i;
            
            for(int j=0; j<stars; j++)
            {
                System.out.print("*");
            }

            for(int j=0; j<=space; j++)
            {
                System.out.print(" ");
            }

            for(int j=0; j<stars; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }

            for(int j=0; j<=2*(n-i)-2; j++)
            {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
