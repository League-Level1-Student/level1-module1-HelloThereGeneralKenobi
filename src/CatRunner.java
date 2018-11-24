
public class CatRunner {
	public static void main(String[] args) {
		Cat Cat = new Cat("Garfeild, Destroyer of Worlds");
		Cat.meow();
		Cat.printName();
		for(int i = 9; i > 0; i = i - 1) {
			Cat.kill();
		}
				
	}
}
