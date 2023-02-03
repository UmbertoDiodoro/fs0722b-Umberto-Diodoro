package d5;

public class Video extends Multimedia implements VideoImmagine,VideoAudio {

	private int durata;
	private int volume; 
	private int luminosità;
	private String esclamativo="";
	private String ast ="";
	
	public Video(String title, int durata, int volume, int luminosità) {
		super(title);
		this.durata=durata;
		this.volume=volume;
		this.luminosità=luminosità;
		}

	@Override
	public int alzaVolume() {
		return this.volume++;
	}

	@Override
	public int abbassaVolume() {
		return this.volume--;
	}

	@Override
	public void play() {
		for (int i = 0; i < this.durata; i++) {
			System.out.println(super.getTitle() + this.esclamativi());
		}
	}
	

	public String esclamativi() {
		this.esclamativo="";
		for(int i=0;i<this.volume;i++) {
			this.esclamativo += "!";
	}
		return this.esclamativo;
	
}
	
	public String creaAsterischi() {
		this.ast="";
		for(int i=0;i<this.luminosità;i++) {
			this.ast="*";
		}
		return this.ast;
	}

	@Override
	public int dimuisciLuminosità() {
		return this.luminosità--;
	}

	@Override
	public int aumentaLuminosità() {
		return this.luminosità++;
	}
}

	

	