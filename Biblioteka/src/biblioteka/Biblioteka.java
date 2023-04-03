package biblioteka;

import java.util.List;

public class Biblioteka implements interfejs.Biblioteka {

	private List<Knjiga> knjige;
	
	
	public Biblioteka(List<Knjiga> knjige) {
		super();
		this.knjige = knjige;
	}

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
		
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
		
	}

	@Override
	public Knjiga vratiKnjigu(Long isbn) {
		for(Knjiga knjiga:knjige) {
			if(knjiga.getIsbn()==isbn) {
				return knjiga;
			}
		}
		return null;
	}

}
