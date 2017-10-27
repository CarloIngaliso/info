package verifica;
import java.util.Scanner;

public class TestMappa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double latitudine;
		double longitudine;
		PuntoMappa tmp;
		Mappa mappa = new Mappa("stops.txt");
		System.out.println("Insert the latitude");
		latitudine = input.nextDouble();
		System.out.println("Insert the longitude");
		longitudine = input.nextDouble();
		tmp = mappa.search(latitudine, longitudine);
		System.out.println("You are near" +tmp.getStopName());
	}
}
