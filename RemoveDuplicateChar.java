package String;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "manamnsdubu";
        System.out.println("New String : " + removestr(s));
    }

    public static String removestr(String s){
        String s1 = "";

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(s1.indexOf(ch) == -1){
                s1 += ch;
            }
        }
        return s1;
    }
}
