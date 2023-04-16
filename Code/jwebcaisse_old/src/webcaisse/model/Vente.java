package webcaisse.model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Vente {

    private Date dateVente;
    private Conso leConso;
    private double montant;
    
    // constructeur qui valorise les attributs d'un objet de la classe Vente
    public Vente(Date dateVente, Conso leConso, double montant) {
        this.dateVente = dateVente;
        this.leConso = leConso;
        this.montant = montant;
    }

    public double getMontantVente() {
        return this.montant;
    }

    public Conso getLeConso() {
        return this.leConso;
    }

}
