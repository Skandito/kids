/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;

import DietForKids.entities.Article;
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
public class ArticleDAO {

     public void insertArticle(Article a){

        String requete = "insert into article (titreArticle, contenuArticle, dateArticle, idMedecin_fk) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, a.getTitreArticle());
            ps.setString(2, a.getContenuArticle());
            ps.setString(3, a.getDateArticle());
            ps.setInt(4, a.getIdMedecin_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateArticle(Article a){
        String requete = "update article set titreArticle=?, contenuArticle=?, dateArticle=?, idMedecin_fk=? where idArticle_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              ps.setString(1, a.getTitreArticle());
              ps.setString(2, a.getContenuArticle());
              ps.setString(3, a.getDateArticle());
              ps.setInt(4, a.getIdMedecin_fk());
              ps.setInt(5, a.getIdArticle_pk());
              ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {

            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteArticle(int id){
        String requete = "delete from article where idArticle_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Article supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Article findArticleById(int id){
    Article article = new Article();
     String requete = "select * from article where idArticle_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                article.setIdArticle_pk(resultat.getInt(1));
                article.setTitreArticle(resultat.getString(2));
                article.setContenuArticle(resultat.getString(3));
                article.setDateArticle(resultat.getString(4));
                article.setIdMedecin_fk(resultat.getInt(5));

            }
            return article;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de l'article "+ex.getMessage());
            return null;
        }
    }

    public Article findArticleByTitre(String titre){
    Article article = new Article();
     String requete = "select * from article where titreArticle = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, titre);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                article.setIdArticle_pk(resultat.getInt(1));
                article.setTitreArticle(resultat.getString(2));
                article.setContenuArticle(resultat.getString(3));
                article.setDateArticle(resultat.getString(4));
                article.setIdMedecin_fk(resultat.getInt(5));
            }
            return article;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de l'article "+ex.getMessage());
            return null;
        }
    }

    public List<Article> DisplayAllArticle (){


        List<Article> listearticle = new ArrayList<Article>();

        String requete = "select * from article";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Article article =new Article();
                article.setIdArticle_pk(resultat.getInt(1));
                article.setTitreArticle(resultat.getString(2));
                article.setContenuArticle(resultat.getString(3));
                article.setDateArticle(resultat.getString(4));
                article.setIdMedecin_fk(resultat.getInt(5));

                listearticle.add(article);
            }
            return listearticle;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des articles "+ex.getMessage());
            return null;
        }
    }

}
