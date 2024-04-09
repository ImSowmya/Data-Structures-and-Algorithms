import java.util.Scanner;

public class IncreasingLetterTriangle 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ascii = 65;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)ascii++ +" ");
            }
            ascii = 65;
            System.out.println();
        }
    }
    
}
