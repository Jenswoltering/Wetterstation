
import java.util.Observable;
import java.util.Observer;


public class AktuelleBedingungen implements Observer{
	public AktuelleBedingungen(){}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Automatisch generierter Methodenstub
		MessDaten daten = (MessDaten) arg;
		System.out.println("aktuell: " 
				+ daten.getTemperatur() + " C " 
				+ daten.getFeuchtigkeit() + "% "
				+ daten.getDruck() + " hPa ");
	}
}
