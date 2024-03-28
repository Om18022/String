package String;

public class CheckDigitCharcterEquelsOrNot {
    public static void main(String[] args) {
        String a = "ace1523";
        int ch = 0;
        int d = 0;

        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9'){
                d++;
            }else if(a.charAt(i) == ' '){
                continue;
            }else{
                ch++;
            }
        }
        if(ch != d){
            System.out.println("Not Match String or Digit length.");
            return;
        }
        System.out.println("String or Digit length are matched.");
    }
}
