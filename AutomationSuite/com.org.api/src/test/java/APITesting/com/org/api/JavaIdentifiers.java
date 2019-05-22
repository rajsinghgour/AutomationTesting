package APITesting.com.org.api;


/*Allowed valid Identifiers ::
 * a to z
 * A to Z
 * 0 to 9
 * $
 * _
 * these are the valid identifiers availble in java
 */
public class JavaIdentifiers 
{
	static int String = 20;
	static int Runnable = 10;

	/**
	 * pass integer parameter
	 * @param ANZ
	 */
	public void test_019(int ANZ)
	{
		System.out.println(ANZ);
		System.out.println("End of this Program which is for How to use Java Identifiers.."+"\n"+"::End of Program::");
	}
	
	/**
	 * This method is to see the usage of Java Identifiers
	 */
	public static void $test09()
	{
		System.out.println("Testing Java Identifiers");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("This Program is to test Java Identifiers::");
		System.out.println("First instance variable::"+Runnable+ "\n" +"> Second instance variable ::"+String);
		JavaIdentifiers.$test09();
		JavaIdentifiers jIdent = new JavaIdentifiers();
		jIdent.test_019(100);
	}
}
