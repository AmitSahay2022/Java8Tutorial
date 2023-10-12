package functional_interface;
//--------Java 8 Approach--------------------
public class CalculatorImpl2{
   public void calculate() {
	   //------providing the implementation for Functional interface and using it-------- 
	   
	   Calculator c1=()->System.out.println("Calculator is On"); //interface reference holding one implementation
	   c1.switchOn();
	   
	   Calculator c2=()->System.out.println("Now it is turned of");//interface reference holding another implementation
	   c2.switchOn();
	   
	 
	   ICalcWithArguments ic=(a,b)->{return (a+b);};
	   System.out.println(ic.add(10, 20));
	   
	   CalcPractice3 cp3= ( x, y, z)->x+y+z;
	   System.out.println(cp3.add(2, 8, 5));
   }
   
}

/*
 But hear we will miss polymorphism at project level and this approach is valid for only Functional Interface
   Calculator c=new CalculatorImpl();
              c=new CalculatorImpl2(); 
     //---------But Polymorphism is applied on method level 
*/