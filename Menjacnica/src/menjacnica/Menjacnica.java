package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

private LinkedList<Valuta> valute=new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(String nazivValute, String vrsta, GregorianCalendar datum, double vrednost) {
		Valuta v=new Valuta();
		v.setNaziv(nazivValute);
		Kurs k=new Kurs();
		k.setVrsta(vrsta);
		k.setDatum(datum);
		k.setVrednost(vrednost);
		
		if(valute.contains(v))
			throw new RuntimeException("Uneta valuta vec postoji");
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i)==null) {
				valute.get(i).getKursevi().add(k);
				break;
			}
		}
	}

	@Override
	public void izbrisiKurs(String nazivValute, String vrsta, GregorianCalendar datum) {
		Valuta v=new Valuta();
		v.setNaziv(nazivValute);
		Kurs k=new Kurs();
		k.setVrsta(vrsta);
		k.setDatum(datum);
		
		if(!valute.contains(v))
			throw new RuntimeException("Uneta valuta ne postoji");
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getKursevi().contains(k))
				valute.get(i).getKursevi().remove(k);
		}
	}

	@Override
	public Kurs vratiKurs(String nazivValute, String vrsta, GregorianCalendar datum) {
		Valuta v=new Valuta();
		v.setNaziv(nazivValute);
		Kurs k=new Kurs();
		k.setVrsta(vrsta);
		k.setDatum(datum);

		if(!valute.contains(v))
			throw new RuntimeException("Ne postoji data valuta");
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getKursevi().contains(k))
				return k;
		}
		throw new RuntimeException("Ne postoji kurs za taj dan");
	}
}
