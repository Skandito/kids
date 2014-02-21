/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author user
 */
public class Commentaire {
    
    private int idCommentaire_pk;
    private String contenuCommentaire;
    private String typeCommentaire;
    private int idSujet_fk;
    private int idParent_fk;
    private int idMedecin_fk;

    public Commentaire() {
    }

    public Commentaire(int idCommentaire_pk, String contenuCommentaire, String typeCommentaire, int idSujet_fk, int idParent_fk, int idMedecin_fk) {
        this.idCommentaire_pk = idCommentaire_pk;
        this.contenuCommentaire = contenuCommentaire;
        this.typeCommentaire = typeCommentaire;
        this.idSujet_fk = idSujet_fk;
        this.idParent_fk = idParent_fk;
        this.idMedecin_fk = idMedecin_fk;
    }

    public int getIdCommentaire_pk() {
        return idCommentaire_pk;
    }

    public void setIdCommentaire_pk(int idCommentaire_pk) {
        this.idCommentaire_pk = idCommentaire_pk;
    }

    public String getContenuCommentaire() {
        return contenuCommentaire;
    }

    public void setContenuCommentaire(String contenuCommentaire) {
        this.contenuCommentaire = contenuCommentaire;
    }

    public String getTypeCommentaire() {
        return typeCommentaire;
    }

    public void setTypeCommentaire(String typeCommentaire) {
        this.typeCommentaire = typeCommentaire;
    }

    public int getIdSujet_fk() {
        return idSujet_fk;
    }

    public void setIdSujet_fk(int idSujet_fk) {
        this.idSujet_fk = idSujet_fk;
    }

    public int getIdParent_fk() {
        return idParent_fk;
    }

    public void setIdParent_fk(int idParent_fk) {
        this.idParent_fk = idParent_fk;
    }

    public int getIdMedecin_fk() {
        return idMedecin_fk;
    }

    public void setIdMedecin_fk(int idMedecin_fk) {
        this.idMedecin_fk = idMedecin_fk;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "idCommentaire_pk=" + idCommentaire_pk + ", contenuCommentaire=" + contenuCommentaire + ", typeCommentaire=" + typeCommentaire + ", idSujet_fk=" + idSujet_fk + ", idParent_fk=" + idParent_fk + ", idMedecin_fk=" + idMedecin_fk + '}';
    }
    
}
