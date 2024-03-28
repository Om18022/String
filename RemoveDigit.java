package String;

public class RemoveDigit {
    public static void main(String[] args) {
        String s = "chau5h1an";
        char[] ch = s.toCharArray();

        String a = "";
        for(int i = 0; i<s.length(); i++){
            if(ch[i] >= '0' && ch[i] <= '9'){
                continue;
            }else{
                a += ch[i];
            }
        }
        System.out.println(a);
    }
}
