public class ReverseWords {
        public static void main(String[] args) {
            String str="hello java world";
            String reverse="";

            String[] words=str.split(" ");
            for(int i=words.length-1;i>=0;i--)
            {
                reverse=reverse + words[i]+" ";
            }
            System.out.println(str);
            System.out.println(reverse);


        }
}
