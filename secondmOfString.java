package stringAssignment;

public class secondmOfString {

    public static void main(String[] args) {
        
        String str = "Welcome to NLTech Automation Training !";
         System.out.println(str.indexOf("m"));

         System.out.println(str.indexOf('m',str.indexOf('m')+1));
    }


}