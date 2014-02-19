/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DietForKids.entities;

/**
 *
 * @author rafik
 */
public class Admin {
  private int idAdmin_pk;
  private String nomAdmin;
  private String prenomAdmin;
  private String loginAdmin;
  private String mdpAdmin;

    public Admin() {
    }

    public Admin(int idAdmin_pk, String nomAdmin, String prenomAdmin, String loginAdmin, String mdpAdmin) {
        this.idAdmin_pk = idAdmin_pk;
        this.nomAdmin = nomAdmin;
        this.prenomAdmin = prenomAdmin;
        this.loginAdmin = loginAdmin;
        this.mdpAdmin = mdpAdmin;
    }

    /**
     * @return the idAdmin
     */
    public int getIdAdmin_pk() {
        return idAdmin_pk;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(int idAdmin_pk) {
        this.idAdmin_pk = idAdmin_pk;
    }

    /**
     * @return the nomAdmin
     */
    public String getNomAdmin() {
        return nomAdmin;
    }

    /**
     * @param nomAdmin the nomAdmin to set
     */
    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }

    /**
     * @return the prenomAdmin
     */
    public String getPrenomAdmin() {
        return prenomAdmin;
    }

    /**
     * @param prenomAdmin the prenomAdmin to set
     */
    public void setPrenomAdmin(String prenomAdmin) {
        this.prenomAdmin = prenomAdmin;
    }

    /**
     * @return the loginAdmin
     */
    public String getLoginAdmin() {
        return loginAdmin;
    }

    /**
     * @param loginAdmin the loginAdmin to set
     */
    public void setLoginAdmin(String loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    /**
     * @return the mdpAdmin
     */
    public String getMdpAdmin() {
        return mdpAdmin;
    }

    /**
     * @param mdpAdmin the mdpAdmin to set
     */
    public void setMdpAdmin(String mdpAdmin) {
        this.mdpAdmin = mdpAdmin;
    }
  
    public String toString()
    {
        return"Nom :"+this.nomAdmin+"Prénom :"+this.prenomAdmin;
    }       
}
