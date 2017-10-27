package verifica;

public class PuntoMappa {
	private final double stopLat;
	private final double stopLon;
	private final int stopId;
	private final String stopName;
	
	public PuntoMappa(int stopId, String stopName, double stopLat, double stopLon) {
		this.stopId = stopId;
		this.stopName = stopName;
		this.stopLat = stopLat;
		this.stopLon = stopLon;
	}

	public int getStopId() {
		return stopId;
	}

	public String getStopName() {
		return stopName;
	}

	public double getStopLat() {
		return stopLat;
	}

	public double getStopLon() {
		return stopLon;
	}
}
