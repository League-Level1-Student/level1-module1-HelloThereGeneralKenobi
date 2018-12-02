import javax.swing.JOptionPane;

public class Vault{
	
	int code = 394621957;
	
	public static void main(String[] args) {
		Vault vault = new Vault();
		System.out.println(vault.tryCode(0));
	}
	
	boolean tryCode(int trycode) {
		if(trycode == code) {
			return true;
		}
		else {
			return false;
		}
	}
}
