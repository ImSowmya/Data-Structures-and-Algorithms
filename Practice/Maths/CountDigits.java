import java.util.Scanner;

class CountDigits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int n = num;

        // METHOD 1
        // WHILE LOOP
        int count =0;
        while( n!=0 )
        {
            n = n / 10;
            count++;
        }
        System.out.println(count);

        // METHOD 2
        // CONVERT TO STRING AND FIND ITS LENGTH
        String n2 = Integer.toString(num);
        System.out.println(n2.length());

        // METHOD 3
        // LOG10 OF NUMBER + 1
        int n3 = (int)Math.log10(num)+1;
        System.out.println(n3);
        
    }
}