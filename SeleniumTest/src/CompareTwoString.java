public class CompareTwoString {
    public static void main(String[] args) {
        String a = "ajay";
        String b = "Ajay";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        b=b.toLowerCase();
        System.out.println(a == b);
        System.out.println(a.equals(b));


    }
}
