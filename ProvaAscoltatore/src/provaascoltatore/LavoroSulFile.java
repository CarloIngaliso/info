package provaascoltatore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class LavoroSulFile {
	public String Leggi(int indice) throws IOException {
		int i = 0;
		Scanner input;
		String[] tmp = new String[Lunghezza()];
		File input_file = new File("frase.txt");
		try {
			input = new Scanner(input_file);
		} catch (FileNotFoundException e) {
			System.out.println("Error, file not found or unreadable...");
			return "";
		};
		while (input.hasNextLine()) {
			tmp[i] = input.nextLine();
			i++;
			try {
			} catch (java.lang.NumberFormatException e) {
			}
		}
		return tmp[indice];
	}

	public int Lunghezza() throws FileNotFoundException, IOException {
		int cont = 0;
		try {
			FileReader reader = new FileReader("frase.txt");
			BufferedReader in = new BufferedReader(reader);
			while (in.readLine() != null) {
				cont++;
			}
		} catch (IOException e) {
		}
		return cont;
	}
}

