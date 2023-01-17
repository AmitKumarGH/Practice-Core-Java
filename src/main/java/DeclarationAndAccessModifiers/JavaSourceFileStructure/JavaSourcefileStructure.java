package DeclarationAndAccessModifiers.JavaSourceFileStructure;

public class JavaSourcefileStructure {
    public static void main(String[] args) {
        //Java source file structure:
        //- A java Program can contain any no. Of classes but at most one class can be
        //declared as public. "If there is a public class the name of the Program and name
        //of the public class must be matched otherwise we will get compile time error".
        //- If there is no public class then any name we gives for java source file.

        //Case 1:
        //If there is no public class then we can use any name for java source file there are no
        //restrictions.
        //Example:
        //A.java
        //B.java
        //C.java
        //Amit.java

        //case 2:
        //If class B declared as public then the name of the Program should be B.java otherwise
        //we will get compile time error saying "class B is public, should be declared in a file
        //named B.java".

        //Case 3:
        //- If both B and C classes are declared as public and name of the file is B.java then
        //we will get compile time error saying "class C is public, should be declared in a
        //file named C.java".
        //- It is highly recommended to take only one class for source file and name of the
        //Program (file) must be same as class name. This approach improves readability
        //and understandability of the code.
        //Example:
        //class A
        //{
        //public static void main(String args[]){
        //System.out.println("A class main method is executed");
        //}
        //}
        //class B
        //{
        //public static void main(String args[]){
        //System.out.println("B class main method is executed");
        //}
        //}
        //class C
        //{
        //public static void main(String args[]){
        //System.out.println("C class main method is executed");
        //}
        //}
        //class D
        //{
        //}

        //Output:
        //javac amit.java
        //D:\Java>java A
        //A class main method is executed
        //D:\Java>java B
        //B class main method is executed
        //D:\Java>java C
        //C class main method is executed
        //D:\Java>java D
        //Exception in thread "main" java.lang.NoSuchMethodError: main
        //D:\Java>java Amit
        //Exception in thread "main" java.lang.NoClassDefFoundError: Amit

        //- We can compile a java Program but not java class in that Program for every
        //class one dot class file will be created.
        //- We can run a java class but not java source file whenever we are trying to run a
        //class the corresponding class main method will be executed.
        //- If the class won't contain main method then we will get runtime exception saying
        //"NoSuchMethodError: main".
        //- If we are trying to execute a java class and if the corresponding .class file is not
        //available then we will get runtime execution saying "NoClassDefFoundError:Amit".
    }
}
