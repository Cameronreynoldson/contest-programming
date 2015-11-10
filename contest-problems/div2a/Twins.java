import java.util.*; 


public class Twins
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int[] a = new int[n];
        for(int i= 0; i < n; ++i)
        {
            a[i] = scanner.nextInt();
        }
        
        Arrays.sort(a);
        int sum1 = 0;
        for(int i = n-1; i >= 0; --i)
        {
            sum1 += a[i];
            int sum2 = 0;
            for(int j = i-1; j >= 0; --j)
            {
                sum2 += a[j];
            }

            if(sum1 > sum2)
            {
                System.out.println(n-i);
                break;
            }
        }
    }
}

