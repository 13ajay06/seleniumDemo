import java.util.Scanner;

public class CountNumberWords       {
    public static void main(String[] args) {

       // String s=new String();
        int count=1;
        //int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
       String s = sc.nextLine();
        //int i;
        for(int i=0;i<s.length()-1;i++)
        {
            char c,d;
            c=s.charAt(i);
            d=s.charAt(i+1);
            if(c==' ' && d!= ' ')
                count++;

        }
        System.out.println("total number of words:" + count);
    }
}
