package stringbasic;

//In Java,string is an object that represents a sequence of characters. 
public class StringIndex {
public static void main(String[] args) {
	// An array of characters works same as Java string. 
	char[] ch= {'a','b','c'};
	String s=new String(ch); 
	System.out.println(s);
	
//	1) String Literal is created by using double quotes. 
	//JVM will not find any string object with the value "welcome" in string 
	//contant pool, so it will create new object.
	String s1="Welcome";  
//JVM will check, then it will find value "welcome" in pool, so it will not create 
//	new object but it will return reference to the same instance(object). 
	String s2="Welcome";//It doesn't create a new instance 
	
	System.out.println(s1);
	System.out.println(s2);
	
	//2) By new keyword
	String s3=new String("Welcome");
//JVM will create a new string object in normal (non-pool) heap memory,and 
//the literal "Welcome" will be placed in the string constant pool. 
//The variable s3 will refer to the object in a heap (non-pool).	

}
}
