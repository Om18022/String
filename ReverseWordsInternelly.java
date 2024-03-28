package String;

public class ReverseWordsInternelly {
    public static void main(String[] args) {
        String s = "chauhan om bharatbhai";
        char[] ch = s.toCharArray();
        int left = 0;
        int right = 0;

        for(int i = 0; i< ch.length; i++){
            if(ch[i] == ' '){
                reverse(ch, left, right-1);
                left = i+1;
            }
            right++;
        }
        reverse(ch, left, right-1);
        System.out.println(ch);

    }
    private static void reverse(char[] ch, int left, int right){
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            right--;
            left++;
        }
    }
}
