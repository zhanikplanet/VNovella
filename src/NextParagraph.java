import java.util.Scanner;
public class NextParagraph {
    public static void nextP(String text) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        if(key == "") {
            System.out.println(text);
        }
    }
}


