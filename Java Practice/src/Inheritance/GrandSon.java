package Inheritance;

public class GrandSon extends Son {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandSon gs = new GrandSon();
		gs.city(); //Accessing method from grandfather class
		gs.country(); //Accessing method from grandfather class
		System.out.println(gs.state);
		gs.SonActivity(); //Accessing method from Son class

	}

}
