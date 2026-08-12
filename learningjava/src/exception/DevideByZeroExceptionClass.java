package exception;

public class DevideByZeroExceptionClass {
	
	public static int divideBy(int numerator, int denominator) {
		try {
		if(denominator>0) {
			return (int) Math.floor(numerator/denominator);
		}
		else if(denominator == 0) {
			throw new ArithmeticException("Divide by zero not allowed");
		}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(divideBy(5,3));

		System.out.println(divideBy(4, 0));
	}

}
