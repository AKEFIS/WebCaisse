package webcaisse.model;

import java.util.ArrayList;

public class Conso {

    private String nom;
    private String prenom;
    private String mail;
    private String tel;
    private ArrayList<Vente> lesVentes;

    public Conso(String nom, String prenom, String mail, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.tel = tel;
    }

    public boolean estFidele() {
        return false;
    }

    public void addUneVente(Vente uneVente) {

    }

    public int getNbVentes() {
        // À compléter  …
        return 0;
    }
    
    // retourne la collection lesVentes qui contient des instances des
    // classeVenteEcommerce et VenteMagasin
    public ArrayList<Vente> getVentes() {
        ArrayList<Vente> lesVentes = null;
        return lesVentes;
    }
}
