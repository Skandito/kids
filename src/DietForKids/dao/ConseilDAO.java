/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DietForKids.dao;

import DietForKids.entities.Conseil;
import DietForKids.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karray
 */
public class ConseilDAO {

     public void insertConseil(Conseil c){

        String requete = "insert into conseil (titreConseil, sujetConseil, contenuConseil, idMedecin_fk) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getTitreConseil());
            ps.setString(2, c.getSujetConseil());
            ps.setString(3, c.getContenuConseil());
            ps.setInt(4, c.getIdMedecin_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {

            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateConseil(Conseil c){
        String requete = "update conseil set titreConseil=?, sujetConseil=?, contenuConseil=?, idMedecin_fkt=? where idConseil_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getTitreConseil());
            ps.setString(2, c.getSujetConseil());
            ps.setString(3, c.getContenuConseil());
            ps.setInt(4, c.getIdMedecin_fk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteConseil(int id){
        String requete = "delete from conseil where idConseil_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("conseil supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Conseil findConseilById(int id){
    Conseil conseil = new Conseil();
     String requete = "select * from conseil where idConseil_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                conseil.setIdConseil_pk(resultat.getInt(1));
                conseil.setTitreConseil(resultat.getString(2));
                conseil.setSujetConseil(resultat.getString(3));
                conseil.setContenuConseil(resultat.getString(4));
                conseil.setIdMedecin_fk(resultat.getInt(5));
            }
            return conseil;

        } catch (SQLException ex) {

            System.out.println("erreur lors de la recherche du conseil "+ex.getMessage());
            return null;
        }
    }

    public Conseil findConseilBytitre(String titre){
    Conseil conseil = new Conseil();
     String requete = "select * from conseil where titreConseil= ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, titre);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                conseil.setIdConseil_pk(resultat.getInt(1));
                System.out.println("test"+conseil.getIdConseil_pk());

                conseil.setTitreConseil(resultat.getString(2));
                System.out.println(resultat.getString(2));

                conseil.setSujetConseil(resultat.getString(3));
                System.out.println(resultat.getString(2));

                conseil.setContenuConseil(resultat.getString(4));
                System.out.println(resultat.getString(2));

                conseil.setIdMedecin_fk(resultat.getInt(5));
                System.out.println(resultat.getInt(5));
            }
            return conseil;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche du conseil "+ex.getMessage());
            return null;
        }
    }

    public List<Conseil> DisplayAllConseils (){


        List<Conseil> listeconseil = new ArrayList<Conseil>();

        String requete = "select * from conseil";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Conseil conseil =new Conseil();
                conseil.setIdConseil_pk(resultat.getInt(1));
                conseil.setTitreConseil(resultat.getString(2));
                conseil.setSujetConseil(resultat.getString(3));
                conseil.setContenuConseil(resultat.getString(4));
                conseil.setIdMedecin_fk(resultat.getInt(5));

                listeconseil.add(conseil);
            }
            return listeconseil;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des conseils "+ex.getMessage());
            return null;
        }
    }

}
