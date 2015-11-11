import java.util.*;

public class BeautifulMatrix
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; ++i)
        {
            
            for(int j = 0; j < 5; ++j)
            {
                int n = scanner.nextInt();
                if(n == 1)
                {
                    int c = Math.abs(2-i)+Math.abs(2-j);
                    System.out.println(c); 
                }
            }
        }
    }
}
