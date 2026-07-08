package stringAssignment;


public class containsCharacter {

    public static void main(String[] args) {
        
        String str = "Hello My name is Eva ";

        if (str.toLowerCase().contains("eva")) {

            System.out.println("Eva is in Given String");

        }
        else{
            System.out.println(" Eva is Not in given String");
        }
    
    }

}
