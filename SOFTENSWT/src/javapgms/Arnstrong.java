package javapgms;

public class Arnstrong {
	public void arm() {
		try {
			int number = 371, originalNumber, remainder, result = 0;

	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		}
			
		
			
		

		public static void main(String[] args) {
			Arnstrong obj=new Arnstrong ();
			obj.arm();
		}


}
