package stringAssignment;

public class reverseName {

    public static void main(String[] args) {

        String reverse = "Sakina";

        System.out.println(reverse.length());

        for (int i = reverse.length() - 1; i >= 0; i--) {

            System.out.print(reverse.charAt(i));

        }
    }

}
