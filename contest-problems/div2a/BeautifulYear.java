import java.util.*; 

public class BeautifulYear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt() + 1;
        while(!unique(y))
        {
            y++;
        }

        System.out.println(y);
    }

    public static boolean unique(int n)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n%10);
        n /= 10;
        set.add(n%10);
        n /= 10;
        set.add(n%10);
        n /= 10;
        set.add(n%10);
        if(set.size() == 4)
            return true;
        return false;
    }
}
