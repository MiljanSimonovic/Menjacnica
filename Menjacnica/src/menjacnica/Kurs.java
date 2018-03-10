package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private String vrsta;
	private GregorianCalendar datum;
	private double vrednost;
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public double getVrednost() {
		return vrednost;
	}
	public void setVrednost(double vrednost) {
		this.vrednost = vrednost;
	}
	
	
}
