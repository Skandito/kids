/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;

import DietForKids.entities.Medecin;
import DietForKids.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karray
 */
public class MedecinDAO {

     public void insertMedecin(Medecin d){

        String requete = "insert into medecin (nomMedecin,prenomMedecin,codeMedecin,specialiteMedecin,adresseMedecin,emailMedecin,loginMedecin,mdpMedecin) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomMedecin());
            ps.setString(2, d.getPrenomMedecin());
            ps.setString(3,d.getCodeMedecin());
            ps.setString(4,d.getSpecialiteMedecin());
            ps.setString(5,d.getAddresseMedecin());
            ps.setString(6,d.getEmailMedecin());
            ps.setString(7,d.getLoginMedecin());
            ps.setString(8,d.getMdpMedecin());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateMedecin(Medecin d){
        String requete = "update medecin set nomMedecin=?,prenomMedecin=?,codeMedecin=?,specialiteMedecin=?,adresseMedecin=?,emailMedecin=?,loginMedecin=?,mdpMedecin=? where idMedecin_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomMedecin());
            ps.setString(2, d.getPrenomMedecin());
            ps.setString(3,d.getCodeMedecin());
            ps.setString(4,d.getSpecialiteMedecin());
            ps.setString(5,d.getAddresseMedecin());
            ps.setString(6,d.getEmailMedecin());
            ps.setString(7,d.getLoginMedecin());
            ps.setString(8,d.getMdpMedecin());
            ps.setInt(9,d.getIdMedecin_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteMedecin(int id){
        String requete = "delete from article where idMedecin_fk=?";
        String requete1 = "delete from commentaire where idMedecin_fk=?";
        String requete2 = "delete from conseil where idMedecin_fk=?";
        String requete3 = "delete from regime where idMedecin_fk=?";
        String requete4 = "delete from medecin where idMedecin_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(requete1);
            PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(requete2);
            PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(requete3);
            PreparedStatement ps4 = MyConnection.getInstance().prepareStatement(requete4);
            PreparedStatement Tabps[]={ps,ps1,ps2,ps3,ps4};
            for(int i=0;i<Tabps.length;i++)
            {
            Tabps[i].setInt(1, id);
            Tabps[i].executeUpdate();
            }
            System.out.println("Medecin supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Medecin findMedecinById(int id){
    Medecin medecin = new Medecin();
     String requete = "select * from medecin where idMedecin_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                medecin.setIdMedecin_pk(resultat.getInt(1));
                medecin.setNomMedecin(resultat.getString(2));
                medecin.setPrenomMedecin(resultat.getString(3));
                medecin.setCodeMedecin(resultat.getString(4));
                medecin.setSpecialiteMedecin(resultat.getString(5));
                medecin.setAddresseMedecin(resultat.getString(6));
                medecin.setEmailMedecin(resultat.getString(7));
                medecin.setLoginMedecin(resultat.getString(8));
                medecin.setMdpMedecin(resultat.getString(9));
                   
                  
            }
            return medecin;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du medecin "+ex.getMessage());
            return null;
        }
    }

    public Medecin findMedecinByNom(String nom){
    Medecin medecin = new Medecin();
     String requete = "select * from medecin where nomMedecin = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                medecin.setIdMedecin_pk(resultat.getInt(1));
                medecin.setNomMedecin(resultat.getString(2));
                medecin.setPrenomMedecin(resultat.getString(3));
                medecin.setCodeMedecin(resultat.getString(4));
                medecin.setSpecialiteMedecin(resultat.getString(5));
                medecin.setAddresseMedecin(resultat.getString(6));
                medecin.setEmailMedecin(resultat.getString(7));
                medecin.setLoginMedecin(resultat.getString(8));
                medecin.setMdpMedecin(resultat.getString(9));
            }
            return medecin;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du medecin "+ex.getMessage());
            return null;
        }
    }

    public List<Medecin> DisplayAllMedecin (){


        List<Medecin> listemedecin = new ArrayList<Medecin>();

        String requete = "select * from medecin";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                  Medecin medecin =new Medecin();
                medecin.setIdMedecin_pk(resultat.getInt(1));
                medecin.setNomMedecin(resultat.getString(2));
                medecin.setPrenomMedecin(resultat.getString(3));
                medecin.setCodeMedecin(resultat.getString(4));
                medecin.setSpecialiteMedecin(resultat.getString(5));
                medecin.setAddresseMedecin(resultat.getString(6));
                medecin.setEmailMedecin(resultat.getString(7));
                medecin.setLoginMedecin(resultat.getString(8));
                medecin.setMdpMedecin(resultat.getString(9));
                
                listemedecin.add(medecin);
            }
            return listemedecin;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des medecin "+ex.getMessage());
            return null;
        }
    }

}
