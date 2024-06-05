package Strings;

public class IfStringContainsOnlyDigits {
    public static void main(String[] args) {
        String str1= "Anurag1";
        boolean containsDigitsOnly = true;
        int str1Length = str1.length();
        // for(int i=0;i<str1Length;i++){
        //     if ((int)str1.charAt(i)>=48 && (int)str1.charAt(i)<=57){
        //         containsDigitsOnly = true;
        //     }
        // }
        // if (containsDigitsOnly) {
        //     System.out.println("Contains Digits only!");
        // } else {
        //     System.out.println("Do Not Contains digits only");
        // }


        //To check if string contains only letters
        for(int i=0;i<str1Length;i++){
            if ((int)str1.charAt(i)>=48 && (int)str1.charAt(i)<=57){
                containsDigitsOnly = false;
            }
        }
        if (containsDigitsOnly) {
            System.out.println("Contains Letters only!");
        } else {
            System.out.println("Do Not Contains letters only");
        }
    }
    
}
