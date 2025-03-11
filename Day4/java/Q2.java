public class Q2 {
    public static String vowels(String input){
        return input.replaceAll("[AEIOUaeiou]","*");

    }

    public static void main(String[] args) {
        String input = "Program";

        System.out.println("Normal string: " + input);
        System.out.println("Modified string: " + vowels(input));
    }
}