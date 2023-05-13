import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class NewGame {
    public static void ng()
    {
        Scanner scan = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OurGame", "postgres", "narutoplanet");
            System.out.println("Welcome to our Visual Novella!!!");
            System.out.println("Enter your name:");
            String name = scan.nextLine();
            String insert = "INSERT INTO progress(name,scenes) VALUES(?,(?))";
            PreparedStatement insertstatement = conn.prepareStatement(insert);
            insertstatement.setString(1,name);
            insertstatement.setInt(2,0);
            insertstatement.executeUpdate();

            System.out.println("So your name is " + name);
            System.out.println("Start Game \n1.yes \n2. no");
            int choice= scan.nextInt();
            if (choice==1){
                Start.StartGame(name);
            }
            else if(choice==2){
                menu.MainMenu();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

