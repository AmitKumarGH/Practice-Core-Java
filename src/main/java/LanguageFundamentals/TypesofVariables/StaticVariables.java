package LanguageFundamentals.TypesofVariables;

public class StaticVariables {
    static int i=10;
    static String s;
    int x=10;
    static int y=20;
    public static void main(String[] args) {
        //Static variables:
        //- If the value of a variable is not varied from object to object such type of variables
        //is not recommended to declare as instance variables. We have to declare such
        //type of variables at class level by using static modifier.
        //- In the case of instance variables for every object a separate copy will be created
        //but in the case of static variables for entire class only one copy will be created
        //and shared by every object of that class.
        //- Static variables will be crated at the time of class loading and destroyed at the
        //time of class unloading hence the scope of the static variable is exactly same as
        //the scope of the .class file.
        //- Static variables will be stored in method area. Static variables should be declared
        //with in the class directly but outside of any method or block or constructor.

        //java TEST
        //1. Start JVM.
        //2. Create and start Main Thread by JVM.
        //3. Locate(find) Test.class by main Thread.
        //4. Load Test.class by main Thread. // static variable creation
        //5. Execution of main() method.
        //6. Unload Test.class // static variable destruction
        //7. Terminate main Thread.
        //8. Shutdown JVM.

        //Example:
        StaticVariables t=new StaticVariables();
        System.out.println(t.i);//10
        System.out.println(StaticVariables.i);//10
        System.out.println(i);//10

        //For the static variables it is not required to perform initialization explicitly, JVM will
        //always provide default values.
        //Example:
        System.out.println(s);//null

        //Example:
        StaticVariables t1=new StaticVariables();
        t1.x=888;
        t1.y=999;
        System.out.println(t1.x+"----"+t1.y);

        StaticVariables t2=new StaticVariables();
        System.out.println(t2.x+"----"+t2.y);//10----999
        //Static variables also known as class level variables or fields.

    }
}
