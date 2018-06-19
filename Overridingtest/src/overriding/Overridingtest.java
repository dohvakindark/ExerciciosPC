package overriding;

public class Overridingtest {

	public static void main(String[] args) {
		Cycle cycle= new Cycle();
		cycle.printInfo();
		Bicycle bicycle = new Bicycle();
		
		bicycle.printInfo();
	}
	
	
}
class Cycle{
	int peso = 10;
	public void printInfo() {
		System.out.println("superclasse"+peso);
	}
}
class Bicycle extends Cycle{
	String teste="hero";
	public void printInfo() {
		System.out.println("subclasse"+teste);
	}
}
