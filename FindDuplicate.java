package String;

public class FindDuplicate {
    public static void main(String[] args) {
        String s = "chauhan";
        char[] ch = s.toCharArray();
        int count = 0;
        int arr[] = new int[128];

        for(int i = 0; i<ch.length; i++){
            int asc = s.charAt(i);
            arr[asc] += 1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 1){
                System.out.println((char) i);
            }
        }

    }
}
