import java.util.Scanner;
public class menu {
    public static void MainMenu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose the option");
        System.out.println("1. New Game");
        System.out.println("2. Continue Game");
        System.out.println("3. About Us");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                NewGame.ng();
                break;
            case 2:
                ContinueGame.continuegame();
                break;
            case 3:
                AboutUS.aboutus();
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
