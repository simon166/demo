package springAction;

public class Instrumentalist implements Performer{
	private String song;
	private Instrument instrument;
	private int age;
	
	public Instrumentalist(){
		
	}
	
	public void perform(){
		System.out.println("age = " + age);
		System.out.println("Playing "+song);
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
