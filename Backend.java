import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Backend {
	
	ArrayList < Integer > prime_list = new ArrayList < Integer > ();
    Map < Integer, Integer[] > composite_map = new HashMap < Integer, Integer[] > ();
    
    CopyOnWriteArrayList < Integer > unbounded_prime_list = new CopyOnWriteArrayList < Integer > ();
    Map < Integer, Integer[] > unbounded_composite_map = new ConcurrentHashMap < Integer, Integer[] > ();
	
	
	public void unthreaded(int entered_num) {
		
		prime_list.clear();
		composite_map.clear();
		
		long startTime = System.currentTimeMillis();

        for (int i = 2; i <= entered_num; ++i) {

            if (PrimeIdentifier.isPrime(i))
                prime_list.add(i);
            else
                composite_map.put(i, Factorizer.addDivisors(i));
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Number of primes betweeen 1 and " + entered_num + ": " + (prime_list.size()));

        
        
        
        
        System.out.println("Total time in milliseconds: " + totalTime);
	}
	
	public void unbounded(int entered_num) {
		
		unbounded_prime_list.clear();
		unbounded_composite_map.clear();
		
		long startTime = System.currentTimeMillis();
		
		class Runner implements Runnable {
			int n;
			Runner(int num) {
				n = num;
			}

			@Override
			public void run() {
				if (PrimeIdentifier.isPrime(n))
	                unbounded_prime_list.add(n);
	            else
	                unbounded_composite_map.put(n, Factorizer.addDivisors(n));
			}
				
			}
		for(int i = 2; i <= entered_num; ++i) {
			Thread t = new Thread(new Runner(i));
			t.start();
		}
		
		long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        
        System.out.println("Number of primes betweeen 1 and " + entered_num + ": " + (unbounded_prime_list.size()));
        
        

        System.out.println("Total time in milliseconds: " + totalTime);
		}
	
		

}
