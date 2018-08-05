import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave micro = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		Popcorn pop = new Popcorn(flavor);
		micro.putInMicrowave(pop);
		micro.setTime(2);
		micro.startMicrowave();
	}
}
