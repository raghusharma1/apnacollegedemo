
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        System.out.println("5 + 3 = " + arithmetic.add(5, 3));
        System.out.println("5 - 3 = " + arithmetic.subtract(5, 3));

        StringUtils stringUtils = new StringUtils();
        System.out.println("Reverse of 'hello' = " + stringUtils.reverseString("hello"));
        System.out.println("'madam' is a palindrome: " + stringUtils.isPalindrome("madam"));

        try {
            FileOperations fileOps = new FileOperations();
            String filename = "example.txt";
            fileOps.writeToFile(filename, "Hello, World!");
            System.out.println("Content of file: " + fileOps.readFromFile(filename));

            NetworkOperations networkOps = new NetworkOperations();
            String content = networkOps.fetchContentFromURL("https://www.example.com");
            System.out.println("Content from URL: " + content);

            CustomQueue<Integer> queue = new CustomQueue<>();
            queue.enqueue(1);
            queue.enqueue(2);
            System.out.println("Dequeued item: " + queue.dequeue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
