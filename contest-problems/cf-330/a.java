import java.util.*; 


public class a
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        int windows = m*2;

        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < windows; ++j)
            {
                int light = scanner.nextInt();
                int next = scanner.nextInt();
                if(light == 1 || next == 1)
                    count++;
                j += 1;
            }
        }

        System.out.println(count);
    }
}
