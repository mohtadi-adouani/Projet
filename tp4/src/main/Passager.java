public class Passager{

    private String nom;
    private String contact;

    Passager(String n,String c){
        this.nom = n ;
        this.contact = c ;
    }
    //Getteurs
    public String getnom(){
        return this.nom;
    }
    public String getcontact(){
        return this.contact;
    }
    //Setteurs
    public void setnom(String n){
        this.nom = n;
    }

    public void setcontact(String c){
        this.contact = c;
    }
}