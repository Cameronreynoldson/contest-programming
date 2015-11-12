import java.util.*; 

public class LearnFromMath
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] sieve = sieve(n);
        int low = 2;
        int high = n-2;
        while(sieve[low] || sieve[high])
        {
            low++;
            high--;
        } 

        System.out.println(low+" "+high);
    }

    public static boolean[] sieve(int n)
    {
        boolean[] s = new boolean[n+1];
        Arrays.fill(s,true);
        s[0] = false;
        s[1] = false;
        int sq = (int)Math.sqrt(n);
        for(int i = 2; i <= sq; ++i)
        {
            if(s[i])
            {
                for(int k = i*i; k <= n; k += i)
                {
                    s[k] = false;
                }
            }
        }

        return s;
    }
}
