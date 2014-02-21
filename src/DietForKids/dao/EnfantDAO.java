/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;

import DietForKids.entities.Enfant;
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
public class EnfantDAO {

     public void insertEnfant(Enfant d){

        String requete = "insert into enfant (nomEnfant,prenomEnfant,ageEnfant,sexeEnfant,poidsEnfant,tailleEnfant,imcEnfant,idParent_fk) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomEnfant());
            ps.setString(2, d.getPrenomEnfant());
            ps.setInt(3,d.getAgeEnfant());
            ps.setString(4,d.getSexeEnfant());
            ps.setDouble(5,d.getPoidsEnfant());
            ps.setDouble(6,d.getTailleEnfant());
            ps.setDouble(7,d.getImcEnfant());
            ps.setInt(8,d.getId_Parent_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateEnfant(Enfant d){
        String requete = "update enfant set nomEnfant=?,prenomEnfant=?,ageEnfant=?,sexeEnfant=?,poidsEnfant=?,tailleEnfant=?,imcEnfant=?,idParent_fk=? where idEnfant_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomEnfant());
            ps.setString(2, d.getPrenomEnfant());
            ps.setInt(3,d.getAgeEnfant());
            ps.setString(4,d.getSexeEnfant());
            ps.setDouble(5,d.getPoidsEnfant());
            ps.setDouble(6,d.getTailleEnfant());
            ps.setDouble(7,d.getImcEnfant());
            ps.setInt(8,d.getId_Parent_fk());
            ps.setInt(9,d.getIdEnfant_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteEnfant(int id){
        String requete = "delete from aliment where idRepas_fk=(select idRepas_pk from repas where idEnfant_fk=?)";
        String requete1 = "delete from formule where idEnfant_fk=?";
        String requete2 = "delete from repas where idEnfant_fk=?";
        String requete3 = "delete from enfant where idEnfant_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            PreparedStatement ps1 = MyConnection.getInstance().prepareStatement(requete1);
            PreparedStatement ps2 = MyConnection.getInstance().prepareStatement(requete2);
            PreparedStatement ps3 = MyConnection.getInstance().prepareStatement(requete3);
            PreparedStatement Tabps[]={ps,ps1,ps2,ps3};
            for(int i=0;i<Tabps.length;i++)
            {
            Tabps[i].setInt(1, id);
            Tabps[i].executeUpdate();
            }
            System.out.println("Enfant supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Enfant findEnfantById(int id){
    Enfant enfant = new Enfant();
     String requete = "select * from enfant where idEnfant_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                enfant.setIdEnfant_pk(resultat.getInt(1));
                enfant.setNomEnfant(resultat.getString(2));
                enfant.setPrenomEnfant(resultat.getString(3));
                enfant.setAgeEnfant(resultat.getInt(4));
                enfant.setSexeEnfant(resultat.getString(5));
                enfant.setPoidsEnfant(resultat.getFloat(6));
                enfant.setTailleEnfant(resultat.getFloat(7));
                enfant.setImcEnfant(resultat.getFloat(8));
                enfant.setId_Parent_fk(resultat.getInt(9));
                  
            }
            return enfant;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du commentaire "+ex.getMessage());
            return null;
        }
    }

    public Enfant findEnfantByNom(String nom){
    Enfant enfant = new Enfant();
     String requete = "select * from enfant where nomEnfant = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                enfant.setIdEnfant_pk(resultat.getInt(1));
                enfant.setNomEnfant(resultat.getString(2));
                enfant.setPrenomEnfant(resultat.getString(3));
                enfant.setAgeEnfant(resultat.getInt(4));
                enfant.setSexeEnfant(resultat.getString(5));
                enfant.setPoidsEnfant(resultat.getFloat(6));
                enfant.setTailleEnfant(resultat.getFloat(7));
                enfant.setImcEnfant(resultat.getFloat(8));
                enfant.setId_Parent_fk(resultat.getInt(9));
            }
            return enfant;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'enfant "+ex.getMessage());
            return null;
        }
    }

    public List<Enfant> DisplayAllEnfant (){


        List<Enfant> listeenfant = new ArrayList<Enfant>();

        String requete = "select * from enfant";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                  Enfant enfant =new Enfant();
                  enfant.setIdEnfant_pk(resultat.getInt(1));
                  enfant.setNomEnfant(resultat.getString(2));
                  enfant.setPrenomEnfant(resultat.getString(3));
                  enfant.setAgeEnfant(resultat.getInt(4));
                  enfant.setSexeEnfant(resultat.getString(5));
                  enfant.setPoidsEnfant(resultat.getFloat(6));
                  enfant.setTailleEnfant(resultat.getFloat(7));
                  enfant.setImcEnfant(resultat.getFloat(8));
                  enfant.setId_Parent_fk(resultat.getInt(9));
                  
                  listeenfant.add(enfant);
            }
            return listeenfant;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des enfant"+ex.getMessage());
            return null;
        }
    }

}
