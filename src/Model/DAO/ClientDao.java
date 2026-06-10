package Model.DAO;

import Model.Classes.Client;
import Model.Classes.Commande;
import Model.Classes.Utilisateur;

import java.util.List;

public interface ClientDao {

    public void add(Client Client);
    public void Update(int id);
    public void Delete(int id);

}
