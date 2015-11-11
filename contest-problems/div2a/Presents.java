import java.util.*;

public class Presents
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i <= n; ++i)
        {
            int p = scanner.nextInt();
            a[p] = i;
        }

        for(int i = 1; i < n; ++i)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print(a[n]);
    }
}
