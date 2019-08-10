package InterfaceConcept;

public class ImplementInterface implements BankingClient, DomainClient {

	public static void main(String[] args) {
		ImplementInterface i = new ImplementInterface();
		i.paycreditcard();
		i.checkingbalance();
		i.checkingbalance();
		i.Login();
		BankingClient bc = new ImplementInterface(); // Runtime Polymorphism for Banking Client
		bc.paycreditcard();
		DomainClient dc = new ImplementInterface(); // Runtime Polymorphism for Domain Client
		dc.investments();
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("Paycreditcard Implemented");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("Transferbalance Implemented");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("Ckeckingbalance Implemented");
	}
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Login Validation");
	}
	@Override
	public void investments() {
		// TODO Auto-generated method stub
		System.out.println("Investments Implemented");
	}
}
