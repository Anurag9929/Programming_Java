package Strings;

public class CapitalizeFirstCharacterOfEachWordsOfString {
    public static void main(String[] args) {
        String str1 ="this is indore indore is good";
        int str1Lenght =str1.length();
        String strArray[]= str1.split(" ");
        for(int i=0;i<strArray.length;i++){
            for(int j=0;j<strArray[i].length();j++){
                if (j==0) {
                    System.out.print(String.valueOf(strArray[i].charAt(j)).toUpperCase());
                }else
                System.out.print(strArray[i].charAt(j)); 
            }
            System.out.print(" ");
        }
    }
    
}
