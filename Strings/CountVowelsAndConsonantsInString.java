package Strings;
public class CountVowelsAndConsonantsInString {
    public static void main(String[] args) {
        String str1 = "Hello Anurag Shukla.Hope you are doing good";
        int vowelCount     = 0;
        int consonentCount = 0;
        int strLength      = str1.length();
        for(int i =0;i<strLength;i++){
            if (str1.charAt(i)=='a'||str1.charAt(i)=='A'||
                str1.charAt(i)=='e'||str1.charAt(i)=='E'||
                str1.charAt(i)=='i'||str1.charAt(i)=='I'||
                str1.charAt(i)=='o'||str1.charAt(i)=='O'||
                str1.charAt(i)=='u'||str1.charAt(i)=='U') 
            {
                vowelCount++;
            }
            else{
                if (str1.charAt(i)==' '||str1.charAt(i)==','||str1.charAt(i)=='.') 
                {
                    continue;
                }else
                {
                    consonentCount++;
                }
            }
        }
        System.out.println("Vowels count are:"     +vowelCount);
        System.out.println("Consonants count are:" +consonentCount);
    }
    
}
