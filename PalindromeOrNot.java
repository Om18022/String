package String;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String s = "non";
        char[] chars = s.toCharArray();
        int start = 0; int end = s.length()-1;
        while(start < end){
            if(chars[start] != chars[end]){
                System.out.println("Not Palindrome.");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome.");
    }
}
