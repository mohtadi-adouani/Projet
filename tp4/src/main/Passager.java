import java.util.ArrayList;
public class Passager{

    private String nom;
    private String contact;
    public ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    Passager(String n,String c){
        this.nom = n ;
        this.contact = c ;
    }

     //Methodes
	public void addReservation(Reservation r){
		this.reservations.add(r);
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
