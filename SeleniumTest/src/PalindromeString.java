public class PalindromeString {
    public static void main(String[] args) {
        String palindromeString = "madam";
        String rev = "";
        int len = palindromeString.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + palindromeString.charAt(i);

        }
        System.out.println(rev);

        if (palindromeString.equals(rev)) {
            System.out.println(palindromeString +    "  is a palindrome.");

        }
            else{
                System.out.println("Not Palindrome");

            }
        }

    }
