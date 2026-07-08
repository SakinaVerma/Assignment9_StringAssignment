package stringAssignment;

public class stringIndex {

    public static int getIndex(String str, String search) {

        return str.indexOf(search);

    }

    public static void main(String[] args) {

        String str = "Welcome to Automation Training";

        System.out.println(getIndex(str, "Automation"));
          System.out.println(getIndex(str, "Java"));

    }

}
