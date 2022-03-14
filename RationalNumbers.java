/*
(Rational Numbers) Create a class called Rational for performing arithmetic with fractions.
Write a program to test your class. Use integer variables to represent the private instance variables
of the class—the numerator and the denominator. Provide a constructor that enables an object of
this class to be initialized when it’s declared. The constructor should store the fraction in reduced
form. The fraction
2/4
– 1
 Making a Difference 423
is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator. Provide a no-argument constructor with default values in case no initializers are provided. Provide public methods that perform each of the following operations:
a) Add two Rational numbers: The result of the addition should be stored in reduced
form. Implement this as a static method.
b) Subtract two Rational numbers: The result of the subtraction should be stored in reduced form. Implement this as a static method.
c) Multiply two Rational numbers: The result of the multiplication should be stored in
reduced form. Implement this as a static method.
d) Divide two Rational numbers: The result of the division should be stored in reduced
form. Implement this as a static method.
e) Return a String representation of a Rational number in the form a/b, where a is the
numerator and b is the denominator.
f) Return a String representation of a Rational number in floating-point format. (Consider providing formatting capabilities that enable the user of the class to specify the
number of digits of precision to the right of the decimal point.)
*/
public class Rational
{
   private int numerator; // numerator of the fraction
   private int denominator; // denominator of the fraction

   // no-argument constructor, inializes this Rational to 1
   public Rational()
   {
      numerator = 1;
      denominator = 1;
   } // end Rational no-argument constructor

   // initialize numerator part to n and denominator part to d
   public Rational( int theNumerator, int theDenominator )
   {
      numerator = theNumerator;
      denominator = theDenominator;
      reduce();
   } // end two-argument constructor

   // add two Rational numbers
   public Rational sum( Rational right )
   {
      int resultDenominator = denominator * right.denominator;
      int resultNumerator = numerator * right.denominator +
         right.numerator * denominator;

      return new Rational( resultNumerator, resultDenominator );
   } // end method sum

   // subtract two Rational numbers
   public Rational subtract( Rational right )
   {
      int resultDenominator = denominator * right.denominator;
      int resultNumerator = numerator * right.denominator -
         right.numerator * denominator;

      return new Rational( resultNumerator, resultDenominator );
   } // end method subtract

   // multiply two Rational numbers
   public Rational multiply( Rational right )
   {
      return new Rational( numerator * right.numerator,
         denominator * right.denominator );
   } // end method multiply

   // divide two Rational numbers
   public Rational divide( Rational right )
   {
      return new Rational( numerator * right.denominator,
         denominator * right.numerator );
   } // end method divide

   // reduce the fraction
   private void reduce()
   {
      int gcd = 0;
      int smaller;

      // find the greatest common denominator of the two numbers
      if ( numerator < denominator )
         smaller = numerator;
      else
         smaller = denominator;

      for ( int divisor = smaller; divisor >= 2; divisor-- )
      {
         if ( numerator % divisor == 0 && denominator % divisor == 0 )
         {
            gcd = divisor;
            break;
         } // end if
      } // end for

      // divide both the numerator and denominator by the gcd
      if ( gcd != 0 )
      {
         numerator /= gcd;
         denominator /= gcd;
      } // end if
   } // end for

   // return String representation of a Rational number
   public String toString()
   {
     return numerator + "/" + denominator;
   } // end method toRationalString

   // return floating-point String representation of
   // a Rational number
   public String toFloatString( int digits )
   {
      double value = ( double ) numerator / denominator;
      // builds a formatting string that specifies the precision
      // based on the digits parameter
      return String.format( "%." + digits + "f", value );
   } // end method toFloatString
} // end class Rational
