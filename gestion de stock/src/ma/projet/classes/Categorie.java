
package ma.projet.classes;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import ma.projet.classes.Produit_;
@Entity
public class Categorie  {
   
    @Id
    @GeneratedValue
    private int id;
    private String code;
    private String libelle;
    public Categorie() {
       
    }
     public Categorie(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    @OneToMany(mappedBy = "Categorie", fetch = FetchType.EAGER) 
    private  List<Produit> produit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

   
    
    
}
