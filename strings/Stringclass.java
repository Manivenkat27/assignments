package strings;

public class Stringclass {
	public static void main(String[]args) {
		String str ="Hello World ";
		System.out.println(str);
		
		String str1= "Hello";
		String str2="How are you";
		System.out.println(str1+str2);
		
		String str3=("Java string pool refers to collection of Strings which are stored in heap memory");
		System.out.println(str3);
		
		System.out.println(str3.toUpperCase());
		
		System.out.println(str3.toLowerCase());
	
		System.out.println(str3.replace('a','$'));
		
		if (str3.contains("collection")) {
			System.out.println("collection is in the string");
		}
		
		System.out.println(str3.equals("java string pool refers to collection of strings which are stored in heap memory"));
		
		System.out.println(str3.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
		
		
	}
	

}
