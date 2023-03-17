import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Läs in en fil med rövarspråk, översätt det till klartext och skriv ut det på skärmen

        Scanner fileIn = new Scanner(new File("translated.txt"));
        while (fileIn.hasNextLine()) {
            String line = fileIn.nextLine();
            for (int i=0; i < line.length(); i++) {
                char c = line.charAt(i);
                switch (c) {
                    case 'a', 'e', 'i', 'o', 'u', 'y', 'å', 'ä', 'ö' -> System.out.print(c);
                    case ' ', '.' -> System.out.print(c);
                    default -> {
                        System.out.print(c);
                        i += 2;
                    }
                }
            }
            System.out.println();
        }
    }
}