import java.math.*;
public class Prime {
	public static void main(String[] args) {
		int max = 100;
		for(int x = 2; x <=max; x++) {
			boolean isprime = true;
			for(int y = 2; y < x; y++)
				if(x%y ==0) {
					isprime = false;
					break;
				
				}
			if(isprime)
				
			System.out.println(x); }
	}
}
