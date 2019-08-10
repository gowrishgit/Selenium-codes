package Inheritance;

public class Son extends GrandFather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.city(); //Accessing method from grandfather class
		s.country(); //Accessing method from grandfather class
		System.out.println(s.state); //Accessing variable from grandfather class

	}
	public void SonActivity()
	{
		System.out.println("Working in IT");
	}

}
