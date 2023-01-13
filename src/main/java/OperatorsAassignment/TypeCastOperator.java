package OperatorsAassignment;

public class TypeCastOperator {
    public static void main(String[] args) {
        //Type Cast Operator :
        //There are 2 types of type-casting
        //1. implicit
        //2. explicit
        //implicit type casting :
        int x='a';
        System.out.println(x); //97
        //1. The compiler is responsible to perform this type casting.
        //2. When ever we are assigning lower datatype value to higher datatype variable
        //then implicit type cast will be performed .
        //3. It is also known as Widening or Upcasting.
        //4. There is no lose of information in this type casting.
        //5. The following are various possible implicit type casting.
            //byte->short->int->long->float->double
            //char->int->long->float->double
        //Example 1:
        int x1='a';
        System.out.println(x1);//97
        //Note: Compiler converts char to int type automatically by implicit type casting.

        //Example 2:
        double d=10;
        System.out.println(d);//10.0
        //Note: Compiler converts int to double type automatically by implicit type casting.

        //Explicit type casting:
        //Programmer is responsible for this type casting.
        //Whenever we are assigning bigger data type value to the smaller data type
        //variable then explicit type casting is required.
        //Also known as Narrowing or down casting.
        //There may be a chance of lose of information in this type casting.
        //The following are various possible conversions where explicit type casting is
        //required.
            //byte(8)->short(16)->int(32)->long(64)->float(32)->double
            //char(16)->int(32)->long(64)->float(32)->double

        //Example :
        int x3=130;
        byte b=(byte)x3;
        System.out.println(b); //-126

        //Example 2 :
        //int x=130;
        //byte b=x;
        //System.out.println(b); //CE : possible loss of precision

        //When ever we are assigning higher datatype value to lower datatype value
        //variable by explicit type-casting ,the most significant bits will be lost i.e., we have
        //considered the least significant bits.
        //Example 3 :
        //int x=150;
        //22. short s=(short)x;
        //byte b=(byte)x;
        //System.out.println(s); //150
        //System.out.println(b); //-106
        //When ever we are assigning floating point value to the integral types by explicit
        //type casting , the digits of after decimal point will be lost .
        //Example 4:
        double dd=130.456 ;
        int xx=(int)dd ;
        System.out.println(xx); //130
        byte bb=(byte)dd ;
        System.out.println(bb); //-206
    }
}
