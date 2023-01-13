package OperatorsAassignment;

public class AssignmentOperator {
    public static void main(String[] args) {
        //Assignment Operator :
        //There are 3 types of assignment operators
        //1. Simple assignment:
        //Example: int x=10;
        //2. Chained assignment:
        //Example:
        int a,b,c,d;
        a=b=c=d=20;
        System.out.println(a+"---"+b+"---"+c+"---"+d);//20---20---20---20
        //int b , c , d ;
        //int a=b=c=d=20 ; //valid

        //We can't perform chained assignment directly at the time of declaration.
        //Example 2:
        //int a=b=c=d=30;
        //CE : can not find symbol
        //symbol : variable b
        //location : class Test

        //Compound assignment:
        //Sometimes we can mixed assignment operator with some other operator
        //to form compound assignment operator.
        //Ex:
        //int a=10 ;
        //a +=20 ;
        //System.out.println(a); //30
        //The following is the list of all possible compound assignment operators in java.
        //+=, -=, *=, /=, %=, &=, |=, ^=, >>=, >>>=, <<=

        //In the case of compound assignment operator internal type casting will be
        //performed automatically by the compiler (similar to increment and
        //decrement operators.)

        //byte b=10;
        //b=b+1;
        //System.out.println(b);
        //CE : possible loss of precission
        //found : int
        //required : byte
        byte b2=10;
        b2++;
        System.out.println(b2); //11
        byte b3=10;
        b3+=1;
        System.out.println(b3); //11
        byte b4=127;
        b4+=3;
        System.out.println(b4); //-126
        //Ex :
        int ab , bb , cb , db ;
        ab=bb=cb=db=20 ;
        ab += bb-= cb *= db /= 2 ;
        System.out.println(ab+"---"+bb+"---"+cb+"---"+db);// -160...-180---200---10
    }
}
