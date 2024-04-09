public class IfElse{
    public static String compareIfElse(int a, int b) 
    {
        if(a>b)
        {
            return "greater";
        }
        else if(a<b)
        {
            return "smaller";
        }
        else
        {
            return "equal";
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(compareIfElse(5, 6));        
    }    
}