
package ma.projet.classes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande  {
    
    @Id
    @GeneratedValue
    private int id ;
    private Date date;

    public Commande() {
    }
    public Commande(int id, Date date) {
        this.id = id;
        this.date = date;
    }
   @OneToMany(mappedBy = "commande",fetch = FetchType.EAGER)
    private List<LigneCommandeProduit> lignesCommande;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
    
}
