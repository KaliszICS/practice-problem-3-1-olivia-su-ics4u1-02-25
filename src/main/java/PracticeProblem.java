public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int x) {

		if (x < 0) {
			x = -x;
		}
		if (x < 10) {
			return x;
		}
		return (x % 10) + sumOfDigits(x / 10);
		// x % 10, finds last digit by finding the remainder ex. 234 % 10 = 4; x / 10 finds the remaining digits ex. 234 / 10 = 23.4 ignore 4
	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		return n * factorial(n -1);
		// reduces n each time
	}
  	
}

