public class Client{
    private String nom;
    private String paiement;
    private String contact;
    private String reference;
    
    Client(String n,String p,String c,String r){
        this.nom = n;
        this.paiement = p;
        this.contact = c;
        this.reference =r;
    }
    //Getteurs
    public String getnom(){
        return this.nom;
    }

    public String getpaiment(){
        return this.paiement;
    }

    public String getcontact(){
        return this.contact;
    }

    public String reference(){
        return this.reference;
    }

    //Setteurs
    public void setnom(String n){
        this.nom = n;
    }

    public void setpaiment(String p){
        this.paiement = p;
    }

    public void setcontact(String c){
        this.contact = c;
    }

    public void setreference(String r){
        this.reference = r;
    }
}