package Strings;

public class CountOccurrencesOfWordsInString {
    public static void main(String[] args) {
        String str1 ="Hello World Bye bye".toLowerCase();
        String str1Array[] = str1.split(" "); 
        int count=1; 
        for(int i=0;i<str1Array.length;i++){
            for(int j=i+1;j<str1Array.length;j++){
                if (str1Array[i].equals(str1Array[j])) {
                    count++;
                }
            }
            System.out.println("Occurrences of word "+str1Array[i]+" is: "+count);
        }

    }
    
}
