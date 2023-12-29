package program;

public class PreIncrementOperator {
	public static void main(String[] args) {

		int x = 10;

		x += x-(x * 2) + (++x);

		System.out.println(x);

		}
}
