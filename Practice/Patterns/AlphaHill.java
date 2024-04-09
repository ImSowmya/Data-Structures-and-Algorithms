import java.util.*;

public class AlphaHill 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ascii = 65;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }

            for(int j=0; j<(2*i)+1; j++)
            {
                System.out.print((char)ascii + " ");
                if(j < i)
                {
                    ascii++;
                }
                else
                {
                    ascii--;
                }
            }

            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            
            ascii = 65;
            System.out.println();
        }
    }
}