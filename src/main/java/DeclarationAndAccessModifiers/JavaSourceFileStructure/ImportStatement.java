package DeclarationAndAccessModifiers.JavaSourceFileStructure;

import java.util.ArrayList;

public class ImportStatement {
    public static void main(String[] args) {
        //class Test{
        //public static void main(String args[]){
        //ArrayList l=new ArrayList();
        //}
        //}
        //Output:
        //Compile time error.
        //D:\Java>javac Test.java
        //Test.java:3: cannot find symbol
        //symbol : class ArrayList
        //location: class Test
        //ArrayList l=new ArrayList();

        // We can resolve this problem by using fully qualified name "java.util.ArrayList
        //l=new java.util.ArrayList();". But problem with using fully qualified name every
        //time is it increases length of the code and reduces readability.
        // We can resolve this problem by using import statements.
        //Example:
        //import java.util.ArrayList;
        //class Test{
        //public static void main(String args[]){
        ArrayList l=new ArrayList();
        //}
        //}
        //Output:
        //D:\Java>javac Test.java
        //Hence whenever we are using import statement it is not require to use fully qualified
        //names we can use short names directly. This approach decreases length of the code and
        //improves readability.
    }
}
