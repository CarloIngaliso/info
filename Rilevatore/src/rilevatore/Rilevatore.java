
package rilevatore;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author carlo.ingaliso
 */
public class Rilevatore extends Application {
	DatagramSocket rilevatore;
	@Override
	public void start(Stage stage) throws Exception {
		rilevatore = new DatagramSocket();
		rilevatore.connect(InetAddress.getLocalHost(), 9090);
		new Thread(new SendPositionToServer(rilevatore)).start();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	private void initComponents(Stage stage) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
}
