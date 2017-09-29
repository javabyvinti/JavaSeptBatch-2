class Datatype{

	public static void main(String args[])
	{
		//primitive type
		//int a = 100;
		//int b = 200;
		
		//reference type
		Integer a = new Integer(100);
		Integer b = new Integer(100);
		//Integer c = a;

		String value1 = new String("Hello");
		String value2 = new String("hello");

		System.out.println(value1.equalsIgnoreCase(value2));

		//System.out.println(value1.equals(value2));		

		//System.out.println(a==b);
		//comparision operator
		// primitive--> value compare
		// reference--> address compare
	
		//byte b = (byte)140;
		//System.out.println(b);
	}
	
}
