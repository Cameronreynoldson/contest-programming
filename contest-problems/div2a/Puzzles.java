import java.util.*; 

public class Puzzles
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i)
        {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(solve(a,min));
    }

    public static int solve(int[] a, int puzzles)
    {
        int low = 0;
        int high = puzzles-1;
        int min = Integer.MAX_VALUE;

       while(high < a.length)
       {
           min = Math.min(a[high]-a[low],min);
           high++;
           low++;
       } 

       return min;
    }
}
