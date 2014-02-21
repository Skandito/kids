/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;

import DietForKids.entities.Commentaire;
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
public class CommentaireDAO {

     public void insertCommentaire(Commentaire d){

        String requete = "insert into commentaire (contenuCom,typeCom,idSujet_fk,idParent_fk,idMedecin_fk) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getContenuCommentaire());
            ps.setString(2, d.getTypeCommentaire());
            ps.setInt(3,d.getIdSujet_fk());
            ps.setInt(4,d.getIdParent_fk());
            ps.setInt(5,d.getIdMedecin_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateCommentaire(Commentaire d){
        String requete = "update commentaire set contenuCom=?, typeCom=?, idSujet_fk=?,idParent_fk=?,idMedecin_fk=? where idCom_pk="+d.getIdCommentaire_pk()+"";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getContenuCommentaire());
            ps.setString(2, d.getTypeCommentaire());
            ps.setInt(3,d.getIdSujet_fk());
            ps.setInt(4,d.getIdParent_fk());
            ps.setInt(5,d.getIdMedecin_fk());
            ps.setInt(6,d.getIdCommentaire_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteCommentaire(int id){
        String requete = "delete from commentaire where idCom_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("commentaire supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Commentaire findCommentaireById(int id){
    Commentaire commentaire = new Commentaire();
     String requete = "select * from commentaire where idCom_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                commentaire.setIdCommentaire_pk(resultat.getInt(1));
                commentaire.setContenuCommentaire(resultat.getString(2));
                commentaire.setTypeCommentaire(resultat.getString(3));
                commentaire.setIdSujet_fk (resultat.getInt(4));
                commentaire.setIdParent_fk (resultat.getInt(5));
                commentaire.setIdMedecin_fk (resultat.getInt(6));
                  
            }
            return commentaire;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du commentaire "+ex.getMessage());
            return null;
        }
    }

    public Commentaire findCommentaireByContenu(String contenu){
    Commentaire commentaire = new Commentaire();
     String requete = "select * from commentaire where contenuCom Like ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, contenu);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                commentaire.setIdCommentaire_pk(resultat.getInt(1));
                commentaire.setContenuCommentaire(resultat.getString(2));
                commentaire.setTypeCommentaire(resultat.getString(3));
                commentaire.setIdSujet_fk (resultat.getInt(4));
                commentaire.setIdParent_fk (resultat.getInt(5));
                commentaire.setIdMedecin_fk (resultat.getInt(6));
            }
            return commentaire;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du commentaire "+ex.getMessage());
            return null;
        }
    }

    public List<Commentaire> DisplayAllCommentaires (){


        List<Commentaire> listecommentaires = new ArrayList<Commentaire>();

        String requete = "select * from commentaire";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Commentaire commentaire =new Commentaire();
                commentaire.setIdCommentaire_pk(resultat.getInt(1));
                commentaire.setContenuCommentaire(resultat.getString(2));
                commentaire.setTypeCommentaire(resultat.getString(3));
                commentaire.setIdSujet_fk (resultat.getInt(4));
                commentaire.setIdParent_fk (resultat.getInt(5));
                commentaire.setIdMedecin_fk (resultat.getInt(6));
                
                listecommentaires.add(commentaire);
            }
            return listecommentaires;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

}
