package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        if (input == null || input.equals("")) {
            return -1;
        }
        String numbered = input.replaceAll("[^0-9]", "");
        int result = 0;
        for (int i = 0; i < numbered.length(); i++) {
            result += numbered.charAt(i) - '0';
        }
        return result;
    }
}
