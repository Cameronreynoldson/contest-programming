import java.util.*; 

public class NearlyLuckyNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        if(lucky(l))
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }

    public static boolean lucky(long n)
    {
        int c = 0;

        while(n > 0)
        {
            long r = n % 10;
            if(r == 4 || r == 7)
            {
                c++;
            }
            n /= 10;
        }
        
        if(c > 10)
        {
            return lucky(c);
        }
        else
        {
            return (c == 4) || (c == 7);
        }   
    }
}
