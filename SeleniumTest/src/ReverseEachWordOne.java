public class ReverseEachWordOne {
    public static void main(String[] args) {

        String str = "Hello Java World";
        String[] words = str.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String revWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            result = result + revWord + " ";
        }

        System.out.println(result.trim());
    }
}
