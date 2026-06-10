package Model.DAO;

import Model.Classes.Commande;
import Model.Classes.Service;
import Model.Classes.Utilisateur;

import java.util.List;

public interface UtilisateurDao {

    public void add(Utilisateur utilisateur);
    public void Update(int id);
    public void Delete(int id);
    List<Commander> getCommanderByClient(int idClient);
    boolean addInfoClient(int clientID, Service service, Commande localite, Domaine domaine, int budget);

}
