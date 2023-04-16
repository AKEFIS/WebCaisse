package jwebcaisse;
import java.sql.*;
import technic.ConnectDB;

/**
 *
 * @author AKEFIS
 */
public class Jwebcaisse {

    public static void main(String[] args) {
        System.out.println("Build OK.");
        
        // Test connection BDD
        ConnectDB db = new ConnectDB();
        Connection connection = db.getConnection();
        
        // Test requête
        try {
            String sql = "SELECT * FROM Client WHERE IDClient = ? OR NOM = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, "CURTIL");
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()){
                int id = resultSet.getInt("IDClient");
                String nom = resultSet.getString("Nom");
                String prenom = resultSet.getString("Prenom");
                System.out.println("ID : " + id + " | Nom : " + nom + " | Prénom : " + prenom);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
