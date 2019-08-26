
/*conditional operators  - <,>, ==, != (means not equal to)
 *
 Logical operators  || or, && and, 
 
 
 if(condition boolean)
 }
 condition executes when true
 {
 else
 {
 
 }
 
 And (&&) - All c have to be true
 True && True - True
 True && False - False
 
 or (||) - at least one condition to be true.
 True || True - True
 True || False - True
 
 False || False - False
 * */

package basics;

import java.util.Scanner;

public class ifcondition {

	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		float val1 = scan.nextFloat();
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter second number");
		float val2 = scan.nextFloat();
		
		
		if (val1 > val2)
		{
			
			System.out.println("The first number is bigger");
		}
		else
		{
			System.out.println("The second number is bigger");
		}
				{
			System.out.println("The second number is bigger");
		}
		scan.close();
}
}
