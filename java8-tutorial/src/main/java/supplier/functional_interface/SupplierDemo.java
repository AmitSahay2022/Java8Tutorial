package supplier.functional_interface;

import java.util.function.Supplier;
//-----------Supplier does not take argument but just return 
public class SupplierDemo implements Supplier<String> {
	@Override
	public String get() {
		
		return "Amit Kumar";
	}
	
	
	public static void main(String[] args) {
		SupplierDemo sd=new SupplierDemo();
		System.out.println(sd.get());
	}
}
