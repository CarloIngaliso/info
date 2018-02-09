
package rilevatore;

import java.net.DatagramSocket;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author carlo.ingaliso
 */
public class SendPositionToServer implements Runnable {
	DatagramSocket rilevatore;
	public SendPositionToServer(DatagramSocket rilevatore) {
		this.rilevatore=rilevatore;
	}

	@Override
	public void run() {
		String posizione= "Latitudine: "+ new Random().nextFloat()*100+"Longitudine: "+new Random().nextFloat()*100+" Targa: "+rilevatore.getLocalAddress()+" Data: "+ new Date();
		while(true){
			rilevatore.send(new DatagramPacket());
		}
	}
	
}
