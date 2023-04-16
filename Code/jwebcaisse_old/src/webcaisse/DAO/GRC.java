package webcaisse.DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import webcaisse.model.Conso;
import webcaisse.technic.ConnectDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GRC {

    public static ArrayList<Conso> listeConsoAFideliser() {

        ArrayList<Conso> lesConsos = new ArrayList<Conso>();

        try {
            //Connexion à la base de données

            Connection con = ConnectDB.getConnect();
            Statement dbStatement = con.createStatement();
            //Création de la requête
            String requete = "select distinct nom, prenom, tel, mail"
                    + " from Conso "
                    + "join Vente on idConso = Conso.id"
                    + " where Conso.id not in (select id from ConsoFidele)"
                    + " and datediff(now(), dateVente)<30";
            //Exécution de la requête
            ResultSet res = dbStatement.executeQuery(requete);
            //Pour chaque enregistrement résultat de la requête
            while (res.next()) {
                //Création d’un objet de la classe Conso avec les données
                Conso leConso = new Conso(res.getString(1), res.getString(2),
                        res.getString(3), res.getString(4));
                //ajout du Consommateur à la liste des Consommateurs
                lesConsos.add(leConso);
            }
            // fermeture de la connexion à la BD
            res.close();
            dbStatement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB : Erreur traitement base de données : listeConsoAFideliser");
        }
        return lesConsos;
    }
}
