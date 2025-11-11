import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // 1. Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated: " + concat);

        // 2. Length
        System.out.println("Length of first string: " + str1.length());

        // 3. Uppercase & Lowercase
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 4. Compare
        if (str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are NOT equal");

        // 5. Substring
        if (str1.length() >= 3)
            System.out.println("Substring (first 3 chars): " + str1.substring(0, 3));
    }
}