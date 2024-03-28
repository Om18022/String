package String;

public class PrintReverse {
    public static void main(String[] args) {
        String s = "good morning";
        char[] chars = s.toCharArray();
        int start = 0; int end = s.length()-1;
        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        s = new String(chars);
        System.out.println(s);
    }
}
