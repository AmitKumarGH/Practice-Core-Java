package LanguageFundamentals.TypesofVariables;
//Types of Variables
//Based the type of value represented by the variable all variables are divided into 2 types.
// They are:
//1) Primitive variables
//2) Reference variables
//Primitive variables: Primitive variables can be used to represent primitive values.
//Example: int x=10;
//Reference variables: Reference variables can be used to refer objects.
//Example: Student s=new Student();
//Based on the purpose and position of declaration all variables are divided into the
//following 3 types.
//1) Instance variables
//2) Static variables
//3) Local variables
public class TypesofVariables {
    int i = 10;
    static int j = 20;
    public static void main(String[] args) {

        //System.out.println(i);//C.E:non-static variable i cannot be referenced from a static context(invalid)
        TypesofVariables t=new TypesofVariables();
        System.out.println(t.i);//(valid)
        //For the instance variables it is not required to perform initialization JVM will always
        //provide default values
        System.out.println(t.j);
        //For the static variables it is not required to perform initialization explicitly, JVM will
        //always provide default values.
        System.out.println(TypesofVariables.j);
        System.out.println(j);
        t.methodOne();

    }
    public void methodOne()
    {
        System.out.println(i);//10(valid)
    }
}
