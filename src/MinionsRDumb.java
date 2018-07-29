
public class MinionsRDumb {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public MinionsRDumb(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	public String getName () {
		return this.name;
	}
	public int getEyes () {
		return this.eyes;
	}
	public String getColor () {
		return this.color;
	}
	public String getMaster () {
		return this.master;
	}
	public void setMaster (String master) {
		this.master = master;
	}
}