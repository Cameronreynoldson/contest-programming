import java.util.*; 

public class EpicGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        boolean done = false;
        boolean turn = true;
        while(!done)
        {
            if(turn)
            {
                int gd = gcd(a,n);
                if(gd > n)
                {
                    System.out.println("1");
                    break;
                }
                n -= gd;
                turn = false;
            }
            else
            {
                int gd = gcd(b,n);
                if(gd > n)
                {
                    System.out.println("0");
                    break;
                }
                n -= gd;
                turn = true; 
            }   
        }
    }


    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        else
            return gcd(b,a%b);
    }
}
