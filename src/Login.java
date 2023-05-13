import java.sql.*;

public class Login {
   public static void loginsystem(){
        try {
            // Connect to the database
            String url = "jdbc:mysql://localhost/OurGame";
            String username = "postgres";
            String password = "narutoplanet";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:5432/OurGame", "postgres","narutoplanet");

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter name: ");
            String inputUsername = scanner.nextLine();

            // Check if the username and password match
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, inputUsername);

            ResultSet result = statement.executeQuery();

            if (result.next()) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect username or password.");
            }

            // Close the database connection
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
