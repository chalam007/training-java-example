
public class Addition {
	
	public static void main(String[] args) {
		Addition add = new Addition();
		add.add();
		add.add(20,40);
		int z = add.addRetun(10, 80);
		System.out.println("z value return : " +z);
		
		Addition.addStatic();
		Addition.addStatic(30, 70);
		int c= Addition.addStaticReturn(15, 25);
		System.out.println("c value static return :" +c);
	}
	
	public void add() {
		int x = 10;
		int y = 20;
		int z = x+y;
		System.out.println("Addition of two numbers : " + z);
	}
	
	public static void addStatic() {
		int x = 10;
		int y = 20;
		int z = x+y;
		System.out.println("Addition of two numbers : " + z);
	}
	
	public void add(int x, int y) {
		int z = x+y;
		System.out.println("Addition of two numbers : " + z);
	}
	
	public static void addStatic(int x, int y) {
		int z = x+y;
		System.out.println("Addition of two numbers : " + z);
	}

	public int addRetun(int x, int y) {
		return x+y;
		
	}
	
	public static int addStaticReturn(int x, int y) {
		return x+y;
		
	}
}
