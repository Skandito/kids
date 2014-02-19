/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rafik
 */
public class Aliments {
    private int idAliment_pk;
    private String nomAliment;
    private String typeAliment;
    private int quantiteAliment;
    private int nombreCalorie;
    private int idRepas_fk;

    public Aliments() {
    }

    public Aliments(int idAliment_pk, String nomAliment, String typeAliment, int quantiteAliment, int nombreCalorie, int idRepas_fk) {
        this.idAliment_pk = idAliment_pk;
        this.nomAliment = nomAliment;
        this.typeAliment = typeAliment;
        this.quantiteAliment = quantiteAliment;
        this.nombreCalorie = nombreCalorie;
        this.idRepas_fk = idRepas_fk;
    }

  

    /**
     * @return the idAliment_pk
     */
    public int getIdAliment_pk() {
        return idAliment_pk;
    }

    /**
     * @param idAliment_pk the idAliment_pk to set
     */
    public void setIdAliment_pk(int idAliment_pk) {
        this.idAliment_pk = idAliment_pk;
    }

    /**
     * @return the nomAliment
     */
    public String getNomAliment() {
        return nomAliment;
    }

    /**
     * @param nomAliment the nomAliment to set
     */
    public void setNomAliment(String nomAliment) {
        this.nomAliment = nomAliment;
    }

    /**
     * @return the typeAliment
     */
    public String getTypeAliment() {
        return typeAliment;
    }

    /**
     * @param typeAliment the typeAliment to set
     */
    public void setTypeAliment(String typeAliment) {
        this.typeAliment = typeAliment;
    }

    /**
     * @return the quantiteAliment
     */
    public int getQuantiteAliment() {
        return quantiteAliment;
    }

    /**
     * @param quantiteAliment the quantiteAliment to set
     */
    public void setQuantiteAliment(int quantiteAliment) {
        this.quantiteAliment = quantiteAliment;
    }

    /**
     * @return the idRepas_fk
     */
    public int getIdRepas_fk() {
        return idRepas_fk;
    }

    /**
     * @param idRepas_fk the idRepas_fk to set
     */
    public void setIdRepas_fk(int idRepas_fk) {
        this.idRepas_fk = idRepas_fk;
    }
  public String toString()
  {
      return "nom_aliment :"+this.nomAliment+"typealiment"+this.typeAliment+"quantitité"+this.quantiteAliment+"nbre_calorie :"+this.nombreCalorie;  }

    /**
     * @return the nombreCalorie
     */
    public int getNombreCalorie() {
        return nombreCalorie;
    }

    /**
     * @param nombreCalorie the nombreCalorie to set
     */
    public void setNombreCalorie(int nombreCalorie) {
        this.nombreCalorie = nombreCalorie;
    }
    
}
