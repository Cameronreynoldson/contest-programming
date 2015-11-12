import java.util.*; 

public class NewYearCandles
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int bTemp = b;
        int c = 0;
        while(a > 0)
        {
            a--;
            c++;
            bTemp--;
            if(bTemp == 0)
            {
                bTemp = b;
                a++;
            }
        }

        System.out.println(c);
    }
}
