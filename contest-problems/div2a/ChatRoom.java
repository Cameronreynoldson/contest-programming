import java.util.*; 

public class ChatRoom
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String h = "hello";
        int index = 0;
        for(int i = 0; i < s.length(); ++i)
        {
            if(index == h.length()) break;
            if(s.charAt(i) == h.charAt(index))
            {
                index++;
            }
        }

        if(index == h.length())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
