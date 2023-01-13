package OperatorsAassignment;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Bitwise Operators : ( & , | , ^)
        //1. & (AND) : If both arguments are true then only result is true.
        //2. | (OR) : if at least one argument is true. Then the result is true.
        //3. ^ (X-OR) : if both are different arguments. Then the result is true.
        //Example:
        System.out.println(true&false);//false
        System.out.println(true|false);//true
        System.out.println(true^false);//true
        //We can apply bitwise operators even for integral types also.
        //Example:
        System.out.println(4&5);//4 using binary digits
        System.out.println(4|5);//5 4-->100
        System.out.println(4^5);//1 5-->101
        //4 100     100     100
        //5 101     101     101
        //& 100   | 101   ^ 001

        //Bitwise complement (~) (tilde symbol) operator:
        //We can apply this operator only for integral types but not for boolean types.
        //Example :
        //System.out.println(~true); // CE :opetator ~ can not be applied to boolean
        //System.out.println(~4); //-5
        //description about above program :
        //4--> 0 000.......0100 0-----+ve
        //~4--> 1 111.......1011 1--- -ve

        //2's compliment of ~4 --> 000....0100 add 1
        //result is : 000...0101 =5
        //Note : The most significant bit access as sign bit 0 means +ve number , 1 means -ve number.
        //+ve number will be represented directly in memory where as -ve number will be
        //represented in 2's complement form.

        //Boolean complement (!) operator
        //This operator is applicable only for boolean types but not for integral types.
        //Example :
        System.out.println(!true);//false
        System.out.println(!false);//true
        //System.out.println(!4);//CE : operator ! can not be applied to int
        //Summary:
        //&
        //| Applicable for both boolean and integral types.
        //^
        //~ --------Applicable for integral types only but not for boolean types.
        //! --------Applicable for boolean types only but not for integral types.
    }
}
