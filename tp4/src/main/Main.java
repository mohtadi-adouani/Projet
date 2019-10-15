import java.time.ZonedDateTime;
import java.util.Date;

public class Main{
	public static void main(String[] args){
		ZonedDateTime t1 = ZonedDateTime.now();
		ZonedDateTime t2 = ZonedDateTime.now();
		Date d1 = new Date();

		Client c1 =  new Client("Jean","Pierre","Mail:Jean-Pierre@gmail.com","");
		Passager p1 = new Passager("Marie","Pierre");
		Vol v1 = new Vol(t1,t2);

		Client[] c = new Client[2];c[0]=c1;
		Passager[] p = new Passager[2];p[0]=p1;

		Reservation r1 = new Reservation(d1,1.5,v1,p,c);
	}
}
