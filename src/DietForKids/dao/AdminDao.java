/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;
import DietForKids.entities.Admin;
import DietForKids.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ali
 */
public class AdminDao
{
    public void updateAdmin(Admin a){
        String requete = "update administrateur set nomAdmin=?, prenomAdmin=?, loginAdmin=?, mdpAdmin=? where idAdmin_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, a.getNomAdmin());
            ps.setString(2, a.getPrenomAdmin());
            ps.setString(3, a.getLoginAdmin());
            ps.setString(4, a.getMdpAdmin());
            ps.setInt(5, a.getIdAdmin_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

}
