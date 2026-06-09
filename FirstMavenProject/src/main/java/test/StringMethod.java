package test;

public class StringMethod {
	

	public static void main(String[] args) {
		String s1 = "tom";
		String s2 = "jerry";
		String s3 = "tom";
		String s4 = "Tom";
		String s5 = "TOM";
		
		
		System.out.println("Equals "+ s1.equals(s3));
		System.out.println("Equals " +s1.equals(s2));
		
		System.out.println("equalsIgnoreCase " + s1.equalsIgnoreCase(s4));
		
		System.out.println("To Upper " + s1.toUpperCase());
		
		System.out.println("To Lower " + s5.toLowerCase());
		
		System.out.println("Starts with " + s1.startsWith("t"));
		
		System.out.println("Ends with "+ s1.endsWith("m"));
		
		System.out.println("Length " + s2.length());
		
		System.out.println("Char at "+ s1.charAt(1));
		
		String s6 = "10";
		System.out.println("Value of "+ String.valueOf(s6));
		

	}

}
