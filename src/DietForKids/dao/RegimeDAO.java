/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.dao;
import DietForKids.entities.Regime;
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
public class RegimeDAO {
    
     public void insertRegime(Regime r){
String requete = "insert into regime (nomRegime,typeRegime,descriptRegime,idMedecin_fk) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getNomRegime());
            ps.setString(2, r.getTypeRegime());
            ps.setString(3, r.getDescriptionRegime());
            ps.setInt(4, r.getIdMedecin_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void deleteRegime(int id){
        String requete = "delete from regime where idRegime_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Régime supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public void updateRegime(Regime r){
         
        String requete = "update regime set nomRegime=?, typeRegime=?, descriptRegime=?, idMedecin_fk=? where idRegime_pk=";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, r.getNomRegime());
            ps.setString(2, r.getTypeRegime());
            ps.setString(3, r.getDescriptionRegime());
            ps.setInt(4, r.getIdMedecin_fk());
            ps.setInt(5, r.getIdRegime_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
}
    
     public Regime findRegimeById(int id){
    Regime regime = new Regime();
     String requete = "select * from regime where idRegime_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                regime.setIdRegime_pk(resultat.getInt(1));
                regime.setNomRegime(resultat.getString(2));
                regime.setTypeRegime(resultat.getString(3));
                regime.setDescriptionRegime(resultat.getString(4));
                regime.setIdMedecin_fk(resultat.getInt(5));
            }
            return regime;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
    
public Regime findRegimeByNom(String nom){
    Regime regime = new Regime();
     String requete = "select * from regime where nomRegime = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                regime.setIdRegime_pk(resultat.getInt(1));
                regime.setNomRegime(resultat.getString(2));
                regime.setTypeRegime(resultat.getString(3));
                regime.setDescriptionRegime(resultat.getString(4));
                regime.setIdMedecin_fk(resultat.getInt(5));
            }
            return regime;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Regime "+ex.getMessage());
            return null;
        }
    }    
  
public List<Regime> DisplayAllRegime (){


        List<Regime> listeregimes = new ArrayList<Regime>();

        String requete = "select * from regime";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Regime regime =new Regime();
                regime.setIdRegime_pk(resultat.getInt(1));
                regime.setNomRegime(resultat.getString(2));
                regime.setTypeRegime(resultat.getString(3));
                regime.setDescriptionRegime(resultat.getString(4));
                regime.setIdMedecin_fk(resultat.getInt(5));
                
                listeregimes.add(regime);
            }
            return listeregimes;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }   
    
}
