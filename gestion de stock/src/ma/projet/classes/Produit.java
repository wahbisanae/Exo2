package ma.projet.classes;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit{ 
    @Id
    @GeneratedValue
    private int id;
    private String reference;
    private float prix;

    public Produit() {
    }
    public Produit(int id, String reference, float prix) {
        this.id = id;
        this.reference = reference;
        this.prix = prix;
    }
    @ManyToOne
    @JoinColumn(name = "Categorie")
      private Categorie categorie;
    public int getId() {
        return id;
    }
    @OneToMany(mappedBy = "produit",fetch = FetchType.EAGER)
    private List<LigneCommandeProduit> lignesCommande;

    public void setId(int id) {
        this.id = id;
    }
   
            
            
    
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }    
}
