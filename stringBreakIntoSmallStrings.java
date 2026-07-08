package stringAssignment;

public class stringBreakIntoSmallStrings {

    public static void main(String[] args) {

        String str = "Welcome to NLTech Automation Training";

        String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
