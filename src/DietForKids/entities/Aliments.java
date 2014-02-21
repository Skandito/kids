/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author rafik
 */
public class Aliments {
    private int idAliment_pk;
    private String nomAliment;
    private String typeAliment;
    private double quantiteAliment;
    private double nombreCalorie;
    private int idRepas_fk;

    public Aliments() {
    }

    public Aliments(int idAliment_pk, String nomAliment, String typeAliment, double quantiteAliment, double nombreCalorie, int idRepas_fk) {
        this.idAliment_pk = idAliment_pk;
        this.nomAliment = nomAliment;
        this.typeAliment = typeAliment;
        this.quantiteAliment = quantiteAliment;
        this.nombreCalorie = nombreCalorie;
        this.idRepas_fk = idRepas_fk;
    }

    public int getIdAliment_pk() {
        return idAliment_pk;
    }

    public void setIdAliment_pk(int idAliment_pk) {
        this.idAliment_pk = idAliment_pk;
    }

    public String getNomAliment() {
        return nomAliment;
    }

    public void setNomAliment(String nomAliment) {
        this.nomAliment = nomAliment;
    }

    public String getTypeAliment() {
        return typeAliment;
    }

    public void setTypeAliment(String typeAliment) {
        this.typeAliment = typeAliment;
    }

    public double getQuantiteAliment() {
        return quantiteAliment;
    }

    public void setQuantiteAliment(double quantiteAliment) {
        this.quantiteAliment = quantiteAliment;
    }

    public double getNombreCalorie() {
        return nombreCalorie;
    }

    public void setNombreCalorie(double nombreCalorie) {
        this.nombreCalorie = nombreCalorie;
    }

    public int getIdRepas_fk() {
        return idRepas_fk;
    }

    public void setIdRepas_fk(int idRepas_fk) {
        this.idRepas_fk = idRepas_fk;
    }

    @Override
    public String toString() {
        return "Aliments{" + "idAliment_pk=" + idAliment_pk + ", nomAliment=" + nomAliment + ", typeAliment=" + typeAliment + ", quantiteAliment=" + quantiteAliment + ", nombreCalorie=" + nombreCalorie + ", idRepas_fk=" + idRepas_fk + '}';
    }
    
}
