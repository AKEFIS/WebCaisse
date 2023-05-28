package technic;
import java.sql.*;

public class ConnectDB {
    private Connection connection = null;
    private final String url = "jdbc:mysql://mysql-webcaisse.alwaysdata.net/webcaisse_ap2";
    private final String utilisateur = "webcaisse";
    private final String motDePasse = "Btssio82300";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, utilisateur, motDePasse);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
