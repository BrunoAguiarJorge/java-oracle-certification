package oracle.training.TextDateTimeNumericObjects;

public class StringAndStringBuilder {
	public static void main(String[] args) {
		String teaTxt = "Tea";
		String b = "Tea";
		//check if the strings are the same
		boolean v = (teaTxt == b);
		System.out.println("Are the strings the same ? " + v); // true
		
		// c below is an object... the word NEW has allocated memory for it in the memory
		String c = new String("Tea");
		boolean v1 = (teaTxt == c);
		System.out.println("Are the strings the same ? "  + v1); //false
		
		// String Objects are immutable
		
		c.intern();
		boolean v2 = (teaTxt == c);
		System.out.println("Are the strings the same ? "  +v2);
		
		//.intern return string from pool and will be same as "teaTxt" and "b"
		String d = c.intern();
		boolean v3 = (teaTxt == d);
		System.out.println("Are the strings the same ? "  +v3);
		
		c = teaTxt+' '+b;
		System.out.println(c);
		
		//find inexOf()
		System.out.println("IndexOf  = " + c.indexOf('T', 1));
		
		//find the last character in the string...minus one because string starts at 0 so -1 gets the last char
		System.out.println("Last char = " + c.charAt(c.length()-1));
		
		// String object c to UPPERCASE. objects are immutable so assign it to a new variable
		c = c.toUpperCase();
		System.out.println("String object c to UPPERCASE = " + c);
		
		//Extract SUBSTRING 
		System.out.println(c.substring(c.lastIndexOf('T'), c.lastIndexOf('T')+2));
		System.out.println(c.substring(4 ,6));
		
		// Contains
		System.out.println(c.contains("A"));
		
		// new object StringBuilder
		StringBuilder txt = new StringBuilder(c);
		System.out.println(txt.length()); // length represents an amount of characters stored in the stringbuilder
		System.out.println(txt.capacity());// capacity is the size of internal storage
		
		
		//replace text 
		System.out.println(txt.replace(0, 3, "I drink"));
		
		System.out.println(txt.length()); // length represents an amount of characters stored in the stringbuilder
		System.out.println(txt.capacity());// capacity is the size of internal storage
		
	}
}
