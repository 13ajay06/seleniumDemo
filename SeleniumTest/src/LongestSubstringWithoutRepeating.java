import java.util.Scanner;

public class LongestSubstringWithoutRepeating {
   // public static void main(String args[]) {
        public  static int lengthOfLongestSubString(String s)
        {

            int left = 0, right = 0;
            int[] arr = new int[256];
            int maxlength = 0;

            while (right < s.length())
            {
                char currentChar = s.charAt(right);
                int currentCharAscii =   currentChar;
                arr[currentCharAscii]=arr[currentCharAscii]+1;

                while(arr[currentCharAscii]>1)
                {
                    char leftChar = s.charAt(left);
                    int leftCharAscii =   leftChar;
                    arr[leftCharAscii]=arr[leftCharAscii]-1;
                    left++;


                }
                int currentWindowSize=right - left + 1;
                if(currentWindowSize>maxlength)
                {
                    maxlength=currentWindowSize;

                }
                right++;
            }
            return maxlength;



        }
        public  static void main(String[] args)
        {
            String s="abcabcbbcfgh";
            System.out.println("Longest substring length: " +
                    lengthOfLongestSubString(s));
        }

    }

