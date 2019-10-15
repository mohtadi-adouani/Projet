import java.util.Date;
public class Reservation{

    public Date date;
    public Double identifiant;
    public String etat;
    public Vol vol;

    Reservation(Date d,Double i,Vol v){
        this.date = d;
        this.identifiant = i;
        this.vol = v;
        this.etat="Attente";
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