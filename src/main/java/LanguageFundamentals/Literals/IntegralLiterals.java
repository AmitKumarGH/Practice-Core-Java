package LanguageFundamentals.Literals;
//Integral Literals:
//For the integral data types (byte, short, int and long) we can specify literal value in the
//following ways.
//1) Decimal literals: Allowed digits are 0 to 9.
//Example: int x=10;
//2) Octal literals: Allowed digits are 0 to 7. Literal value should be prefixed with zero.
//Example: int x=010;
//3) Hexa Decimal literals:
//The allowed digits are 0 to 9, A to Z.
//For the extra digits we can use both upper case and lower case characters.
//This is one of very few areas where java is not case sensitive.
//Literal value should be prefixed with ox(or)oX.
public class IntegralLiterals {
    public static void main(String[] args) {

    //Example:
    int x1=0x10;
//    These are the only possible ways to specify integral literal.
//    Which of the following are valid declarations?
//    1. int x=0777; //(valid)
//    2. int x=0786; //C.E:integer number too large: 0786(invalid)
//    3. int x=0xFACE; (valid)
//    4. int x=0xbeef; (valid)
//    5. int x=0xBeer; //C.E:';' expected(invalid) //:int x=0xBeer; ^// ^
//    6. int x=0xabb2cd;(valid)
    //Example:
    int x=10;
    int y=010;
    int z=0x10;

    System.out.println(x+"----"+y+"----"+z); //10----8----16
    //'By default' every integral literal is int type 'but' we can specify explicitly as long type by
    //suffixing with small "l" (or) capital "L".
    //Example:
    int x2=10;//(valid)
    long l1=10L;//(valid)
    long l2=10;//(valid)
    //int x3=10l;//C.E:possible loss of precision(invalid)
    // found : long
    // required : int
    //There is no direct way to specify byte and short literals explicitly. But whenever we are
    //assigning integral literal to the byte variables and its value within the range of byte
    //compiler automatically treats as byte literal. Similarly short literal also.
    //Example:
    byte b1=127;//(valid)
    //byte b2=130;//C.E:possible loss of precision(invalid)
    short s1=32767;//(valid)
    //short s2=32768;//C.E:possible loss of precision(invalid)

    }
}
