package imperative;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class perfectNumber {

	public enum STATE { 
		DEFICIENT, PERFECT, ABUNDANT;
	}

	public static Set<Integer> divisors(int n) { 
		Set<Integer> result = new HashSet<>();

//		Set<Integer> streaFromItereate = Stream.iterate(1, x -> x +1);
//		Set<Integer> set = IntStream.range(1, n)
//				.boxed()
//				.filter(n)
//				.collect(Collectors.toSet());
//		return result;
//	}

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { 
				result.add(i);
			}
		}
		
		return result;
	}

	
	public static STATE process(int n) {
		int sum = 0; 
		
		for (int i: divisors(n)) { 
			if (i != n) 
				sum += i;
		}
		
		if (sum < n) { 
			return STATE.DEFICIENT; 
		} else if (sum == n) { 
			return STATE.PERFECT;
		} else { 
			return STATE.ABUNDANT;
		}
	}

}
