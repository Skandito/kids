/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.dao;
import DietForKids.entities.Repas;
import DietForKids.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DEll
 */
public class RepasDAO {
    public void insertRepas(Repas r){
String requete = "insert into repas (nomRepas,dateRepas,etatRepas,nbrCalRepas,idEnfant_fk) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getNomRepas());
            ps.setString(2, r.getDateRepas());
            ps.setString(3, r.getEtatRepas());
            ps.setDouble(4, r.getNbrcalorieRepas());
            ps.setInt(5, r.getIdEnfant_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void deleteRepas(int id){
        String requete = "delete from aliment where idRepas_fk=?";
        String requete1 = "delete from repas where idRepas_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(requete1);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps1.setInt(1, id);
            ps1.executeUpdate();
            System.out.println("Repas supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public void updateRepas(Repas r){
         
        String requete = "update repas set nomRepas=?, dateRepas=?, etatRepas=?, nbrCalRepas=?, idEnfant_fk=? where idRepas_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getNomRepas());
            ps.setString(2, r.getDateRepas());
            ps.setString(3, r.getEtatRepas());
            ps.setDouble(4, r.getNbrcalorieRepas());
            ps.setInt(5, r.getIdEnfant_fk());
            ps.setInt(6, r.getIdRepas_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
}

 
      public Repas findRepasById(int id){
    Repas repas = new Repas();
     String requete = "select * from repas where idRepas_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                repas.setIdRepas_pk(resultat.getInt(1));
                repas.setNomRepas(resultat.getString(2));
                repas.setDateRepas(resultat.getString(3));
                repas.setEtatRepas(resultat.getString(4));
                repas.setNbrcalorieRepas(resultat.getDouble(5));
                repas.setIdEnfant_fk(resultat.getInt(6));
            }
            return repas;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Repas "+ex.getMessage());
            return null;
        }
    }
     
    public Repas findRepasByNom(String nom){
    Repas repas = new Repas();
     String requete = "select * from repas where nomRepas = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                repas.setIdRepas_pk(resultat.getInt(1));
                repas.setNomRepas(resultat.getString(2));
                repas.setDateRepas(resultat.getString(3));
                repas.setEtatRepas(resultat.getString(4));
                repas.setNbrcalorieRepas(resultat.getDouble(5));
                repas.setIdEnfant_fk(resultat.getInt(6));
            }
            return repas;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du sujet "+ex.getMessage());
            return null;
        }
    }
 
   public List<Repas> DisplayAllRepas (){


        List<Repas> listerepas = new ArrayList<Repas>();

        String requete = "select * from repas";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Repas repas =new Repas();
                repas.setIdRepas_pk(resultat.getInt(1));
                repas.setNomRepas(resultat.getString(2));
                repas.setDateRepas(resultat.getString(3));
                repas.setEtatRepas(resultat.getString(4));
                repas.setNbrcalorieRepas(resultat.getDouble(5));
                repas.setIdEnfant_fk(resultat.getInt(6));
                
                listerepas.add(repas);
            }
            return listerepas;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }   
    
}
