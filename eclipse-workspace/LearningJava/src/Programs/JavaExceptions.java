package Programs;

public class JavaExceptions {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Start");
		try
		{
			int divide =10/0;
			 System.out.println(divide);
			 
		}
		catch (Exception e)
		{
			System.out.println("Error occured");
			System.out.println(e.getMessage());
		}
		System.out.println("End");
		throw new Exception ("Error occued");
	}

}
