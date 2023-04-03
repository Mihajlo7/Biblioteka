package biblioteka;

import java.util.List;

public class Knjiga {
	private String naslov;
	private Long isbn;
	private List<Autor> autori;
	private int izdanje;
	public Knjiga(String naslov, Long isbn, List<Autor> autori, int izdanje) {
		super();
		this.naslov = naslov;
		this.isbn = isbn;
		this.autori = autori;
		this.izdanje = izdanje;
	}
	public Knjiga() {
		super();
	}
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdanje=" + izdanje + "]";
	}
	
	
}
