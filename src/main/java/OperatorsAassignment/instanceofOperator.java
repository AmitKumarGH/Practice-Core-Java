package OperatorsAassignment;

public class instanceofOperator {
    public static void main(String[] args) {
        //instanceof operator :
        //We can use the instanceof operator to check whether the given an object is particular type or not
        //r(object reference) instanceof x(class/interface)

        //Object o=l.get(0); // l is an array name
        //if(o instanceof Student) {
        //Student s=(Student)o ;
        //perform student specific operation
        //}
        //elseif(o instanceof Customer) {
        //Customer c=(Customer)o;
        //perform Customer specific operations
        //}

        //O instanceof X here O is object reference , X is ClassName/Interface name
        //Thread t = new Thread( );
        //System.out.println(t instanceof Thread); //true
        //System.out.println(t instanceof Object); //true
        //System.out.println(t instanceof Runnable); //true
        //Ex :
        //public class Thread extends Object implements Runnable {
        //}

        //To use instance of operator compulsory there should be some relation between
        //argument types (either child to parent Or parent to child Or same type)
        //Otherwise we will get compile time error saying inconvertible types
        //Thread t=new Thread( );
        //System.out.println(t instanceof String);
        //CE : inconvertable errors
        //found : java.lang.Thread
        //required : java.lang.String

        //Whenever we are checking the parent object is child type or not by using
        //instanceof operator that we get false.
        //Object o=new Object( );
        //System.out.println(o instanceof String );//false
        //Object o=new String("ashok");
        //System.out.println(o instanceof String); //true

        //For any class or interface X null instanceof X is always returns false
        //System.out.println(null instanceof X); //false
    }
}
