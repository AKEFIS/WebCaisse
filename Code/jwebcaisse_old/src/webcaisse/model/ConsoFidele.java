package webcaisse.model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ConsoFidele extends Conso {

    private Date dateNaiss;
    private double pointsFidelite; // contient un nombre de points ou un montant
    private Date dateInscription;

    public ConsoFidele(String nom, String prenom, String mail, String tel, Date dateNaiss, Date dateInscription) {
        super(nom, prenom, mail, tel);
        this.dateNaiss = dateNaiss;
        this.dateInscription = dateInscription;
    }

    @Override
    public boolean estFidele() {
        return true;
    }

    public void addFidelite(int typeFidelite, double montant) {
        // typeFidelite contient le type de programme de fidélisation choisi (1, 2 ou 3)
        // montant contient la valeur du montant d’achat réalisé
        switch (typeFidelite) {
            case 1:
                this.pointsFidelite++;
                break;
            case 2:
                this.pointsFidelite += montant;
                break;
            case 3:
                if (montant >= 100 && montant <= 200) {
                    this.pointsFidelite += 10;
                } else if (montant > 200 && montant <= 500) {
                    this.pointsFidelite += 20;
                } else if (montant > 500) {
                    this.pointsFidelite += 50;
                }
                break;
        }
    }

    public double getPointsFidelite() {
        double pts = 0;
        return pts;
    }
}
