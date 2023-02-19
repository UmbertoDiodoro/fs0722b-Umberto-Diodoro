package d5;

public class Audio extends Multimedia implements VideoAudio {

	private int durata;
	private int volume;
	private String esclamativo = "";

	public Audio(String title, int durata, int volume) {
		super(title);
		this.durata = durata;
		this.volume = volume;
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
}
