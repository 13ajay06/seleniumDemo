public class ReverseNumber {
    public static void main(String[] args) {
        int number = 5432;
        int reverse = 0, rem;
        while(number!=0)
        {
            rem = number % 10;
            reverse =reverse*10+rem;
            number = number/10;

            //System.out.println("Reversed number :" + reverse);

        }

        System.out.println("Reversed number :" + reverse);
        }
    }

