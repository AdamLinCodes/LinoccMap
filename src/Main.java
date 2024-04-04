// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinoccMap<Character> charOccMap = new LinoccMap<>();

        String s = "ADAM NICHOLAS WHALEY LIN";

        for (char c : s.toCharArray()) {
            charOccMap.add(c);
        }

        for (char c : s.toCharArray()) {
            System.out.println("The '" + c +"' character occurs " + charOccMap.occurrences(c) + " times.");
        }
    }
}