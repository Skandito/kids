/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author user
 */
public class Repas {
    
    private int idRepas_pk;
    private String nomRepas;
    private String dateRepas;
    private String etatRepas;
    private float nbrcalorieRepas;
    private int idEnfant_fk;

    public Repas() {
    }

    public Repas(int idRepas_pk, String nomRepas, String dateRepas, String etatRepas, float nbrcalorieRepas, int idEnfant_fk) {
        this.idRepas_pk = idRepas_pk;
        this.nomRepas = nomRepas;
        this.dateRepas = dateRepas;
        this.etatRepas = etatRepas;
        this.nbrcalorieRepas = nbrcalorieRepas;
        this.idEnfant_fk = idEnfant_fk;
    }

    public int getIdRepas_pk() {
        return idRepas_pk;
    }

    public void setIdRepas_pk(int idRepas_pk) {
        this.idRepas_pk = idRepas_pk;
    }

    public String getNomRepas() {
        return nomRepas;
    }

    public void setNomRepas(String nomRepas) {
        this.nomRepas = nomRepas;
    }

    public String getDateRepas() {
        return dateRepas;
    }

    public void setDateRepas(String dateRepas) {
        this.dateRepas = dateRepas;
    }

    public String getEtatRepas() {
        return etatRepas;
    }

    public void setEtatRepas(String etatRepas) {
        this.etatRepas = etatRepas;
    }

    public float getNbrcalorieRepas() {
        return nbrcalorieRepas;
    }

    public void setNbrcalorieRepas(float nbrcalorieRepas) {
        this.nbrcalorieRepas = nbrcalorieRepas;
    }

    public int getIdEnfant_fk() {
        return idEnfant_fk;
    }

    public void setIdEnfant_fk(int idEnfant_fk) {
        this.idEnfant_fk = idEnfant_fk;
    }

    @Override
    public String toString() {
        return "Repas{" + "idRepas_pk=" + idRepas_pk + ", nomRepas=" + nomRepas + ", dateRepas=" + dateRepas + ", etatRepas=" + etatRepas + ", nbrcalorieRepas=" + nbrcalorieRepas + ", idEnfant_fk=" + idEnfant_fk + '}';
    }
    
}
