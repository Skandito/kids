/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.dao;

import DietForKids.entities.Sujet;
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
public class SujetDAO {
     public void insertSujet(Sujet s){
String requete = "insert into sujet (titreSujet,contenuSujet,etatSujet,idParent_fk) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, s.getTitreSujet());
            ps.setString(2, s.getContenuSujet());
            ps.setString(3, s.getEtatSujet());
            ps.setInt(4,s.getIdParent_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
      public void deleteSujet(int id){
          String requete = "delete from commentaire where idSujet_fk=?";
          String requete1 = "delete from sujet where idSujet_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(requete1);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps1.setInt(1, id);
            ps1.executeUpdate();
            System.out.println("Sujet supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
     
     public void updateSujet(Sujet s){
         
        String requete = "update sujet set titreSujet=?, contenuSujet=?, etatSujet=?, idParent_fk=? where idSujet_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, s.getTitreSujet());
            ps.setString(2, s.getContenuSujet());
            ps.setString(3, s.getEtatSujet());
            ps.setInt(4, s.getIdParent_fk());
            ps.setInt(5, s.getIdSujet_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
}
     
      public Sujet findSujetById(int id){
    Sujet sujet = new Sujet();
     String requete = "select * from sujet where idSujet_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                sujet.setIdSujet_pk(resultat.getInt(1));
                sujet.setTitreSujet(resultat.getString(2));
                sujet.setContenuSujet(resultat.getString(3));
                sujet.setEtatSujet(resultat.getString(4));
                sujet.setIdParent_fk(resultat.getInt(5));
            }
            return sujet;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du sujet "+ex.getMessage());
            return null;
        }
    }
     
     public Sujet findSujetByTitre(String titre){
    Sujet Suj = new Sujet();
     String requete = "select * from sujet where titreSujet = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, titre);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                Suj.setIdSujet_pk(resultat.getInt(1));
                Suj.setTitreSujet(resultat.getString(2));
                Suj.setContenuSujet(resultat.getString(3));
                Suj.setEtatSujet(resultat.getString(4));
                Suj.setIdParent_fk(resultat.getInt(5));
            }
            return Suj;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du sujet "+ex.getMessage());
            return null;
        }
    }
 
   public List<Sujet> DisplayAllSujets (){


        List<Sujet> listesujets = new ArrayList<Sujet>();

        String requete = "select * from sujet";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Sujet sujet =new Sujet();
                sujet.setIdSujet_pk(resultat.getInt(1));
                sujet.setTitreSujet(resultat.getString(2));
                sujet.setContenuSujet(resultat.getString(3));
                sujet.setEtatSujet(resultat.getString(4));
                sujet.setIdParent_fk(resultat.getInt(5));
                
                listesujets.add(sujet);
            }
            return listesujets;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }  
     
}
