
package provaascoltatore;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ProvaAscoltatore {

	public static void main(String[] args) throws IOException {
		LavoroSulFile work = new LavoroSulFile();
		Frame f = new Frame("lettore");
		f.setSize(640, 320);
		Button inizio = new Button("<<");
		Label lunghezza = new Label("Lunghezza = "+work.Lunghezza());
		Button fine = new Button(">>");
		Button indietro = new Button("<");
		Label corrente = new Label(work.Leggi(0));
		Button avanti = new Button(">");
		Button add = new Button("ADD");
		TextArea toadd = new TextArea("");
		Button del = new Button("DEL");
		Button[] bottoni = {inizio,fine,indietro,avanti,add,del};
		Label[] labels = {corrente,lunghezza};
		TextArea[] area = {toadd};
		AscoltatoreBtn btn = new AscoltatoreBtn(bottoni,labels,area);
		inizio.addMouseListener(btn);
		fine.addMouseListener(btn);
		indietro.addMouseListener(btn);
		avanti.addMouseListener(btn);
		add.addMouseListener(btn);
		del.addMouseListener(btn);
		AscoltatoreWin win = new AscoltatoreWin();
		f.addWindowListener(win);
		f.setLayout(new GridLayout(3,3));
		f.add(inizio);
		f.add(lunghezza);
		f.add(fine);
		f.add(indietro);
		f.add(corrente);
		f.add(avanti);
		f.add(add);
		f.add(toadd);
		f.add(del);
		f.setVisible(true);
	}
	
}
