/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author user
 */
public class Enfant {
    
    private int idEnfant_pk;
    private String nomEnfant;
    private String prenomEnfant;
    private int ageEnfant;
    private String sexeEnfant;
    private double poidsEnfant;
    private double tailleEnfant;
    private double imcEnfant;
    private int id_Parent_fk;

    public Enfant() {
    }

    public Enfant(int idEnfant_pk, String nomEnfant, String prenomEnfant, int ageEnfant, String sexeEnfant, double poidsEnfant, double tailleEnfant, double imcEnfant, int id_Parent_fk) {
        this.idEnfant_pk = idEnfant_pk;
        this.nomEnfant = nomEnfant;
        this.prenomEnfant = prenomEnfant;
        this.ageEnfant = ageEnfant;
        this.sexeEnfant = sexeEnfant;
        this.poidsEnfant = poidsEnfant;
        this.tailleEnfant = tailleEnfant;
        this.imcEnfant = imcEnfant;
        this.id_Parent_fk = id_Parent_fk;
    }

    public int getIdEnfant_pk() {
        return idEnfant_pk;
    }

    public void setIdEnfant_pk(int idEnfant_pk) {
        this.idEnfant_pk = idEnfant_pk;
    }

    public String getNomEnfant() {
        return nomEnfant;
    }

    public void setNomEnfant(String nomEnfant) {
        this.nomEnfant = nomEnfant;
    }

    public String getPrenomEnfant() {
        return prenomEnfant;
    }

    public void setPrenomEnfant(String prenomEnfant) {
        this.prenomEnfant = prenomEnfant;
    }

    public int getAgeEnfant() {
        return ageEnfant;
    }

    public void setAgeEnfant(int ageEnfant) {
        this.ageEnfant = ageEnfant;
    }

    public String getSexeEnfant() {
        return sexeEnfant;
    }

    public void setSexeEnfant(String sexeEnfant) {
        this.sexeEnfant = sexeEnfant;
    }

    public double getPoidsEnfant() {
        return poidsEnfant;
    }

    public void setPoidsEnfant(double poidsEnfant) {
        this.poidsEnfant = poidsEnfant;
    }

    public double getTailleEnfant() {
        return tailleEnfant;
    }

    public void setTailleEnfant(double tailleEnfant) {
        this.tailleEnfant = tailleEnfant;
    }

    public double getImcEnfant() {
        return imcEnfant;
    }

    public void setImcEnfant(double imcEnfant) {
        this.imcEnfant = imcEnfant;
    }

    public int getId_Parent_fk() {
        return id_Parent_fk;
    }

    public void setId_Parent_fk(int id_Parent_fk) {
        this.id_Parent_fk = id_Parent_fk;
    }

    @Override
    public String toString() {
        return "Enfant{" + "idEnfant_pk=" + idEnfant_pk + ", nomEnfant=" + nomEnfant + ", prenomEnfant=" + prenomEnfant + ", ageEnfant=" + ageEnfant + ", sexeEnfant=" + sexeEnfant + ", poidsEnfant=" + poidsEnfant + ", tailleEnfant=" + tailleEnfant + ", imcEnfant=" + imcEnfant + ", id_Parent_fk=" + id_Parent_fk + '}';
    }
    
}
