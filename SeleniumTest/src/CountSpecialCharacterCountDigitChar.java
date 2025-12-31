import java.awt.color.ColorSpace;
import java.util.Scanner;

public class CountSpecialCharacterCountDigitChar {
    public static void main(String[] args) {
       // String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
       String s = sc.nextLine();
        int count=0,space=0,SpecialCharacterCount=0,CharacterCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                space++;

            }
            else if(Character.isDigit(s.charAt(i))){
                count++;


            }
            else if(Character.isLetter(s.charAt(i))){
                CharacterCount++;
            }

            else {
                SpecialCharacterCount++;

            }

        }
        System.out.println("total number of :" + count);
        System.out.println("total number of specialcharacters:" + SpecialCharacterCount);
        System.out.println("total number of CharacterCount:" + CharacterCount);
        System.out.println("total number of spacecharacters:" + space);
    }
}
