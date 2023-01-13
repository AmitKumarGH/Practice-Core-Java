package FlowControl.SelectionStatements;

public class ifAndelse {
    public static void main(String[] args) {
        //The argument to the if statement should be Boolean by mistake if we are providing any
        //other type we will get "compile time error".
        //Example 1:
        //public class ExampleIf{
        //public static void main(String args[]){
        //        int x=0;
        //        if(x)//CE
        //        {
        //        System.out.println("hello");
        //        }else{
        //        System.out.println("hi");
        //}}}
        //OUTPUT:
        //Compile time error:
        //D:\Java>javac ExampleIf.java
        //ExampleIf.java:4: incompatible types
        //found : int
        //required: boolean
        //if(x)

        //Example 2:
        //public class ExampleIf{
        //public static void main(String args[]){
        //        int x=10;
        //        if(x=20)//CE
        //        {
        //        System.out.println("hello");
        //        }
        //        else{
        //        System.out.println("hi");
        //}}}
        //OUTPUT:
        //Compile time error
        //D:\Java>javac ExampleIf.java
        //ExampleIf.java:4: incompatible types
        //found : int
        //required: boolean
        //if(x=20)

        //Example 3:
        //public class ExampleIf{
        //public static void main(String args[]){
        int x=10;
        if(x==20)
        {
        System.out.println("hello");
        }else {
            System.out.println("hi");
        }
        //}}
        //OUTPUT:
        //Hi

        //Example 4:
        //public class ExampleIf{
        //public static void main(String args[]){
        boolean b=false;
        if(b=true)
        {
        System.out.println("hello");
        }else {
            System.out.println("hi");
        }
        //}}
        //OUTPUT:
        //Hello

        //Example 5:
        //public class ExampleIf{
        //public static void main(String args[]){
        boolean b1=false;
        if(b1==true)
        {
        System.out.println("hello");
        }else {
            System.out.println("hi");
        }
        //}}
        //OUTPUT:
        //Hi

        //Both else part and curly braces are optional.
        //Without curly braces we can take only one statement under if, but it should not be
        //declarative statement.
        //Example 6:
        //public class ExampleIf{
        //public static void main(String args[]){
        if(true)
        System.out.println("hello");
        //}}
        //OUTPUT:
        //Hello

        //Example 7:
        //public class ExampleIf{
        //public static void main(String args[]){
        //if(true);
        //}}
        //OUTPUT:
        //No output

        //Example 8:
        //public class ExampleIf{
        //public static void main(String args[]){
        //if(true)
        //int x=10;
        //}}
        //OUTPUT:
        //Compile time error
        //D:\Java>javac ExampleIf.java
        //ExampleIf.java:4: '.class' expected
        //int x=10;
        //ExampleIf.java:4: not a statement
        //int x=10;

        //Example 9:
        //public class ExampleIf{
        //public static void main(String args[]){
        //if(true){
        //int x=10;
        //}}}
        //OUTPUT:
        //D:\Java>javac ExampleIf.java
        //D:\Java>java ExampleIf

        //Example 10:
        if(true)
        System.out.println("hello");// dependent statement on id
        System.out.println("hi");//this is in dependent statement on if
        //Semicolon(;) is a valid java statement which is call empty statement and it won't
        //produce any output.

    }
}
