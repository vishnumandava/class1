package com.javaclass;

public class fib {
	int x= 100;
	public void printfibonacci( ) {
//		fib z = new fib();
	int i;
	int n1 = 1;
	int n2 = 1;
	int n3;
System.out.println(n1 + " " +n2) ;
	for (i = 3; i <= x; i++) {
		n3 = n1 + n2;
		if (n3 <= x) {
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
		} else
			break;

	}
}

public static void main(String args[]) {
	 fib y = new fib();
	y.printfibonacci();

}

}
