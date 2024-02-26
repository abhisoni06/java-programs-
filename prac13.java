class Practical13
{
	public static void main(String args[])
	{
		String s1="Hi my name is Abhi and yours    ";
		System.out.println("String 1 : "+s1);
		System.out.println("Length of String 1 : "+s1.length());
		System.out.println("character in string 1 at index 4 is  = "+s1.charAt(4));
		System.out.println("Substring of string 1 from 0 index to 4 index is = "+s1.substring(0,4));
		System.out.println("Index of first occurrence of character A in string 1 is: "+s1.indexOf("A"));
		System.out.println("String 1 to upper case is : "+s1.toUpperCase());
		System.out.println("String 1 to lower case is : "+s1.toLowerCase());
		System.out.println("String 1 after removing whitespace is : "+s1.trim());
		String s2 = "Gpa computer";
		String[] splits1 = s1.split(",");
        System.out.println("String split into substrings:");
        for (String s : splits1) {
            System.out.println(s);
        }
		System.out.println("String 2 : "+s2);
		System.out.println("Both string are equal : "+s1.equals(s2));
		System.out.println("compare two string lexicographically : "+s2.compareTo(s1));
	}
}
