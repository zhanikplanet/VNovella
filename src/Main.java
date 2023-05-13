
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("Sorry but you are under 16 and cannot play this game");
            break;
        } else {
            menu.MainMenu();
        }
        }
    }

}