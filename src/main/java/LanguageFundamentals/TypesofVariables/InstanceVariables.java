package LanguageFundamentals.TypesofVariables;

public class InstanceVariables {
    int i = 10;
    boolean b;
    public static void main(String[] args) {
        //Instance variables:
        //-If the value of a variable is varied from object to object such type of variables are
        //called instance variables.
        //-For every object a separate copy of instance variables will be created.
        //Instance variables will be created at the time of object creation and destroyed at
        //the time of object destruction hence the scope of instance variables is exactly
        //same as scope of objects.
        //-Instance variables will be stored on the heap as the part of object
        //-Instance variables should be declared with in the class directly but outside of any
        //method or block or constructor.
        //-Instance variables can be accessed directly from Instance area. But cannot be
        //accessed directly from static area.
        //-But by using object reference we can access instance variables from static area.
        //Example:
        //System.out.println(i);//C.E:non-static variable i cannot be referenced from a static context(invalid)
        InstanceVariables t=new InstanceVariables();
        System.out.println(t.i);//10(valid)
        t.methodOne();

        //For the instance variables it is not required to perform initialization JVM will always
        //provide default values.
        //Example:
        //class Test
        //{
        //boolean b;
        //public static void main(String[] args)
        //{
        //Test t=new Test();
        System.out.println(t.b);//false
        //}
        //}
        //Instance variables also known as object level variables or attributes
    }
    public void methodOne()
    {
        System.out.println(i);//10(valid)
    }
}
