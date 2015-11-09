import java.util.*; 

public class lcm
{
    public static void main(String[] args)
    {
        System.out.println(lcm(100,32));
    }

    //lowest number divisible by both a and b
    public static int lcm(int a, int b)
    {
        return a*b/(gcd(a,b));
    }

    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
}
