
public class Bond {
	public static void main(String[] args) {
		Bond bond = new Bond();
		Vault vault = new Vault();
		System.out.println(bond.findCode(vault));
	}
	
	int findCode(Vault vault) {
		for(int i = 0; i < 1000000000; i++) {
			if(vault.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
