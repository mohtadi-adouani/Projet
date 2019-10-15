import java.util.Date;
import java.util.ArrayList;
public class Reservation{

    public Date date;
    public Double identifiant;
    public String etat;
    public Vol vol;
    public ArrayList<Client> clients = new ArrayList<Client>();
    public ArrayList<Passager> passagers = new ArrayList<Passager>();

    Reservation(Date d,Double i,Vol v,Passager[] p,Client[] c){
	if(p.length >= 1 || c.length>=1 ){
        	this.date = d;
        	this.identifiant = i;
        	this.vol = v;
        	this.etat="Attente";
		for(Passager e : p){
			this.passagers.add(e);
		}
		for(Client e :c){
			this.clients.add(e);
		}
	v.addReservation(this);
	for(Passager e : p){
			e.addReservation(this);
		}
		for(Client e :c){
			e.addReservation(this);
		}
	

	}
	else{
		System.out.println("Erreur , client ou passager absent !");
	}
    }

    //Methodes
    public void annuler(){
        this.etat = "Annule";
    }

    public void confirmer(){
        this.etat = "Confirme";
    }

    public void payer(){
        this.etat = "Paye";
    }

    
}
