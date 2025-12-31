import java.util.Scanner;

public class CountOfChracter   {
    public static void main(String[] args){
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;

            }
        }
        System.out.println(count);
    }
}
