/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;
/**
 *
 * @author user
 */
public class Regime {
    
    private int idRegime_pk;
    private String nomRegime;
    private String typeRegime;
    private String descriptionRegime;
    private int idMedecin_fk;

    public Regime() {
    }

    public Regime(int idRegime_pk, String nomRegime, String typeRegime, String descriptionRegime, int idMedecin_fk) {
        this.idRegime_pk = idRegime_pk;
        this.nomRegime = nomRegime;
        this.typeRegime = typeRegime;
        this.descriptionRegime = descriptionRegime;
        this.idMedecin_fk = idMedecin_fk;
    }

    public int getIdRegime_pk() {
        return idRegime_pk;
    }

    public void setIdRegime_pk(int idRegime_pk) {
        this.idRegime_pk = idRegime_pk;
    }

    public String getNomRegime() {
        return nomRegime;
    }

    public void setNomRegime(String nomRegime) {
        this.nomRegime = nomRegime;
    }

    public String getTypeRegime() {
        return typeRegime;
    }

    public void setTypeRegime(String typeRegime) {
        this.typeRegime = typeRegime;
    }

    public String getDescriptionRegime() {
        return descriptionRegime;
    }

    public void setDescriptionRegime(String descriptionRegime) {
        this.descriptionRegime = descriptionRegime;
    }

    public int getIdMedecin_fk() {
        return idMedecin_fk;
    }

    public void setIdMedecin_fk(int idMedecin_fk) {
        this.idMedecin_fk = idMedecin_fk;
    }

    @Override
    public String toString() {
        return "Regime{" + "idRegime_pk=" + idRegime_pk + ", nomRegime=" + nomRegime + ", typeRegime=" + typeRegime + ", descriptionRegime=" + descriptionRegime + ", idMedecin_fk=" + idMedecin_fk + '}';
    }
    
}
