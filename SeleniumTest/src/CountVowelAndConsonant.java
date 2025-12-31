import java.util.Scanner;

public class CountVowelAndConsonant
{
    public static  void main(String[] args)
    {
       // String s= new String();
        int i,vol,con;
        vol=0;con=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
       String s = input.nextLine();
        s=s.toUpperCase();
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                vol++;
                else
                    con++;
            }
        }
        System.out.print(vol+" "+con);
    }
}
