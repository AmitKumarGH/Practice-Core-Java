package OperatorsAassignment;

public class IncrementDecrementOperators {
    //Increment Operator
    //pre-increment ex : y=++x ;
    //post-increment ex: y=x++;

    //Decrement Operator
    //pre-decrement ex : y=--x ;
    //post-decrement ex : y=x-- ;

    public static void main(String[] args) {
        //Increment & decrement operators we can apply only for variables but not for
        //constant values.otherwise we will get compile time error .
        //Ex :
        int x1 = 4;
        int y1 = ++x1;
        System.out.println(y1);//output : 5

        //Ex 2 :
        //int x2 = 4;
        //int y2 = ++4;
        //System.out.println(y2);
        //C.E: unexpected type
        //required: variable
        //found : value

        //We can't perform nesting of increment or decrement operator, otherwise we will
        //get compile time error
        //int x= 4;
        //int y = ++(++x);
        //System.out.println(y);
        //C.E: unexpected type
        //required: variable
        //found : value

        //For the final variables we can't apply increment or decrement operators,
        //otherwise we will get compile time error
        //Ex:
        //final int x = 4;
        //x++; // x = x + 1
        //System.out.println(x);
        //C.E : can't assign a value to final variable 'x'.

        //We can apply increment or decrement operators even for primitive data types
        //except boolean .
        //Ex:
        int x3=10;
        x3++;
        System.out.println(x3); //output :11
        char ch='a';
         ch++;
         System.out.println(ch); //b
        double d=10.5;
         d++;
         System.out.println(d); //11.5
        boolean b=true;
         //b++;
         System.out.println(b);
         //CE : operator ++ can't be applied to boolean

        //Difference between b++ and b = b+1?
        //If we are applying any arithmetic operators b/w 2 operands 'a' & 'b' the result type is
        //max(int , typeof a , typeof b)
        //Ex 1:
        byte a1=10;
        byte b1=20;
        //byte c=a1+b1;
        byte c=(byte)(a1+b1); //valid
        //System.out.println(c);
        //CE : possible loss of precession
        //found : int
        //required : byte
        //Ex 2:
        //byte b4=20;
        //byte b=b+1;
        //byte c=(byte)(b4+1); //valid
        System.out.println(c);
        //
        //CE : possible loss of precession
        //found : int
        //required : byte
        //In the case of Increment & Decrement operators internal type casting will be performed
        //automatically by the compiler
        // b++; => b=(type of b)b+1;
        //
        // Ex:
         byte b5=10;
         b5++;
         System.out.println(b5); //output : 11
    }
}
