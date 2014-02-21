/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author user
 */
public class Conseil {
    
    private int idConseil_pk;
    private String titreConseil;
    private String sujetConseil;
    private String contenuConseil;
    private int idMedecin_fk;

    public Conseil() {
    }

    public Conseil(int idConseil_pk, String titreConseil, String sujetConseil, String contenuConseil, int idMedecin_fk) {
        this.idConseil_pk = idConseil_pk;
        this.titreConseil = titreConseil;
        this.sujetConseil = sujetConseil;
        this.contenuConseil = contenuConseil;
        this.idMedecin_fk = idMedecin_fk;
    }

    public int getIdConseil_pk() {
        return idConseil_pk;
    }

    public void setIdConseil_pk(int idConseil_pk) {
        this.idConseil_pk = idConseil_pk;
    }

    public String getTitreConseil() {
        return titreConseil;
    }

    public void setTitreConseil(String titreConseil) {
        this.titreConseil = titreConseil;
    }

    public String getSujetConseil() {
        return sujetConseil;
    }

    public void setSujetConseil(String sujetConseil) {
        this.sujetConseil = sujetConseil;
    }

    public String getContenuConseil() {
        return contenuConseil;
    }

    public void setContenuConseil(String contenuConseil) {
        this.contenuConseil = contenuConseil;
    }

    public int getIdMedecin_fk() {
        return idMedecin_fk;
    }

    public void setIdMedecin_fk(int idMedecin_fk) {
        this.idMedecin_fk = idMedecin_fk;
    }

    @Override
    public String toString() {
        return "Conseil{" + "idConseil_pk=" + idConseil_pk + ", titreConseil=" + titreConseil + ", sujetConseil=" + sujetConseil + ", contenuConseil=" + contenuConseil + ", idMedecin_fk=" + idMedecin_fk + '}';
    }
    
}
