/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author user
 */
public class Article {
    
    private int idArticle_pk;
    private String titreArticle;
    private String contenuArticle;
    private String dateArticle;
    private int idMedecin_fk;

    public Article() {
    }

    public Article(int idArticle_pk, String titreArticle, String contenuArticle, String dateArticle, int idMedecin_fk) {
        this.idArticle_pk = idArticle_pk;
        this.titreArticle = titreArticle;
        this.contenuArticle = contenuArticle;
        this.dateArticle = dateArticle;
        this.idMedecin_fk = idMedecin_fk;
    }

    public int getIdArticle_pk() {
        return idArticle_pk;
    }

    public void setIdArticle_pk(int idArticle_pk) {
        this.idArticle_pk = idArticle_pk;
    }

    public String getTitreArticle() {
        return titreArticle;
    }

    public void setTitreArticle(String titreArticle) {
        this.titreArticle = titreArticle;
    }

    public String getContenuArticle() {
        return contenuArticle;
    }

    public void setContenuArticle(String contenuArticle) {
        this.contenuArticle = contenuArticle;
    }

    public String getDateArticle() {
        return dateArticle;
    }

    public void setDateArticle(String dateArticle) {
        this.dateArticle = dateArticle;
    }

    public int getIdMedecin_fk() {
        return idMedecin_fk;
    }

    public void setIdMedecin_fk(int idMedecin_fk) {
        this.idMedecin_fk = idMedecin_fk;
    }

    @Override
    public String toString() {
        return "Article{" + "idArticle_pk=" + idArticle_pk + ", titreArticle=" + titreArticle + ", contenuArticle=" + contenuArticle + ", dateArticle=" + dateArticle + ", idMedecin_fk=" + idMedecin_fk + '}';
    }
    
}
