import java.util.*; 

public class QueueSchool
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[n];
        scanner.nextLine();
        String s = scanner.nextLine();
        for(int i = 0; i < n; ++i)
        {
            if(s.charAt(i) == 'B')
            {
                a[i] = 1; 
            }
            else
            {
                a[i] = 2;
            }
        }

        
        for(int i = 0; i < t; ++i)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(a[j] < a[j+1])
                {
                    a[j] = 2;
                    a[j+1] = 1;
                    j++;
                }
            }        
        }

        for(int i = 0; i < n; ++i)
        {
            if(a[i] == 1)
            {
                System.out.print("B");
            }
            else
            {
                System.out.print("G");
            }
        }
    }
}
