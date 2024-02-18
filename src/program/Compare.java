package program;

public class Compare {
	public static void main(String [] args) {
		
		String s1="Nidhi";
		String s2="Nidhi";
		String s3=new String("Nidhi");
		String s4=new String("nidhi");
		String s5="shawn";
		
//		1) By Using equals() Method
		
		
		  System.out.println(s1.equals(s2));//true
		  System.out.println(s1.equals(s3));//true
		  System.out.println(s1.equals(s4));//false
		  System.out.println(s1.equals(s5));//false
		  System.out.println(s1.equalsIgnoreCase(s4));//true
}}
