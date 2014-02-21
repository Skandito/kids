/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;

import DietForKids.entities.Parent;
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
public class ParentDAO {

     public void insertParent(Parent d){

        String requete = "insert into Parent (nomParent,prenomParent,cinParent,emailParent,adresseParent,loginParent,sexeParent,situationParent,mdpParent) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomParent());
            ps.setString(2, d.getPrenomParent());
            ps.setInt(3,d.getCinParent());
            ps.setString(4,d.getEmailParent());
            ps.setString(5,d.getAddresseParent());
            ps.setString(6,d.getLoginParent());
            ps.setString(7,d.getSexeParent());
            ps.setString(8,d.getSituationParent());
            ps.setString(9,d.getMdpParent());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateParent(Parent d){
        String requete = "update parent set nomParent=?,prenomParent=?,cinParent=?,emailParent=?,adresseParent=?,loginParent=?,sexeParent=?,situationParent=?,mdpParent=? where idParent_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomParent());
            ps.setString(2, d.getPrenomParent());
            ps.setInt(3,d.getCinParent());
            ps.setString(4,d.getEmailParent());
            ps.setString(5,d.getAddresseParent());
            ps.setString(6,d.getLoginParent());
            ps.setString(7,d.getSexeParent());
            ps.setString(8,d.getSituationParent());
            ps.setString(9,d.getMdpParent());
            ps.setInt(10, d.getIdParent_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteParent(int id){
        String requete = "delete from formule where idEnfant_fk=(select idEnfant_pk from enfant where idParent_fk=?)";
        String requete1 = "delete from aliment where idRepas_fk=(select idRepas_pk from repas where idEnfant_fk=(select idEnfant_pk from enfant where idParent_fk=?))";
        String requete2 = "delete from repas where idEnfant_fk=(select idEnfant_pk from enfant where idParent_fk=?)";
        String requete3 = "delete from commentaire where idParent_fk=?";
        String requete4 = "delete from sujet where idParent_fk=?";
        String requete5 = "delete from enfant where idParent_fk=?";
        String requete6 = "delete from parent where idParent_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(requete1);
            PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(requete2);
            PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(requete3);
            PreparedStatement ps4 = MyConnection.getInstance().prepareStatement(requete4);
            PreparedStatement ps5 = MyConnection.getInstance().prepareStatement(requete5);
            PreparedStatement ps6 = MyConnection.getInstance().prepareStatement(requete6);
            PreparedStatement Tabps[]={ps,ps1,ps2,ps3,ps4,ps5,ps6};
            for(int i=0;i<Tabps.length;i++)
            {
            Tabps[i].setInt(1, id);
            Tabps[i].executeUpdate();
            }
            System.out.println("parent supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Parent findParentById(int id){
    Parent parent = new Parent();
     String requete = "select * from parent where idParent_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                parent.setIdParent_pk(resultat.getInt(1));
                parent.setNomParent(resultat.getString(2));
                parent.setPrenomParent(resultat.getString(3));
                parent.setCinParent(resultat.getInt(4));
                parent.setEmailParent(resultat.getString(5));
                parent.setAddresseParent(resultat.getString(6));
                parent.setLoginParent(resultat.getString(7));
                parent.setSexeParent(resultat.getString(8));
                parent.setSituationParent(resultat.getString(9));
                parent.setMdpParent(resultat.getString(10));
                  
            }
            return parent;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du parent "+ex.getMessage());
            return null;
        }
    }

    public Parent findParentByNom(String nom){
    Parent parent= new Parent();
     String requete = "select * from parent where nomParent = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                parent.setIdParent_pk(resultat.getInt(1));
                parent.setNomParent(resultat.getString(2));
                parent.setPrenomParent(resultat.getString(3));
                parent.setCinParent(resultat.getInt(4));
                parent.setEmailParent(resultat.getString(5));
                parent.setAddresseParent(resultat.getString(6));
                parent.setLoginParent(resultat.getString(7));
                parent.setSexeParent(resultat.getString(8));
                parent.setSituationParent(resultat.getString(9));
                parent.setMdpParent(resultat.getString(10));
             }
            return parent;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du parent "+ex.getMessage());
            return null;
        }
    }

    public List<Parent> DisplayAllParent (){


        List<Parent> listeparent = new ArrayList<Parent>();

        String requete = "select * from parent";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                  Parent parent =new Parent();
                  parent.setIdParent_pk(resultat.getInt(1));
                  parent.setNomParent(resultat.getString(2));
                  parent.setPrenomParent(resultat.getString(3));
                  parent.setCinParent(resultat.getInt(4));
                  parent.setEmailParent(resultat.getString(5));
                  parent.setAddresseParent(resultat.getString(6));
                  parent.setLoginParent(resultat.getString(7));
                  parent.setSexeParent(resultat.getString(8));
                  parent.setSituationParent(resultat.getString(9));
                  parent.setMdpParent(resultat.getString(10));
                 
                   listeparent.add(parent);
            }
            return listeparent;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des parents"+ex.getMessage());
            return null;
        }
    }

}
