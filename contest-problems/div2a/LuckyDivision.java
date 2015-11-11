import java.util.*; 

public class LuckyDivision
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean l = false;
        for(int i = 4; i <= n; ++i)
        {
            if(n % i == 0)
                if(isLucky(i))
                {
                    System.out.println("YES");
                    l = true;
                    break;
                }
        }

        if(!l) System.out.println("NO");
    }

    public static boolean isLucky(int n)
    {
        while(n > 0)
        {
            int x = n % 10;
            if(x != 7 && x != 4)
                return false;
            n /= 10;
        }
        return true;
    }
}
