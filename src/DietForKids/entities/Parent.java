/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author user
 */
public class Parent {
    
    private int idParent_pk;
    private String nomParent;
    private String prenomParent;
    private int cinParent;
    private String emailParent;
    private String addresseParent;
    private String loginParent;
    private String sexeParent;
    private String situationParent;
    private String mdpParent;

    public Parent() {
    }

    public Parent(int idParent_pk, String nomParent, String prenomParent, int cinParent, String emailParent, String addresseParent, String loginParent, String sexeParent, String situationParent, String mdpParent) {
        this.idParent_pk = idParent_pk;
        this.nomParent = nomParent;
        this.prenomParent = prenomParent;
        this.cinParent = cinParent;
        this.emailParent = emailParent;
        this.addresseParent = addresseParent;
        this.loginParent = loginParent;
        this.sexeParent = sexeParent;
        this.situationParent = situationParent;
        this.mdpParent = mdpParent;
    }

    public int getIdParent_pk() {
        return idParent_pk;
    }

    public void setIdParent_pk(int idParent_pk) {
        this.idParent_pk = idParent_pk;
    }

    public String getNomParent() {
        return nomParent;
    }

    public void setNomParent(String nomParent) {
        this.nomParent = nomParent;
    }

    public String getPrenomParent() {
        return prenomParent;
    }

    public void setPrenomParent(String prenomParent) {
        this.prenomParent = prenomParent;
    }

    public int getCinParent() {
        return cinParent;
    }

    public void setCinParent(int cinParent) {
        this.cinParent = cinParent;
    }

    public String getEmailParent() {
        return emailParent;
    }

    public void setEmailParent(String emailParent) {
        this.emailParent = emailParent;
    }

    public String getAddresseParent() {
        return addresseParent;
    }

    public void setAddresseParent(String addresseParent) {
        this.addresseParent = addresseParent;
    }

    public String getLoginParent() {
        return loginParent;
    }

    public void setLoginParent(String loginParent) {
        this.loginParent = loginParent;
    }

    public String getSexeParent() {
        return sexeParent;
    }

    public void setSexeParent(String sexeParent) {
        this.sexeParent = sexeParent;
    }

    public String getSituationParent() {
        return situationParent;
    }

    public void setSituationParent(String situationParent) {
        this.situationParent = situationParent;
    }

    public String getMdpParent() {
        return mdpParent;
    }

    public void setMdpParent(String mdpParent) {
        this.mdpParent = mdpParent;
    }

    @Override
    public String toString() {
        return "Parent{" + "idParent_pk=" + idParent_pk + ", nomParent=" + nomParent + ", prenomParent=" + prenomParent + ", cinParent=" + cinParent + ", emailParent=" + emailParent + ", addresseParent=" + addresseParent + ", loginParent=" + loginParent + ", sexeParent=" + sexeParent + ", situationParent=" + situationParent + ", mdpParent=" + mdpParent + '}';
    }
}


