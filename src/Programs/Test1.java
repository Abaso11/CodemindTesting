package Programs;

interface gateway{
	int i = 100;
	int a=1000;
	float b = 2505.50f;
	String c ="Aba";
	String M = "Sanket";
	
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
	
	class Upi implements gateway{
		void recharge() {
			System.out.println("Recharge successfull ammount  " + "is :"  + i + " Recharged by "+ c + "Money recived from " + M);
		}
		void lightbill() {
			System.out.println("Light bill paid amount is : " + a + " payment do "+ c + "Money recived from " + M );
		}
		void homerent() {
			System.out.println("Home rent paid amount is : " + b + " paid by "+ c + "Money recived from " + M );
		}
	}
}
public class Test1 {

	public static void main(String[] args) {
	
		gateway g = new phonepay();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
