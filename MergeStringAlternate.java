package String;

public class MergeStringAlternate {
    public static void main(String[] args) {
        String a = "ace";
        String b = "bdf";
        String c = "";

        int i = 0;
        int j = 0;

        while( i<a.length() || j<b.length()){
            if(i<a.length()){
                c+=a.charAt(i);
                i++;
            }
            if(j<b.length()){
                c+=b.charAt(j);
                j++;
            }
        }
        System.out.println(c);
    }
}
