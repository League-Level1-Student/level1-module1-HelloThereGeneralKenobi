
public class Duck {
	
	int numberOfFriends;
	String favoriteFood;
	
	public static void main(String[] args) {
	
	}

	void quack() {
		System.out.println("The duck goes 'quack!'");
	}
	
	void waddle() {
		System.out.println("The duck waddles.");
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	
	
	
}
