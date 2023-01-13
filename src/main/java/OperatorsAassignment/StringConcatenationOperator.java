package OperatorsAassignment;

public class StringConcatenationOperator {
    public static void main(String[] args) {
        //String Concatenation operator :
        //1. The only overloaded operator in java is ' + ' operator some times it access
        //arithmetic addition operator & some times it access String concatenation
        //operator.
        //2. If acts as one argument is String type , then '+' operator acts as concatenation
        //and If both arguments are number type , then operator acts as arithmetic
        //operator
        //Ex :
        String a="amit";
        int b=10 , c=20 , d=30 ;
        System.out.println(a+b+c+d); //output : amit102030
        System.out.println(b+c+d+a); //output : 60amit
        System.out.println(b+c+a+d); //output : 30amit30
        System.out.println(b+a+c+d); //output : 10amit 2030
    }
}
