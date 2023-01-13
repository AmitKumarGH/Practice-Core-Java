package LanguageFundamentals.TypesofVariables;

public class LocalVariables {
    //Local variables:
    //Sometimes to meet temporary requirements of the programmer we can declare
    //variables inside a method or block or constructors such type of variables are called local
    //variables or automatic variables or temporary variables or stack variables.
    //Local variables will be stored inside stack.
    //The local variables will be created as part of the block execution in which it is declared
    //and destroyed once that block execution completes. 'Hence' the scope of the local
    //variables is exactly same as scope of the block in which we declared.

    public static void main(String[] args) {
        //Example
        int i=0;
        //The local variables will be stored on the stack.
        //- For the local variables JVM won't provide any default values compulsory we
        //should perform initialization explicitly before using that variable.
        System.out.println("Hello");
        System.out.println(i);

        for(int j=0;j<3;j++)
        {
            i=i+j;
        }
        //System.out.println(i+"----"+j); //C.E: java: cannot find symbol
                                        //symbol:   variable j
        //Example
        try
        {
            //int i1=Integer.parseInt("ten");
        }
        catch(NullPointerException e)
        {
            //System.out.println(i1); //C.E: java: cannot find symbol
                                    //symbol:   variable i1
        }
        //Example
        int y;
        if(args.length>0)
        {
            y=10;
        }
        //System.out.println(y);//C.E:variable y might not have been initialized

        //Example
        int x1;
        if(args.length>0)
        {
            x1=10;
        }
        else
        {
            x1=20;
        }
        System.out.println(x1);
        //- It is never recommended to perform initialization for the local variables inside
        //logical blocks because there is no guarantee of executing that block always at
        //runtime.
        //- It is highly recommended to perform initialization for the local variables at the
        //time of declaration at least with default values.

        //Note: The only applicable modifier for local variables is final. If we are using any other
        //modifier we will get compile time error.

        //public int z1=10; //(invalid)
        //private int z2=10; //(invalid)
        //protected int z3=10; //(invalid) C.E: illegal start of expression
        //static int z4=10; //(invalid)
        //transient int z5=10; //(invalid)
        //final int z6=10;//(valid)

        //Conclusions:
        //1. For the static and instance variables it is not required to perform initialization
        //explicitly JVM will provide default values. But for the local variables JVM won't
        //provide any default values compulsory we should perform initialization explicitly
        //before using that variable.
        //2. For every object a separate copy of instance variable will be created whereas for
        //entire class a single copy of static variable will be created. For every Thread a
        //separate copy of local variable will be created.
        //3. Instance and static variables can be accessed by multiple Threads simultaneously
        //and hence these are not Thread safe but local variables can be accessed by only
        //one Thread at a time and hence local variables are Thread safe.
        //4. If we are not declaring any modifier explicitly then it means default modifier but
        //this rule is applicable only for static and instance variables but not local variable.

    }
}
