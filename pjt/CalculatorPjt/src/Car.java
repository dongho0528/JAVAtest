
public class Car {
	
	int size = 5;
	String color = "black";
	String carName = "";
	
	public Car(String cn) {
		System.out.println("DEFAULT CONSTRUCTOR");
		carName = cn;
	}
	
	public void goForward() {
		System.out.println("전진 지금이니!");
	}
	public void goBackward() {
		System.out.println("후진 지금이니!");
	}
	public void printInfo() {
		System.out.println("size : "+size);
		System.out.println("color : "+color);
		System.out.println("carName : "+carName);
	}
}
