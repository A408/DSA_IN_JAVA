import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Print basic greeting
        System.out.println("Hello, World!");

        // Initialize StringBuilder with the initial content "Hello"
        StringBuilder sb = new StringBuilder("Hello");

        // Check total capacity (Default initial capacity 16 + length of string 5 = 21)
        System.out.println(sb.capacity());

        // Get current character length of the StringBuilder
        System.out.println(sb.length());

        // Get character at index 2 (0-indexed: 'l')
        System.out.println(sb.charAt(2));

        // Modify/replace character at index 0 to 'y' ("Hello" -> "yello")
        sb.setCharAt(0, 'y');
        System.out.println(sb);

        // Append text to the end of the StringBuilder ("yello" -> "yello World")
        sb.append(" World");
        System.out.println(sb);

        // Insert character 'w' at index 5 ("yello World" -> "yellow World")
        sb.insert(5, 'w');
        System.out.println(sb);

        // Delete character at index 5 ("yellow World" -> "yello World")
        sb.deleteCharAt(5);
        System.out.println(sb);

        // Delete a range of characters from index 0 up to 6 (excl. index 6) ("yello World" -> "World")
        sb.delete(0, 6);
        System.out.println(sb);

        // Replace range from index 0 to 5 with new string "Hello" ("World" -> "Hello")
        sb.replace(0, 5, "Hello");
        System.out.println(sb);

        // Reverse the character sequence ("Hello" -> "olleH")
        sb.reverse();
        System.out.println(sb);

        // Convert StringBuilder instance back to a standard String object
        System.out.println(sb.toString());
    }
}