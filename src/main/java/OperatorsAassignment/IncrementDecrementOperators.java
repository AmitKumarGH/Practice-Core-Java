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
        //constant values.other wise we will get compile time error .
        //Ex :
        int x1 = 4;
        int y1 = ++x1;
        System.out.println(y1);//output : 5

        //Ex 2 :
        int x2 = 4;
        //int y2 = ++4;
        //System.out.println(y2);
        //C.E: unexpected type
        //required: variable
        //found : value

        //We can't perform nesting of increment or decrement operator, other wise we will
        //get compile time error
        //int x= 4;
        //int y = ++(++x);
        //System.out.println(y);
        //C.E: unexpected type
        //required: varialbe
        //found : value

        //For the final variables we can't apply increment or decrement operators ,other
        //wise we will get compile time error
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
    }
}
