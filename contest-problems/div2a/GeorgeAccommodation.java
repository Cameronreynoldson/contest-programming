import java.util.*; 

public class GeorgeAccommodation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for(int i = 0; i < n; ++i)
        {
            int curr = scanner.nextInt();
            int cap = scanner.nextInt();
            if((cap - curr) >= 2)
            {
                c++;
            }
        }

        System.out.println(c);
    }
}
