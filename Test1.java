package Programs;

interface gateway{
	int i = 100;
	int a=1000;
	float b = 2505.50f;
	String c ="Aba";
	
}
class phonepay implements gateway{
	void recharge() {
		System.out.println("Recharge successfull ammount  " + "is :"  + i);
	}
	void lightbill() {
		System.out.println("Light bill paid amount is : " + a );
	}
	void homerent() {
		System.out.println("Home rent paid amount is : " + b );
	}
}
class paytm implements gateway{
	void recharge() {
		System.out.println("Recharge successfull ammount  " + "is :"  + i + " Recharged by "+ c);
	}
	void lightbill() {
		System.out.println("Light bill paid amount is : " + a + " payment do "+ c );
	}
	void homerent() {
		System.out.println("Home rent paid amount is : " + b + " paid by "+ c );
	}
	
	}

public class Test1 {

	public static void main(String[] args) {
	
		gateway g1 = new phonepay();
		p1.recharge();
		p1.lightbill();
		p1.homerent();
		
		gateway pm = new paytm();
		pm.recharge();
		pm.lightbill();
		pm.homerent();
	}

}
