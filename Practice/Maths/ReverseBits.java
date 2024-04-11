import java.util.Scanner;

public class ReverseBits 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        long rev = 0;
        for(int i=0; i<32; i++)
        {
            rev <<= 1;
            rev |= (n&1);
            n >>= 1;
        }
        System.out.println(rev);
    }
    
}
