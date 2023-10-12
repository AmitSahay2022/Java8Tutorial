package functional_interface;

public class Test {
	private Calculator calculator=new CalculatorImpl();
	
	public void calc() {
		calculator.switchOn();
	}
	
	public static void main(String[] args) {
		
		Test test=new Test();
		test.calc();
		
		CalculatorImpl2 impl2=new CalculatorImpl2();
		impl2.calculate();

	}
	

}
