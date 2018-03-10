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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(vrednost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((vrsta == null) ? 0 : vrsta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (vrsta == null) {
			if (other.vrsta != null)
				return false;
		} else if (!vrsta.equals(other.vrsta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [vrsta=" + vrsta + ", datum=" + datum + ", vrednost=" + vrednost + "]";
	}
}
