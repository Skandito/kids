/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author user
 */
public class Formule {
    
    private int idFormule_pk;
    private String categorieFormule;
    private String contenuFormule;
    private double nbrcalorieFormule;
    private double imcFormule;
    private String typeFormule;
    private int idEnfant_fk;

    public Formule() {
    }

    public Formule(int idFormule_pk, String categorieFormule, String contenuFormule, double nbrcalorieFormule, double imcFormule, String typeFormule, int idEnfant_fk) {
        this.idFormule_pk = idFormule_pk;
        this.categorieFormule = categorieFormule;
        this.contenuFormule = contenuFormule;
        this.nbrcalorieFormule = nbrcalorieFormule;
        this.imcFormule = imcFormule;
        this.typeFormule = typeFormule;
        this.idEnfant_fk = idEnfant_fk;
    }

    public int getIdFormule_pk() {
        return idFormule_pk;
    }

    public void setIdFormule_pk(int idFormule_pk) {
        this.idFormule_pk = idFormule_pk;
    }

    public String getCategorieFormule() {
        return categorieFormule;
    }

    public void setCategorieFormule(String categorieFormule) {
        this.categorieFormule = categorieFormule;
    }

    public String getContenuFormule() {
        return contenuFormule;
    }

    public void setContenuFormule(String contenuFormule) {
        this.contenuFormule = contenuFormule;
    }

    public double getNbrcalorieFormule() {
        return nbrcalorieFormule;
    }

    public void setNbrcalorieFormule(double nbrcalorieFormule) {
        this.nbrcalorieFormule = nbrcalorieFormule;
    }

    public double getImcFormule() {
        return imcFormule;
    }

    public void setImcFormule(double imcFormule) {
        this.imcFormule = imcFormule;
    }

    public String getTypeFormule() {
        return typeFormule;
    }

    public void setTypeFormule(String typeFormule) {
        this.typeFormule = typeFormule;
    }

    public int getIdEnfant_fk() {
        return idEnfant_fk;
    }

    public void setIdEnfant_fk(int idEnfant_fk) {
        this.idEnfant_fk = idEnfant_fk;
    }

    @Override
    public String toString() {
        return "Formule{" + "idFormule_pk=" + idFormule_pk + ", categorieFormule=" + categorieFormule + ", contenuFormule=" + contenuFormule + ", nbrcalorieFormule=" + nbrcalorieFormule + ", imcFormule=" + imcFormule + ", typeFormule=" + typeFormule + ", idEnfant_fk=" + idEnfant_fk + '}';
    }
    
}
