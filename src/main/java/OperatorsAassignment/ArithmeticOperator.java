package OperatorsAassignment;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //Arithmetic Operator :
        //If we apply any Arithmetic operation b/w 2 variables a & b ,
        //the result type is always max(int , type of a , type of b)
        //Example :
        //byte + byte=int
        //byte+short=int
        //short+short=int
        //short+long=long
        //double+float=double
        //int+double=double
        //char+char=int
        //char+int=int
        //char+double=double
        //System.out.println('a' + 'b'); // output : 195
        //System.out.println('a' + 1); // output : 98
        //System.out.println('a' + 1.2); // output : 98.2

        //In integral arithmetic (byte , int , short , long) there is no way to represents
        //infinity , if infinity is the result we will get the ArithmeticException / by zero
        //System.out.println(10/0); // output RE : ArithmeticException / by zero
        //But in floating point arithmetic(float , double) there is a way represents infinity.
        //System.out.println(10/0.0); // output : infinity
        //For the Float & Double classes contains the following constants :
        //1. POSITIVE_INFINITY
        //2. NEGATIVE_INFINITY
        //Hence , if infinity is the result we won't get any ArithmeticException in floating
        //point arithmetics
        //Ex :
        System.out.println(10/0.0); // output : infinity
        System.out.println(-10/0.0); // output : - infinity

        //NaN(Not a Number) in integral arithmetic (byte , short , int , long) there is no
        //way to represent undefine the results. Hence the result is undefined we will get
        //ArithmericException in integral arithmetic
        //System.out.println(0/0); // output RE : ArithmeticException / by zero
        //But floating point arithmetic (float , double) there is a way to represents
        //undefined the results .
        //For the Float , Double classes contains a constant NaN , Hence the result is
        //undefined we won't get ArithmeticException in floating point arithmetics .
        System.out.println(0.0/0.0); // output : NaN
        System.out.println(-0.0/0.0); // output : NaN
        //For any 'x' value including NaN , the following expressions returns false
        //Ex : x=10;
        //System.out.println(10 < Float.NaN ); // false
        //System.out.println(10 <= Float.NaN ); // false
        //System.out.println(10 > Float.NaN ); // false
        //System.out.println(10 >= Float.NaN ); // false
        //System.out.println(10 == Float.NaN ); // false
        //System.out.println(Float.NaN == Float.NaN ); // false
        //System.out.println(10 != Float.NaN ); //true
        //System.out.println(Float.NaN != Float.NaN ); //true
        //ArithmeticException :
        //1. It is a RuntimeException but not compile time error
        //2. It occurs only in integral arithmetic but not in floating point arithmetic.
        //3. The only operations which cause ArithmeticException are : ' / ' and ' % '
    }
}
