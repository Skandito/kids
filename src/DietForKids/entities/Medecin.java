/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author user
 */
public class Medecin {
    
    private int idMedecin_pk;
    private String nomMedecin;
    private String prenomMedecin;
    private int codeMedecin;
    private String emailMedecin;
    private String addresseMedecin;
    private String loginMedecin;
    private String specialiteMedecin;
    private String mdpParent;

    public Medecin() {
    }

    public Medecin(int idMedecin_pk, String nomMedecin, String prenomMedecin, int codeMedecin, String emailMedecin, String addresseMedecin, String loginMedecin, String specialiteMedecin, String mdpParent) {
        this.idMedecin_pk = idMedecin_pk;
        this.nomMedecin = nomMedecin;
        this.prenomMedecin = prenomMedecin;
        this.codeMedecin = codeMedecin;
        this.emailMedecin = emailMedecin;
        this.addresseMedecin = addresseMedecin;
        this.loginMedecin = loginMedecin;
        this.specialiteMedecin = specialiteMedecin;
        this.mdpParent = mdpParent;
    }

    public int getIdMedecin_pk() {
        return idMedecin_pk;
    }

    public void setIdMedecin_pk(int idMedecin_pk) {
        this.idMedecin_pk = idMedecin_pk;
    }

    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public String getPrenomMedecin() {
        return prenomMedecin;
    }

    public void setPrenomMedecin(String prenomMedecin) {
        this.prenomMedecin = prenomMedecin;
    }

    public int getCodeMedecin() {
        return codeMedecin;
    }

    public void setCodeMedecin(int codeMedecin) {
        this.codeMedecin = codeMedecin;
    }

    public String getEmailMedecin() {
        return emailMedecin;
    }

    public void setEmailMedecin(String emailMedecin) {
        this.emailMedecin = emailMedecin;
    }

    public String getAddresseMedecin() {
        return addresseMedecin;
    }

    public void setAddresseMedecin(String addresseMedecin) {
        this.addresseMedecin = addresseMedecin;
    }

    public String getLoginMedecin() {
        return loginMedecin;
    }

    public void setLoginMedecin(String loginMedecin) {
        this.loginMedecin = loginMedecin;
    }

    public String getSpecialiteMedecin() {
        return specialiteMedecin;
    }

    public void setSpecialiteMedecin(String specialiteMedecin) {
        this.specialiteMedecin = specialiteMedecin;
    }

    public String getMdpParent() {
        return mdpParent;
    }

    public void setMdpParent(String mdpParent) {
        this.mdpParent = mdpParent;
    }

    @Override
    public String toString() {
        return "Medecin{" + "idMedecin_pk=" + idMedecin_pk + ", nomMedecin=" + nomMedecin + ", prenomMedecin=" + prenomMedecin + ", codeMedecin=" + codeMedecin + ", emailMedecin=" + emailMedecin + ", addresseMedecin=" + addresseMedecin + ", loginMedecin=" + loginMedecin + ", specialiteMedecin=" + specialiteMedecin + ", mdpParent=" + mdpParent + '}';
    }
}
