package ma.projet.classes;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
 public class Lignecommande implements Serializable{
    private int produit;
    private int commande;

    public Lignecommande () {
    }

    public int getProduit() {
        return produit;
    }

    public void setProduit(int produit) {
        this.produit = produit;
    }

    public int getCommande() {
        return commande;
    }

    public void setCommande(int commande) {
        this.commande = commande;
    }

    public Lignecommande(int produit, int commande) {
        this.produit = produit;
        this.commande = commande;
    }
}