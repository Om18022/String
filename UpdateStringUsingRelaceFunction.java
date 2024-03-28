package String;

public class UpdateStringUsingRelaceFunction {
    public static void main(String[] args) {
        String s1 = "hallo";
        char ol = 'a';
        char ne = 'e';
        char[] ch = s1.toCharArray();

        for(int i = 0; i<s1.length(); i++){
            if(ch[i] ==  ol){
                ch[i] = ne;
            }
        }
        System.out.println(ch);
    }
}
