package provaascoltatore;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;

class AscoltatoreBtn implements MouseListener{
	int i = 0;
	LavoroSulFile work = new LavoroSulFile();
	Button[] bottoni;
	Label[] labels;
	TextArea[] area;
	
	public AscoltatoreBtn(Button[] bottoni,Label[] labels,TextArea[] area) {
		this.bottoni = bottoni;
		this.labels = labels;
		this.area = area;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == bottoni[0]){
			try {
				portaInizio();
			} catch (IOException ex) {
				Logger.getLogger(AscoltatoreBtn.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if(e.getSource() == bottoni[1]){
			try {
				portaFine();
			} catch (IOException ex) {
				Logger.getLogger(AscoltatoreBtn.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if(e.getSource() == bottoni[2]){
			try {
				Indietro();
			} catch (IOException ex) {
				Logger.getLogger(AscoltatoreBtn.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if(e.getSource() == bottoni[3]){
			try {
				Avanti();
			} catch (IOException ex) {
				Logger.getLogger(AscoltatoreBtn.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if(e.getSource() == bottoni[4]){
			try {
				Delete();
			} catch (IOException ex) {
				Logger.getLogger(AscoltatoreBtn.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if(e.getSource() == bottoni[5]){
			try {
				Add();
			} catch (IOException ex) {
				Logger.getLogger(AscoltatoreBtn.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	private void portaInizio() throws IOException {
		i = 0;
		labels[0].setText(work.Leggi(i));
	}
	private void Avanti() throws IOException{
		if(i<work.Lunghezza()-1){
			i++;
			labels[0].setText(work.Leggi(i));
		}
	}

	private void portaFine() throws IOException {
		i = work.Lunghezza();
		labels[0].setText(work.Leggi(i-1));
	}

	private void Indietro() throws IOException {
		if(i>0){
		i--;
		labels[0].setText(work.Leggi(i));
		}
	}

	private void Delete() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	private void Add() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
