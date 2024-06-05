package Strings;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String usrString = "HElo";
        int strLength = usrString.length();

        for(int i=0;i<strLength-1;i++){
            char originalChar = usrString.charAt(i);
            for(int j=i+1;j<strLength-1;j++){
                if (usrString.charAt(i)==usrString.charAt(j)) {
                    System.out.println("Duplicate Characters Found");
                    System.exit(1);
                }
            } 
        }System.out.println("Duplicate Characters Not Found");

    }
    
}
