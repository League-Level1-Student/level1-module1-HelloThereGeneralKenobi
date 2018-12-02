
public class Dog {
	
	String favoriteFood;
	int numberOfFriends;
	
	public static void main(String[] args) {
		
	}
	
	void bark() {
		System.out.println("The dog goes 'bark!'");
	}
	
	void rollOver() {
		System.out.println("The dog rolls over.");
	}
	
	Dog(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
}
