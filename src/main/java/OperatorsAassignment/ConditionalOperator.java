package OperatorsAassignment;

public class ConditionalOperator {
    public static void main(String[] args) {
        //Conditional Operator (? :)
        //The only possible ternary operator in java is conditional operator
        //Ex 1 :
        int x1=(10>20)?30:40;
        System.out.println(x1); //40
        //Ex 2 :
        int x2=(10>20)?30:((40>50)?60:70);
        System.out.println(x2); //70
    }
}
