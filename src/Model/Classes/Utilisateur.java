package Model.Classes;

public class Utilisateur {

    private Integer id;
private String nom;
private String prenom;
    private Integer telephone;
    private String email;


    //Constructors

    public Utilisateur(String nom, String prenom, Integer telephone, String email){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

    public Utilisateur() {
    }

    //Getters and Setters


    public Integer getId() {
        return id;
    }
    public String getnom() {
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public Integer getTelephone(){
        return telephone;
    }
    public String getemail(){
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setnom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setTelephone(Integer telephone){
        this.telephone = telephone;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
