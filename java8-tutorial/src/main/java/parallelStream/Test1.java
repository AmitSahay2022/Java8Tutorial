package parallelStream;

import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		startTime = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::print);
		endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Normal Stream took: " + (endTime - startTime) + " miliseconds");
		System.out.println("-------------------------------");
		startTime = System.currentTimeMillis();

		IntStream.range(1, 100).parallel().forEach(System.out::print);
		System.out.println();

		endTime = System.currentTimeMillis();
		System.out.println("Parallel Stream took: " + (endTime - startTime) + " miliseconds");
	}

}
