package String;

public class SortString {
    public static void main(String[] args) {
        String s = "adbc";
        char[] ch = s.toCharArray();

        for(int i = 0; i<s.length()-1; i++){
            for(int j = 0; j<s.length()-i-1; j++){
                if(ch[j] > ch[j+1]) {
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        System.out.println(ch);
    }
}
