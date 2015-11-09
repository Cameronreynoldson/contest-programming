import java.util.*; 

public class sieve
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(sieve(100)));
    }

    public static boolean[] sieve(int n)
    {
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        int m = (int)Math.sqrt(n);

        for(int i = 2; i <= m; ++i)
        {
            if(primes[i])
            {
                for(int k = i*i; k <= n; k += i)
                {
                    primes[k] = false;
                }
            }
        }

        return primes; 
    }
}
