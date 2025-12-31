    public class FirstUniqueCharacter {

        public static char firstUniqueChar(String s) {

            int[] freq = new int[256]; // ASCII

            // Count frequency
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i)]++;
            }

            // Find first character with frequency 1
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i)] == 1) {
                    return s.charAt(i);
                }
            }

            return '\0'; // no unique character
        }

        public static void main(String[] args) {
            String s = "ajaj";

            char result = firstUniqueChar(s);
            if (result != '\0') {
                System.out.println("First unique character: " + result);
            } else {
                System.out.println("No unique character found");
            }
        }
    }


