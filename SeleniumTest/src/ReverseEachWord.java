public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Hello Java World";

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";

            // reverse each word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }

            result = result + reversedWord + " ";
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed Each Word: " + result.trim());
    }
}
