package SlidingWindow;

public class FreqArray {
    public static void main(String args[]){
        String s = "jknlfjkbwqhrbfjsdlnksfjbqlibjnsjfnbjksdlnibwiufbwinfdjvhl";
        int [] freq = new int[26];
        for(char ch:s.toCharArray()) freq[ch -'a']++;

        for(int i  = 0;i < 26;i++){
            System.out.println((char)(97 +i) + "->" + freq[i] );
        }
    }
}
