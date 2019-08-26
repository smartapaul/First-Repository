package basics;
/*
 Character - single alphanumeric element e.g 'A' '&'
 String - alphanumeric / word or words
 byte/short/long
 Integer or Int -  whole numbers except 0
 Float - a number with a small decimal place
 Double - is a number with a large decimal place 
 Boolean = True or False
 * */

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//grade
Character grade = 'A';
System.out.println(grade);

String name= "Paul";

float maths = (float)75.32;
float eng = 78.3F;
System.out.print(eng);

double swa = 23;
System.out.println(swa);

/*typecasting google more
we define variables to a locate memory
double uses more RAM than float- memroy usage determines the effeciency of your program */

//float maths = (float)75.3
//float eng = 78.3F;
//System.out.println(eng);

eng = 99f;
System.out.println(eng);
	}

}
	

