package Strings;

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        String str1 = " i ";
        int strLength = str1.length();
        int wordCount =0;
        for(int i=0;i<strLength;i++){
            if (str1.charAt(i)==' ' && i>1||i==strLength-1) {
                wordCount++;
            }
        }
        System.out.println("No of word:"+wordCount);

    }
    
}
