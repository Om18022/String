package String;

public class CheckWordsPalindromeOrNot {
    public static void main(String[] args) {
        String s = "manam naman buh";
        String[] sh = s.split(" ");

        for( String a : sh){
            if(ispalindrome(a) == false){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }

    private static boolean ispalindrome(String s){
        int left = 0; int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
