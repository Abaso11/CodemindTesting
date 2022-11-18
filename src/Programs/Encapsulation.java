package Programs;

  class EncapsulationExample{
	int a=20;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}	
}

public class Encapsulation {

	public static void main(String[] args) {
		EncapsulationExample e1 = new EncapsulationExample();
		
		System.out.println(e1.getA());

	}

}