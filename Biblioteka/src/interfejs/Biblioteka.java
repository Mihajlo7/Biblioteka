package interfejs;

import biblioteka.Knjiga;

public interface Biblioteka {
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public Knjiga vratiKnjigu(Long isbn);
}
