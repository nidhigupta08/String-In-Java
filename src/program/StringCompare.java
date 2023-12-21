package program;

public class StringCompare {
public static void main(String [] args) {
	
	String s1="Nidhi";
	String s2="Nidhi";
	String s3=new String("Nidhi");
	String s4=new String("nidhi");
	String s5="shawn";
	
//	1) By Using equals() Method
	
	
	  System.out.println(s1.equals(s2));//true
	  System.out.println(s1.equals(s3));//true
	  System.out.println(s1.equals(s4));//false
	  System.out.println(s1.equals(s5));//false
	  System.out.println(s1.equalsIgnoreCase(s4));//true
	 	
//	2) By Using == operator
	System.out.println(s1==(s2));// true (because both refer to same instance)  
System.out.println(s1==(s3));//false because s3 refers to instance created in nonpool  
	
//   3) By Using compareTo() method
//returns an integer value that describes if first string is less than, equal to or 
//greater than second string.

System.out.println(s1.compareTo(s2));//s1 == s2 : The method returns 0.
System.out.println(s1.compareTo(s3));//s1 == s3 : The method returns 0.
System.out.println(s1.compareTo(s5));//< s1<s5 : The method returns a negative value.
System.out.println(s5.compareTo(s1));//s5 > s1 : The method returns a positive value.
}
}
