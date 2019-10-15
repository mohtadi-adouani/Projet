import java.time.*;
import java.util.ArrayList;

public class Vol{

	private String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	public ArrayList<Reservation> Reservations = new ArrayList<Reservation>();
	public Integer passagerMax;

	Vol(ZonedDateTime d,ZonedDateTime a){
		this.passagerMax = 217; //Par defaut
		this.depart = d;
		this.arrivee = a;
		this.identifiant = Integer.toString((int)Math.random()*7563)+Integer.toString((int)Math.random()*75635);
	}
	//Methodes
	public void addReservation(Reservation r){
		this.Reservations.add(r);
	}
	//Setteurs
	public void setdepart(ZonedDateTime d){
		this.depart = d ;
	}

	public void setarrivee(ZonedDateTime a){
		this.arrivee = a;
	}

	//Getteurs
	public ZonedDateTime getdepart(){
		return this.depart;
	}

	public ZonedDateTime getarrivee(){
		return this.arrivee;
	}
	
}
