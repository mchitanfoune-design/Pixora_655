package Model.Classes;

public class Client extends Utilisateur{
    private Service service;
    private Commande commande;


    //Constructors

    public Client(){

    }

    public Client (String nom, String prenom , Integer telephone , String email, Service service, Commande commander){

super(nom, prenom, telephone, email);
this.service = service;
this.commande = commande;

    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Commande getCommander() {
        return commande;
    }

    public void setCommander(Commande commander){
        this.commande = commander;
    }
}

