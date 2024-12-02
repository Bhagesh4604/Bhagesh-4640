package divisionByZero;

public class DivisionByZero {
public static void main (String[] args) {
int numerator=10;
int denominator=0;
try
{
	if(denominator==0)
	{
		throw new DivisionByZeroException("division by zero is not allowed!");
	}
	int result=numerator/denominator;
			System.out.println("Result:" +result);
}
catch (DivisionByZeroException e)
{
	System .err.println("Error:" +e.getMessage());
}
finally
{
	System.out.println("This block always executes regardless of exception");
}
}
}
class DivisionByZeroException extends Exception
{
	public DivisionByZeroException(String message)
	{
		super(message);
	}
}

