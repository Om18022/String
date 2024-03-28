package String;

public class CountWordsWithoutSplit {
    public static void main(String[] args) {
        String s = "n afdewfd bfw dfw";
        int count = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i<s.length()-1; i++){
            if(chars[i] == ' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
