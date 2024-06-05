package Strings;

public class CountEachCharactersOccurrenceInString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String printed[] = new String[str1.length()];
        int count =0;
        for(int i=0;i<str1.length();i++){
            count=1;
            for(int j=i+1;j<str1.length();j++){
                if (str1.charAt(i)==str1.charAt(j)) {
                    count= count+1;
                }else
                printed[i]=str1.substring(i);
            }
             System.out.println("Total Occurrences of: " +str1.charAt(i)+" is "+count);
        }
    }
    
}
