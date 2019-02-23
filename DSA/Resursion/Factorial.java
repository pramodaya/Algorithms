
public class Factorial {
	public int factorial(int accumulator, int num) {
		if (num == 1)
			return accumulator;
		return factorial(accumulator * num, num - 1);
	}

	public int calculateFact(int num) {
		return factorial(1, num);
	}
}
