import java.util.*; 

public class Translation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ss = scanner.next();
        solve(s,ss);
    }

    public static void solve(String s, String ss)
    {

        if(s.length() != ss.length())
        {
            System.out.println("NO");
            return;
        }
        for(int i = 0; i < s.length(); ++i)
        {
            if(s.charAt(i) != ss.charAt(ss.length()-i-1))
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
