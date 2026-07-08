package stringAssignment;

public class getOnlyNumericPartOfString {

    public static void main(String[] args) {
        String str = "your transaction id is: 12345 and reference id is 34567";

        String[] number = str.split(" ");

        for(String strNumber : number){

        //matches() is a String method in Java that checks whether a string matches a given pattern (regular expression).
            if(strNumber.matches("\\d+"))
                // ("\\d+")----> \d means any digit equivlent to(0-9) and + means one or more occurenace.

            System.out.println(strNumber);
        }

    }

}
