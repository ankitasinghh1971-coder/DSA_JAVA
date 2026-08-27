package Recursion;

public class ReverseString {
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String result = reverse("hello");
        System.out.println(result);  // Output: "olleh"
    }
}


