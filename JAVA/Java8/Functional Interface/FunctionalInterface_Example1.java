package java8.functioninterface;

public class FunctionalInterface_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()->{
			System.out.println("New thread created");
		}).start();
	}

}
