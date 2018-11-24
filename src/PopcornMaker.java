import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave Microwave = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn?");
		Popcorn Popcorn = new Popcorn(flavor);
		Microwave.putInMicrowave(Popcorn);
		String cookTime = JOptionPane.showInputDialog("How long do you want to cook your popcorn?");
		int cookTime1 = Integer.parseInt(cookTime);
		Microwave.setTime(cookTime1);
		Microwave.startMicrowave();
		for(int i = 20; i > 0; i = i - 1) {
			Popcorn.applyHeat();
		}
		Popcorn.eat();
	}
}
