package String;

public class CountFrequencyCharacters {
    public static void main(String[] args) {
        String s = "adbbiuegfhwegvbcfhgyuc";
        int arr[] = new int[128];

        for(int i = 0; i<s.length(); i++){
            int asc = s.charAt(i);
            arr[asc] = arr[asc] + 1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                char ch = (char) i;
                System.out.println(ch + ":" + arr[i]);
            }
        }
    }
}
