package consumer.functional_interface;

import java.util.function.Consumer;
//---------Traditional Approach---------------------------------
public class ConsumerDemo implements Consumer<Integer> {
	public void accept(Integer t) {
		System.out.println("Printing: " + t);
	};

	public static void main(String[] args) {
       ConsumerDemo demo=new ConsumerDemo();
       demo.accept(10);
	}
}
