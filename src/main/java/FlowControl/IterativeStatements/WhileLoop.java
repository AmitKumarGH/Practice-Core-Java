package FlowControl.IterativeStatements;

public class WhileLoop {
    public static void main(String[] args) {
        //While loop
        //if we don't know the no of iterations in advance then best loop is while loop:
        //Example 1:
        //while(rs.next())
        //{
        //}
        //Example 2:
        //while(e.hasMoreElements())
        //{
        //----------
        //----------
        //----------
        //}
        //Example 3:
        //while(itr.hasNext())
        //{
        //----------
        //----------
        //----------
        //}

        //The argument to the while statement should be Boolean type. If we are using any other
        //type we will get compile time error.
        //Example 1:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //while(1)
        //{
        //System.out.println("hello");
        //}}}
        //OUTPUT:
        //Compile time error.
        //D:\Java>javac ExampleWhile.java
        //ExampleWhile.java:3: incompatible types
        //found : int
        //required: boolean
        //while(1)

        //Curly braces are optional and without curly braces we can take only one statement
        //which should not be declarative statement.
        //Example 2:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //while(true)
        //System.out.println("hello");
        //}}
        //OUTPUT:
        //Hello (infinite times).

        //Example 3:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //while(true);
        //}}
        //OUTPUT:
        //No output.

        //Example 4:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //while(true)
        //int x=10;
        //}}
        //OUTPUT:
        //Compile time error.
        //D:\Java>javac ExampleWhile.java
        //ExampleWhile.java:4: '.class' expected
        //int x=10;
        //ExampleWhile.java:4: not a statement
        //int x=10;

        //Example 5:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //while(true)
        //{
        //int x=10;
        //}}}
        //OUTPUT:
        //No output.

        //Unreachable statement in while:
        //Example 6:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //while(true)
        //{
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //OUTPUT:
        //Compile time error.
        //D:\Java>javac ExampleWhile.java
        //ExampleWhile.java:7: unreachable statement
        //System.out.println("hi");

        //Example 7:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //while(false)
        //{
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //OUTPUT:
        //D:\Java>javac ExampleWhile.java
        //ExampleWhile.java:4: unreachable statement
        //{

        //Example 8:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //int a=10,b=20;
        //while(a<b)
        //{
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //OUTPUT:
        //Hello (infinite times).

        //Example 9:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //final int a=10,b=20;
        //while(a<b)
        //{
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //OUTPUT:
        //Compile time error.
        //D:\Java>javac ExampleWhile.java
        //ExampleWhile.java:8: unreachable statement
        //System.out.println("hi");

        //Example 10:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //final int a=10;
        //while(a<20)
        //{
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //OUTPUT:
        //D:\Java>javac ExampleWhile.java
        //ExampleWhile.java:8: unreachable statement
        //System.out.println("hi");

        //Note:
        //- Every final variable will be replaced with the corresponding value by compiler.
        //- If any operation involves only constants then compiler is responsible to perform
        //that operation.
        //- If any operation involves at least one variable compiler won't perform that
        //operation. At runtime jvm is responsible to perform that operation.

        //Example 11:
        //public class ExampleWhile{
        //public static void main(String args[]){
        //int a=10;
        //while(a<20)
        //{
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //OUTPUT:
        //Hello (infinite times).
    }
}
