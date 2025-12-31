import java.util.Scanner;

public class ReverseWordOfString    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = sc.nextLine().trim();
            String[] words = s.split(" ");
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--)
            {
                reversed.append(words[i] + " ");
            if (i != 0) {
                reversed.append(" ");
            }
        }

            System.out.println("reversed string :" + reversed.toString());



        }
}
