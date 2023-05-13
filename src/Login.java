import java.sql.*;
import java.util.Scanner;

public class Login {
   public static void loginsystem(){
       Scanner scanner = new Scanner(System.in);
        try {

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/OurGame", "postgres","narutoplanet");

            System.out.print("Enter name: ");
            String inputname = scanner.nextLine();
            System.out.print("Enter scene: ");
            int inputscene= scanner.nextInt();

            // Check if the name and progress match
            String sql = "SELECT * FROM progress WHERE name = ? AND scenes = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, inputname);
            statement.setInt(2,inputscene);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                System.out.println(result.getString("scenes"));
                System.out.println("Continue Game \n1.yes \n2. no");
            } else {
                System.out.println("Incorrect name .");
            }
            int choice= scanner.nextInt();
            if (choice==1){
                ContinueGame.continuegame();
            }
            else if(choice==2){
                menu.MainMenu();
            }

            // Close the database connection
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
