package supplier.functional_interface;

import java.util.function.Supplier;

public class SupplierDemoWithLambda {
	public static void main(String[] args) {
        Supplier<String> supply=()->"Amit Kumar Sahay";
        
        System.out.println(supply.get());
	}
}
