package String;

public class RemoveVovels {
    public static void main(String[] args) {
        String s = "chauhan";
        char[] ch = s.toCharArray();
        String s1 = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!(c == 'a' || c == 'A' ||c == 'e' || c == 'E'||c == 'i' || c == 'I'||c == 'o' || c == 'O'||c == 'u' || c == 'U')){
                s1 += c;
            }
        }
        System.out.println(s1);
    }
}
