package DietForKids.dao;

import DietForKids.entities.Aliments;
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
public class AlimentDAO {

     public void insertAliment(Aliments d){

        String requete = "insert into aliment (nomAliment, typeAliment, qteAliment, nbrCalorie, idRepas_fk) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomAliment());
            ps.setString(2, d.getTypeAliment());
            ps.setDouble(3, d.getQuantiteAliment());
            ps.setDouble(4, d.getNombreCalorie());
            ps.setInt(5, d.getIdRepas_fk());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateAliment(Aliments d){
        String requete = "update aliment set nomAliment=?, typeAliment=?, qteAliment=?, nbrCalorie=?, idRepas_fk=? where idAliment_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNomAliment());
            ps.setString(2, d.getTypeAliment());
            ps.setDouble(3, d.getQuantiteAliment());
            ps.setDouble(4, d.getNombreCalorie());
            ps.setInt(5, d.getIdRepas_fk());
            ps.setInt(6, d.getIdAliment_pk());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteAliment(int id){
        String requete = "delete from aliment where idAliment_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("aliment supprimé");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Aliments findAlimentById(int id){
    Aliments aliment = new Aliments();
     String requete = "select * from aliment where idAliment_pk=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                aliment.setIdAliment_pk(resultat.getInt(1));
                aliment.setNomAliment(resultat.getString(2));
                aliment.setTypeAliment(resultat.getString(3));
                aliment.setQuantiteAliment(resultat.getDouble(4));
                aliment.setNombreCalorie(resultat.getDouble(5));
                aliment.setIdRepas_fk(resultat.getInt(6));
            }
            return aliment;

        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche de l'aliment "+ex.getMessage());
            return null;
        }
    }

    public Aliments findAlimentByNom(String nom){
    Aliments aliment = new Aliments();
     String requete = "select * from aliment where nomAliment = ?";
            try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                aliment.setIdAliment_pk(resultat.getInt(1));
                aliment.setNomAliment(resultat.getString(2));
                aliment.setTypeAliment(resultat.getString(3));
                aliment.setQuantiteAliment(resultat.getDouble(4));
                aliment.setNombreCalorie(resultat.getDouble(5));
                aliment.setIdRepas_fk(resultat.getInt(6));
            }
            return aliment;
                }
            catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'aliment "+ex.getMessage());
            return null;
        }
    }

    public List<Aliments> DisplayAllAliments (){

        List<Aliments> listealiment = new ArrayList<Aliments>();

        String requete = "select * from aliment";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Aliments aliment =new Aliments();
                aliment.setIdAliment_pk(resultat.getInt(1));
                aliment.setNomAliment(resultat.getString(2));
                aliment.setTypeAliment(resultat.getString(3));
                aliment.setQuantiteAliment(resultat.getDouble(4));
                aliment.setNombreCalorie(resultat.getDouble(5));
                aliment.setIdAliment_pk(resultat.getInt(6));
                
                listealiment.add(aliment);
                }
            return listealiment;    
            } 
        catch (SQLException ex) {
            System.out.println("erreur lors du chargement des aliments "+ex.getMessage());
            return null;
        }
    }

}
