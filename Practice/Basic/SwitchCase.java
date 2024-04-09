public class SwitchCase 
{
    public static double areaSwitchCase(int ch, double []a) 
    {
        switch(ch)
        {
            case 1:
                return Math.PI*(a[0]*a[0]);
            case 2:
                return a[0]*a[1];
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        double [] a ={3,3};
        System.out.println(areaSwitchCase(1, a));
    }
    
}
