package Programs;

public class Department implements Employee
{
	public void main (String args[])
	{
		Employee e = new Department();
		e.hrPolicy();
		e.salary();
		
		
	}

	@Override
	public void salary() {
		System.out.println("Salary garnted for this month");
		
	}

	@Override
	public void hrPolicy() {
		System.out.println("HR policies are here");
		
	}

	

	
	
	

}
