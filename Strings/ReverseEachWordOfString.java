package Strings;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str1 ="Hi ANurag SHukla";
        String str1Array[] = str1.split(" ");
        for(int i=0;i<str1Array.length;i++){
            for(int p=str1Array[i].length()-1;p>=0;p--){
                    System.out.print(str1Array[i].charAt(p));
                }
                System.out.println(" ");
        }
        
    }
    
}
