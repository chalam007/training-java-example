
public class HelloWorld {

	public static void main(String[] args) { // method signature
	
		HelloWorld hw = new HelloWorld();
		hw.printMessage(); //instance methods always call with reference
		hw.printMessage("srinu");
		String message = hw.printMessageWithRetunType();//return type
		System.out.println(message);
		String messageRetun = hw.printMessageWithRetunTypeAndInput("ramu");
		System.out.println(messageRetun);
		
		HelloWorld.printMessageStatic();//static methods can call with class name or with out class name
		HelloWorld.printMessageStatic("chalam");		
		String messageStatic = HelloWorld.printMessageWithRetunTypeStatic();//return type
		System.out.println(messageStatic);
		String messagStaticReturn = HelloWorld.printMessageWithRetunTypeStaticAndInput("vasu");
		System.out.println(messagStaticReturn);
	}
	
	
	public void printMessage() {
		System.out.println("Hellow World...!");
	}
	
	public static void printMessageStatic() {
		System.out.println("Hellow World...Static !");
	}
	
	public void printMessage(String name) {//input parameters
		System.out.println("Hellow World...!" + name);
	}
	
	public static void printMessageStatic(String name) {
		System.out.println("Hellow World...Static !" + name);
	}
	
	public String printMessageWithRetunType() {
		return "Hellow World with return type...!";
	}
	
	public static String printMessageWithRetunTypeStatic() {
		return "Hellow World with retun type...Static !";
	}

	
	public String printMessageWithRetunTypeAndInput(String name) {
		return "Hellow World with return type...!" + name;
	}
	
	public static String printMessageWithRetunTypeStaticAndInput(String name) {
		return "Hellow World with retun type...Static !" + name;
	}

}
