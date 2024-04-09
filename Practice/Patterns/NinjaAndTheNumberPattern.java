import java.util.Scanner;

public class NinjaAndTheNumberPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=0; i<n*2-1; i++)
        {
            for(int j=0; j<n*2-1; j++)
            {
                int top = i;
                int down = (2*n -2)-i;
                int left = j;
                int right = (2*n -2)-j;

                System.out.print(n-Math.min(Math.min(top,down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}