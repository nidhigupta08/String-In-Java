package program;

public class Program2 {
	public static void main(String[] args) 
	  {
	   int sum = 0;
	   for (int i = 0, j = 10; i < 5 && j > 5; ++i, --j) {
	    sum += i + j;
	   }
	  System.out.println(sum);
	 }
}
