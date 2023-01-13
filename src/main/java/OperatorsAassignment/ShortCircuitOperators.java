package OperatorsAassignment;

public class ShortCircuitOperators {
    public static void main(String[] args) {
        //Short circuit (&&, ||) operators
        //These operators are exactly same as normal bitwise operators &(AND), |(OR) except
        //the following differences.
        //& , | && , ||
        //Both arguments should be evaluated
        //always. Second argument evaluation is optional.
        //Relatively performance is low. Relatively performance is high.
        //Applicable for both integral and boolean types.
        //Applicable only for boolean types but not for integral types.
        //x&&y : y will be evaluated if and only if x is true.(If x is false then y won't be evaluated
        //i.e., If x is ture then only y will be evaluated)
        //x||y : y will be evaluated if and only if x is false.(If x is true then y won't be evaluated i.e.,
        //If x is false then only y will be evaluated)
        //Example :
         int x=10 , y=15 ;
         if(++x < 10 || ++y > 15) { //instead of || using &,&&, |
        //operators
         x++;
         }
         else {
         y++;
         }
         System.out.println(x+"----"+y);
         //Output:
         //operator x   y
         //&        11 17
         //|        12 16
         //&&       11 16
         //||       12 16

        //Example :
         int x1=10 ;
         if(++x1 < 10 && ((x1/0)>10) ) {
         System.out.println("Hello");
         }
         else {
         System.out.println("Hi");
         }// output : Hi
    }
}
