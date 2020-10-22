package com.company;
public class Assignment3
{
	public static void main( String[] args )
	{
		
		
		System.out.println( "I will now count my chickens:" );

		// Concatenation with the expression which works according to operator precdence 
		//i.e first divide 30 by 6 adds the integer result with 25 and concatenate with sentence.
		//because brackets have highest precedence.
		System.out.println( "Hens " + ( 25 + 30 / 6 ) );
		
		//3. System.out.println( "Hens " + ( 25 + 30 / 6.0 ) );
		
		//4. Why the % character is called "modulus" instead of "percent"? Because it calculates the remainder.
		//5. It take two nums eg. a%b => and outputs the remainder when a is divided by b.
		//7. Because when dividing two integers the result  
		
		// 25*3=75 => 75%4=3 => 100-3=97 => concatenation 
		System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );

		
		
		System.out.println( "Now I will count the eggs:" );

		
		//operator preference 
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

		
		
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		//addition and subtraction are performed before comparison
		System.out.println( 3 + 2 < 5 - 7 );

		
		//brackets have highest precedence
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		
		
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

		
		
		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		//concatenate the value of expression within brackets with sentence.
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}
