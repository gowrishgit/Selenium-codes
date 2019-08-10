package Constructor;

public class ConstructorDemo {
	
	public ConstructorDemo() //Default Constructor
	{
		System.out.println("I am in the Default constructor");
	}
	
	public ConstructorDemo(int a, int b) //parameterized explicit constructor
	{
		int c=a+b;
		System.out.println("I am in the parameterized constructor");
		System.out.println(c);
	}
	
	public ConstructorDemo(String str) //parameterized explicit constructor
	{
		System.out.println(str);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor is a block of code whenever an object is created
		//Contractor will not return any values
		//Name of constructor shout be class name
		//Constructor will call implicit when constructor is not defined 
		ConstructorDemo cd= new ConstructorDemo();
		ConstructorDemo cd1= new ConstructorDemo(4,5);
		ConstructorDemo cd2= new ConstructorDemo("Hello");
	}

}
