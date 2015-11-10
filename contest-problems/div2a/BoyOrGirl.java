import java.util.*; 

public class BoyOrGirl
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();  

        boolean[] v = new boolean[256];
        int count = 0;
        for(int i = 0; i < s.length(); ++i)
        {
            if(!v[s.charAt(i)])
            {
                count++;
                v[s.charAt(i)] = true;
            
            }   
        }

        if(count % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }   
        else
        {
            System.out.println("IGNORE HIM!");
        }
    } 
}
