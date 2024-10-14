
package ma.projet.classes;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeProduit {
    @EmbeddedId
    private Lignecommande pk;
    
    @ManyToOne
    @JoinColumn(name = "produit",insertable = false, updatable = false)
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "commande",insertable = false, updatable = false)
    private Commande commande;
    
    private int quantite;

    public LigneCommandeProduit() {
    }

    public LigneCommandeProduit(Lignecommande pk, Produit produit, Commande commande, int quantite) {
        this.pk = pk;
        this.produit = produit;
        this.commande = commande;
        this.quantite = quantite;
    }

    public Lignecommande getPk() {
        return pk;
    }

    public void setPk(Lignecommande pk) {
        this.pk = pk;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}