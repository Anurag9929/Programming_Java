package Strings;

public class FindDuplicateWordsInString {
    public static void main(String[] args) {
    //     String str1 = ("My Name is ANurag Shukla").toLowerCase();
    //     String str2[] = new String[str1.length()];
    //     int strLength = str1.length();

    //     for(int i =0;i<strLength-1;i++){
    //         if (str1.charAt(i)==' ') {
    //             str2[i]=str1.substring(i)
    //         }

    //     }
        
    // }

    String string = "Hey hi hey Anurag SHukla";    
        int count;    
            
        //Converts the string into lowercase    
        string = string.toLowerCase();    
            
        //Split the string into words using built-in function    
        String words[] = string.split(" ");    
          
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words[j] = "0";    
                }    
            }    
                
            //Displays the duplicate word if count is greater than 1    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }    
    }    
}    
    

