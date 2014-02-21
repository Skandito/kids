/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author user
 */
public class Sujet {
    
    private int idSujet_pk;
    private String titreSujet;
    private String contenuSujet;
    private String etatSujet;
    private int idParent_fk;

    public Sujet() {
    }

    public Sujet(int idSujet_pk, String titreSujet, String contenuSujet, String etatSujet, int idParent_fk) {
        this.idSujet_pk = idSujet_pk;
        this.titreSujet = titreSujet;
        this.contenuSujet = contenuSujet;
        this.etatSujet = etatSujet;
        this.idParent_fk = idParent_fk;
    }

    public int getIdSujet_pk() {
        return idSujet_pk;
    }

    public void setIdSujet_pk(int idSujet_pk) {
        this.idSujet_pk = idSujet_pk;
    }

    public String getTitreSujet() {
        return titreSujet;
    }

    public void setTitreSujet(String titreSujet) {
        this.titreSujet = titreSujet;
    }

    public String getContenuSujet() {
        return contenuSujet;
    }

    public void setContenuSujet(String contenuSujet) {
        this.contenuSujet = contenuSujet;
    }

    public String getEtatSujet() {
        return etatSujet;
    }

    public void setEtatSujet(String etatSujet) {
        this.etatSujet = etatSujet;
    }

    public int getIdParent_fk() {
        return idParent_fk;
    }

    public void setIdParent_fk(int idParent_fk) {
        this.idParent_fk = idParent_fk;
    }

    @Override
    public String toString() {
        return "Sujet{" + "idSujet_pk=" + idSujet_pk + ", titreSujet=" + titreSujet + ", contenuSujet=" + contenuSujet + ", etatSujet=" + etatSujet + ", idParent_fk=" + idParent_fk + '}';
    }
    
}
