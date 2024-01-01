package program;

public class Concatenation {
public static void main(String[] args) {
	//1) way to concat using + operator
	
	  String s1="Nidhi "; String s2="Gupta"; System.out.println(s1+" "+s2);
	  
	  String s="Sachin "+" Tendulkar"; System.out.println(s);//Sachin Tendulkar
	  
	  String s3="Sachin got "+(95+1)+" in science"; System.out.println(s3);
	
	
	   
//2) way using concat() method	  
	   System.out.println(s1.concat(s2));
	   
 //There are some other possible ways to concatenate Strings in Java.
	StringBuilder sb1=new StringBuilder("Nidhi ");
	StringBuilder sb2=new StringBuilder("1");
	StringBuilder result= sb1.append(sb2);
	System.out.println(result);
	 
	//2. String concatenation using format() method
//String.format() method allows to concatenate multiple strings using format 
//specifier like %s followed by the string values or objects.
	String str="Gupta ";
	String str1="NIDHI";
	String resultFormat=String.format("%s%s", str,str1);
	System.out.println(resultFormat.toString());
	
//	3) String.join() method accepts arguments first a separator and an array of 
//	String objects.	
	
	String resultJoin=String.join("", str,str1);
		System.out.println(resultJoin.toString());
		
}
}
