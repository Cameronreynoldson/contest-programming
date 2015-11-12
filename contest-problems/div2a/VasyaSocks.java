import java.util.*; 

public class VasyaSocks
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = 0;

        while(n > 0)
        {
            n--;
            d++;
            if(d % m == 0)
                n++;
        }

        System.out.println(d);
    }
}
