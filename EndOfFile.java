import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        // Read lines until the end of file (EOF) is reached
        while (scanner.hasNext()) {
            // Read the next line
            String line = scanner.nextLine();
            // Print the line number followed by the line content

            if(line.equals("exit"))  // or we cannot use   if(line=="exit")
                break;

            System.out.println(lineNumber + " " + line);
            // Increment the line number
            lineNumber++;
        }

        // Close the scanner
        scanner.close();
    }
}
