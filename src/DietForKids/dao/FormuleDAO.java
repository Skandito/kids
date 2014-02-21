/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;

import DietForKids.entities.Formule;
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
public class FormuleDAO {

     public void insertFormule(Formule f){

        String requete = "insert into formule (categorieForm, contenuForm, nbrCalform, imcForm, typeForm, idEnfant_fk) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,f.getCategorieFormule());
            ps.setString(2, f.getContenuFormule());
            ps.setDouble(3, f.getNbrcalorieFormule());
            ps.setDouble(4, f.getImcFormule());
            ps.setString(5, f.getTypeFormule());
            ps.setInt(6, f.getIdEnfant_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateFormule(Formule f){
        String requete = "update formule set categorieForm=?,contenuForm=?,nbrCalform=?,imcForm=?,typeForm=?,idEnfant_fk=? where idForm_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, f.getCategorieFormule());
            ps.setString(2, f.getContenuFormule());
            ps.setDouble(3, f.getNbrcalorieFormule());
            ps.setDouble(4, f.getImcFormule());
            ps.setString(5, f.getTypeFormule());
            ps.setInt(6, f.getIdEnfant_fk());
            ps.setInt(7, f.getIdFormule_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteFormule(int id){
        String requete = "delete from formule where idForm_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Formule supprimée");
            } 
        catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Formule findFormuleById(int id){
    Formule formule = new Formule();
     String requete = "select * from formule where idForm_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                formule.setIdFormule_pk(resultat.getInt(1));
                formule.setCategorieFormule(resultat.getString(2));
                formule.setContenuFormule(resultat.getString(3));
                formule.setNbrcalorieFormule(resultat.getDouble(4));
                formule.setImcFormule(resultat.getDouble(5));
                formule.setTypeFormule(resultat.getString(6));
                formule.setIdEnfant_fk(resultat.getInt(7));
            }
            return formule;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

    public Formule findFormuleByCategorie(String categorie){
    Formule formule = new Formule();
     String requete = "select * from formule where categorieForm = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, categorie);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                formule.setIdFormule_pk(resultat.getInt(1));
                formule.setCategorieFormule(resultat.getString(2));
                formule.setContenuFormule(resultat.getString(3));
                formule.setNbrcalorieFormule(resultat.getDouble(4));
                formule.setImcFormule(resultat.getDouble(5));
                formule.setTypeFormule(resultat.getString(6));
                formule.setIdEnfant_fk(resultat.getInt(7));
            }
            return formule;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de La formule "+ex.getMessage());
            return null;
        }
    }

    public List<Formule> DisplayAllFormules (){


        List<Formule> listeformule = new ArrayList<Formule>();

        String requete = "select * from formule";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Formule formule =new Formule();
                formule.setIdFormule_pk(resultat.getInt(1));
                formule.setCategorieFormule(resultat.getString(2));
                formule.setContenuFormule(resultat.getString(3));
                formule.setNbrcalorieFormule(resultat.getDouble(4));
                formule.setImcFormule(resultat.getDouble(5));
                formule.setTypeFormule(resultat.getString(6));
                formule.setIdEnfant_fk(resultat.getInt(7));

                listeformule.add(formule);
            }
            return listeformule;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

}
