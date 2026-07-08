package stringAssignment;

public class printFirstAndLastCharacter {

    public static void main(String[] args) {
        
        String str = "Automation";
      
        System.out.println(str.length());

        //int lastIndex = str.length() - 1;

        System.out.println("First Character is: " +str.charAt(0));
        System.out.println("Last Character is :" +str.charAt(str.length()-1));

    }

}
