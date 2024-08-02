
public class StringUtils {

    public String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public int countOccurrences(String str, char ch) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}
