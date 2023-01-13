package OperatorsAassignment;

public class instanceofandisInstance {
    public static void main(String[] args) {
        //instanceof isInstance( )
        //instanceof an operator which can be used to check whether the given object is perticular type or not
        //We know at the type at beginning it is available

        //isInstance( ) is a method , present in class Class , we
        //can use isInstance( ) method to checked whether the given object is perticular type or not
        //We don't know at the type at beginning it is available Dynamically at Runtime.
        String s = new String("amit");
        System.out.println(s instanceof Object );//true

        //If we know the type at the beginning only.
        //class Test {
        //public static void main(String[] args) {
        //Test t = new Test( ) ;
        //instanceofandisInstance t = new instanceofandisInstance();
        //System.out.println(Class.forName(args[0]).isInstance( ));//arg[0] --- We don't know the type
        // at beginning
        //}
        //}
        //java Test Test //true
        //java Test String //false
        //java Test Object //true
        int x= 10 ;
        x=x++;
        System.out.println(x);//10
        //1. consider old value of x for assignment x=10
        //2. Increment x value x=11
        //3. Perform assignment with old considered x value x=10
    }
}
