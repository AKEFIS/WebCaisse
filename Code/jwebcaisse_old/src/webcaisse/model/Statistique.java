package webcaisse.model;

import java.util.ArrayList;

public class Statistique {
// méthode statVente à commenter

    public static double statVente(ArrayList<Vente> lesVentesDuJour) {
        int nbVenteFidele = 0;
        for (Vente uneVente : lesVentesDuJour) {
            Conso c = uneVente.getLeConso();
            if (c.estFidele()) {
                nbVenteFidele++;
            }
        }
        return nbVenteFidele * 100 / lesVentesDuJour.size();
    }

    // méthode compareLieuVente
    public static double compareLieuVente(ArrayList<ConsoFidele> lesConsos) {
        double totalEcom = 0; //cumul des montants des ventes ecommerce
        double totalMag = 0; // cumul des montants des ventes en magasin
        //parcours de la liste des consommateurs fidèles
        for (ConsoFidele cf : lesConsos) {
            // … À compléter …
        }
        return totalMag / totalEcom; //calcul de l’indice et retour du résultat
    }

}
