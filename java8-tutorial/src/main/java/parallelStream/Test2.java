package parallelStream;

import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		IntStream.range(1, 10).map(i->i*2).forEach(e->{
			System.out.println(e+" : "+Thread.currentThread().getName());
			
		});
		long end=System.currentTimeMillis();
		System.out.println("Total time to execute normal stream : "+(end-start));
		System.out.println("------------------------------------------------");
		
		start=System.currentTimeMillis();
		IntStream.range(1, 10).parallel().map(i->i*3).forEach(e->{
			System.out.println(e+":"+Thread.currentThread().getName());
		});
		end=System.currentTimeMillis();
		System.out.println("Time to execute parallel stream: "+(end-start));

	}

}
