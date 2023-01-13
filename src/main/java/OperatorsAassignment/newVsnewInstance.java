package OperatorsAassignment;

public class newVsnewInstance {
    public static void main(String[] args) throws Exception {
        //-new is an operator to create an objects , if we know class name at the beginning
        //then we can create an object by using new operator .
        //-newInstance( ) is a method presenting class " Class " , which can be used to
        //create object.
        //-If we don't know the class name at the beginning and its available dynamically
        //Runtime then we should go for newInstance() method
        //public class Test {
        //public static void main(String[] args) throws Exception {
        Object o=Class.forName(args[0]).newInstance( ) ;
        System.out.println(o.getClass().getName( ) );
        //}
        //}
        //If dynamically provide class name is not available then we will get the
        //RuntimeException saying ClassNotFoundException
        //To use newInstance( ) method compulsory corresponding class should contains
        //no argument constructor , otherwise we will get the RuntimeException saying
        //InstantiationException.

        //Difference between new and newInstance( ) :
        //new is an operator , which can be
        //used to create an object
        //newInstance( ) is a method , present in class Class ,
        //which can be used to create an object .
        //We can use new operator if we
        //know the class name at the
        //beginning.
        //Test t= new Test( );
        //We can use the newInstance( ) method , If we don't
        //class name at the beginning and available
        //dynamically Runtime.
        //Object o=Class.forName(arg[0]).newInstance( );
        //If the corresponding .class file not
        //available at Runtime then we will
        //get RuntimeException saying
        //NoClassDefFoundError , It is
        //unchecked
        //To used new operator the
        //corresponding class not required
        //to contain no argument
        //constructor
        //If the corresponding .class file not available at
        //Runtime then we will get RuntimeException saying
        //ClassNotFoundException , It is checked
        //To used newInstance( ) method the corresponding
        //class should compulsory contain no argument
        //constructor , Otherwise we will get
        //RuntimeException saying InstantiationException.

        //Difference between ClassNotFoundException &
        //NoClassDefFoundError :
        //1. For hard coded class names at Runtime in the corresponding .class files not
        //available we will get NoClassDefFoundError , which is unchecked
        //Test t = new Test( );
        //In Runtime Test.class file is not available then we will get
        //NoClassDefFoundError
        //2. For Dynamically provided class names at Runtime , If the corresponding .class
        //files is not available then we will get the RuntimeException saying
        //ClassNotFoundException
        //Ex : Object o=Class.forname("Test").newInstance( );
        //At Runtime if Test.class file not available then we will get the
        //ClassNotFoundException , which is checked exception
    }
}
