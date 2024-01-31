package program;

public class Program3 {
	public static void main(String args[]){

	int[] numbers = {1, 2, 3, 4, 5};
	int sum = 0;
	for (int num: numbers)
	  {
	    sum += num;
	    if (num % 2 == 0)
	    	{
	    	continue;
	    	}
	}
	System.out.println(sum);

	}
}
