
public class Player {
	
	public static void main(String[] args) {
		
		int strength = 10;		
		
		Person tom = new Person("Tom",10.0, 216.15);
		
		System.out.println("Hello World! " + strength);
		tom.walks();
	
		
		Person mike = new Person("Mike", 9.5, 195.5);
		mike.walks();
	
		tom.eats();
		mike.eats();

	}
		
}
 