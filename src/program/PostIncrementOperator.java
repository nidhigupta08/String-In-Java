package program;

public class PostIncrementOperator {
	public static void main(String[] args) {

		int i = 5;
//i++(i will increment by 1 but it will return the current value)
//++i (i value is 6 and increment by 1 and then returns the updated value. )
//i--(i=7,first i decerement by 1 but returns the current value of i before the decrement.) 
		System.out.println(i++ + ++i * i--);

		}
}
