package Strings;
class CheckPalindromeStrings{
    public static void main(String[] args) {
        String palindromeString =("Mom").toLowerCase();

        int strLength = palindromeString.length();
        String newStr ="";


        if (strLength==1) {
            System.out.println("Palindrome String");
        }
        else if(strLength>1){
            for(int i=strLength-1;i>=0;i--){
                newStr = newStr.concat(String.valueOf(palindromeString.charAt(i)));
            }
            if (palindromeString.equals(newStr)) {
                System.out.println("This is a Palindrome string");
            }else{
                System.out.println("Not a Palindrome String");
            }

        }
    }
}