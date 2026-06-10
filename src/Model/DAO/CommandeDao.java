package Model.DAO;

import Model.Classes.Commande;
import Model.Classes.Utilisateur;

import java.util.List;

public interface CommandeDao {

    List<Commande> getCommandesByClient(int idClient);

}
