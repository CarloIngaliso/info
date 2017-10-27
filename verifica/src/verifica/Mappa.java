package verifica;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public final class Mappa {

	ListaConcatenata<PuntoMappa> mappa;

	public Mappa(String fileName) {

		mappa = new ListaConcatenata();

		load(fileName);

	}

	public void load(String fileName) {

		Scanner input;

		String tmp[];

		File input_file;

		input_file = new File(fileName);

		try {

			input = new Scanner(input_file);

		} catch (FileNotFoundException e) {

			System.out.println("Error, file not found or unreadable...");

			return;

		}

		input.nextLine();

		while (input.hasNextLine()) {

			tmp = input.nextLine().split(",");

			try {

				mappa.addNodo(new PuntoMappa(Integer.parseInt(tmp[0]), tmp[2], Double.parseDouble(tmp[4]), Double.parseDouble(tmp[5])));

			} catch (java.lang.NumberFormatException e) {

			}

		}

	}

	public PuntoMappa search(double lat, double lon) {

		PuntoMappa near;

		double distNear;

		double tmpDist;

		PuntoMappa tmp;

		mappa.restartIterator();

		near = mappa.getNext();

		distNear = getDist(lat, lon, near.getStopLat(), near.getStopLon());

		while (mappa.hasNext()) {

			tmp = mappa.getNext();

			tmpDist = getDist(lat, lon, tmp.getStopLat(), tmp.getStopLon());

			if (tmpDist < distNear) {

				near = tmp;

				distNear = tmpDist;

			}

		}

		return near;

	}

	private static double getDist(double x1, double y1, double x2, double y2) {

		double dist = (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));

		return dist;

	}

}
