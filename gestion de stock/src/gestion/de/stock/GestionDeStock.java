package gestion.de.stock;

import ma.projet.util.HibernateUtil;

public class GestionDeStock {
    public static void main(String[] args) {
       HibernateUtil.getSessionFactory().openSession();
    }
    
}
