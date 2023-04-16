/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technic;
import java.sql.*;
/**
 *
 * @author AKEFIS
 */
public class ConnectDB {
    private Connection connection = null;
    private final String url = "jdbc:mysql://mysql-webcaisse.alwaysdata.net:3306/webcaisse_ap2";
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
