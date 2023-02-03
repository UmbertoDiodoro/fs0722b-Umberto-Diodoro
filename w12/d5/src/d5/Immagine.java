package d5;

public class Immagine extends Multimedia implements VideoImmagine {

	private int luminosità;
	private String ast="";
	
	public Immagine(String title, int luminosità) {
		super(title);
		
		this.luminosità=luminosità;
	}

	@Override
	public int dimuisciLuminosità() {
		
		return this.luminosità--;
	}

	@Override
	public int aumentaLuminosità() {
		
		return this.luminosità++;
	}
	public void Show() {
		System.out.println(this.getTitle()+ this.creaAsterischi());
	}
	public String creaAsterischi() {
		this.ast="";
		for(int i=0;i<this.luminosità;i++) {
			this.ast="*";
		}
		return this.ast;
	}
}
