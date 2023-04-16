package DAO;

import java.sql.*;
import java.util.*;
import model.PointDeVente;
import technic.ConnectDB;

public class PointDeVenteDAO {

    private ConnectDB connectDB;

    public PointDeVenteDAO(ConnectDB connectDB) {
        this.connectDB = connectDB;
    }

    public void create(PointDeVente pointDeVente) {
        String sql = "INSERT INTO PointDeVente (IDFormuleFidelisation, IDClient, Adresse, CodePostal, Ville, NomPointDeVente) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, pointDeVente.getIdFormuleFidelisation());
            statement.setInt(2, pointDeVente.getIdClient());
            statement.setString(3, pointDeVente.getAdresse());
            statement.setInt(4, pointDeVente.getCodePostal());
            statement.setString(5, pointDeVente.getVille());
            statement.setString(6, pointDeVente.getNomPointDeVente());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PointDeVente read(int idPointDeVente) {
        PointDeVente pointDeVente = null;
        String sql = "SELECT * FROM PointDeVente WHERE IDPointDeVente = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, idPointDeVente);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    pointDeVente = new PointDeVente(resultSet.getInt("IDPointDeVente"),
                            resultSet.getInt("IDFormuleFidelisation"),
                            resultSet.getInt("IDClient"),
                            resultSet.getString("Adresse"),
                            resultSet.getInt("CodePostal"),
                            resultSet.getString("Ville"),
                            resultSet.getString("NomPointDeVente"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pointDeVente;
    }

    public void update(PointDeVente pointDeVente) {
        String sql = "UPDATE PointDeVente SET IDFormuleFidelisation = ?, IDClient = ?, Adresse = ?, CodePostal = ?, Ville = ?, NomPointDeVente = ? WHERE IDPointDeVente = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, pointDeVente.getIdFormuleFidelisation());
            statement.setInt(2, pointDeVente.getIdClient());
            statement.setString(3, pointDeVente.getAdresse());
            statement.setInt(4, pointDeVente.getCodePostal());
            statement.setString(5, pointDeVente.getVille());
            statement.setString(6, pointDeVente.getNomPointDeVente());
            statement.setInt(7, pointDeVente.getIdPointDeVente());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(PointDeVente pointDeVente) {
        String sql = "DELETE FROM PointDeVente WHERE IDPointDeVente = ?";

        try (Connection connexion = connectDB.getConnection(); PreparedStatement statement = connexion.prepareStatement(sql)) {

            statement.setInt(1, pointDeVente.getIdPointDeVente());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<PointDeVente> getAllPointDeVente() {
        String sql = "SELECT * FROM PointDeVente";
        List<PointDeVente> pointsDeVente = new ArrayList<>();
        try (Connection connexion = connectDB.getConnection(); Statement statement = connexion.createStatement()) {

            try (ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    PointDeVente pointDeVente = new PointDeVente(resultSet.getInt("IDPointDeVente"),
                            resultSet.getInt("IDFormuleFidelisation"),
                            resultSet.getInt("IDClient"),
                            resultSet.getString("Adresse"),
                            resultSet.getInt("CodePostal"),
                            resultSet.getString("Ville"),
                            resultSet.getString("NomPointDeVente"));
                    pointsDeVente.add(pointDeVente);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pointsDeVente;
    }
}
