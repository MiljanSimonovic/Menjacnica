package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKurs(String nazivValute, String vrsta, GregorianCalendar datum, double vrednost);
	public void izbrisiKurs(String nazivValute, String vrsta, GregorianCalendar datum);
	public Kurs vratiKurs(String nazivValute, String vrsta, GregorianCalendar datum);
}
