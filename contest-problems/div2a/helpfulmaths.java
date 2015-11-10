import java.util.*; 

public class helpfulmaths
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] a = new int[(s.length()/2)+1];
        for(int i = 0; i < s.length(); i += 2)
        {
            a[i/2] = s.charAt(i) - '0';
        }

        Arrays.sort(a);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a.length-1; ++i)
        {
            sb.append(a[i]);
            sb.append('+');
        }
        sb.append(a[a.length-1]);

        System.out.println(sb.toString());
    }
}
