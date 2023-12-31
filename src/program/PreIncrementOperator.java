package program;

public class PreIncrementOperator {
	public static void main(String[] args) {

		int x = 10;
// 10+{10-(10*2)}+(++10)
//10+{10-20} +(11)
//10+1 =11
		x += x-(x * 2) + (++x);

		System.out.println(x);

		}
}
