package OperatorsAassignment;

public class RelationalOperators {
    public static void main(String[] args) {
        //Relational Operators(< , <= , > , >= )
        //We can apply relational operators for every primitive type except boolean.

        System.out.println(10 < 10.5); //true
        System.out.println('a' > 100.5); //false
        System.out.println('b' > 'a'); //true
        //System.out.println(true > false);
        //CE : operator > can't be applied to boolean , boolean

        //We can't apply relational operators for object types
        //System.out.println("ashok123" > "ashok");
        // CE: operator > can't be applied to java.lang.String , java.lang.String

        //Nesting of relational operator is not allowed
        //System.out.println(10 > 20 > 30); // System.out.println(true > 30);
        //CE : operator > can't be applied to boolean , int

    }
}
