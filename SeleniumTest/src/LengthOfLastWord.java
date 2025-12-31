import java.util.Scanner;

public class LengthOfLastWord
{
public static  void main(String[] args)
{
    String s=new String();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    s=sc.nextLine();
    s=s.trim();
    int i,count=0;
    //int i=s.length()-1;
    for (i=s.length()-1;i>=0;i--){
        if (s.charAt(i)!=' '){
            count++;

        }
        else {
            break;
        }

    }
    System.out.println("count "+ count);


}
}

