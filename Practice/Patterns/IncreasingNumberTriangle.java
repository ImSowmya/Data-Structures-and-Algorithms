import java.util.Scanner;

public class IncreasingNumberTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }    
}