package FlowControl.IterativeStatements;

public class ForLoop {
    public static void main(String[] args) {
        //For Loop:
        //This is the most commonly used loop and best suitable if we know the no of iterations in advance.
        //Syntax:
        //for(initialization; condition ; increment/decrement)
        // {
        // statement(s); //body
        // }
        //Curly braces are optional and without curly braces we can take only one statement
        //which should not be declarative statement.

        //Initializationsection:
        //This section will be executed only once.
        //Here usually we can declare loop variables and we will perform initialization.
        //We can declare multiple variables but should be of the same type and we can't declare
        //different type of variables

        //Example:
        //Int i=0,j=0; valid
        //Int i=0,Boolean b=true; invalid
        //Int i=0,int j=0; invalid
        //In initialization section we can take any valid java statement including "s.o.p" also.
        //Example 1:
        //public class ExampleFor{
        //public static void main(String args[]){
        int i=0;
        for(System.out.println("hello u r sleeping");i<3;i++) {
            System.out.println("no boss, u only sleeping");
        }
        //}}
        //Output:
        //D:\Java>javac ExampleFor.java
        //D:\Java>java ExampleFor
        //Hello u r sleeping
        //No boss, u only sleeping
        //No boss, u only sleeping
        //No boss, u only sleeping

        //Conditional check:
        //We can take any java expression but should be of the type Boolean.
        //Conditional expression is optional and if we are not taking any expression compiler will
        //place true.
        //Increment and decrement section:
        //Here we can take any java statement including s.o.p also.

        //Example:
        //public class ExampleFor{
        //public static void main(String args[]){
        int i1=0;
        for(System.out.println("hello");i1<3;System.out.println("hi")) {
            i1++;
        }
        //}}
        //Output:
        //D:\Java>javac ExampleFor.java
        //D:\Java>java ExampleFor
        //Hello
        //Hi
        //Hi
        //Hi

        //All 3 parts of for loop are independent of each other and all optional.
        //Example:
        //public class ExampleFor{
        //public static void main(String args[]){
        //for(;;){
        //System.out.println("hello");
        //}}}
        //Output:
        //Hello (infinite times).
        //Curly braces are optional and without curly braces we can take exactly one statement
        //and it should not be declarative statement.

        //Unreachable statement in for loop:
        //Example 1:
        //public class ExampleFor{
        //public static void main(String args[]){
        //for(int i=0;true;i++){
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //Output:
        //Compile time error.
        //D:\Java>javac ExampleFor.java
        //ExampleFor.java:6: unreachable statement
        //System.out.println("hi");

        //Example 2:
        //public class ExampleFor{
        //public static void main(String args[]){
        //for(int i=0;false;i++){
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //Output:
        //Compile time error.
        //D:\Java>javac ExampleFor.java
        //ExampleFor.java:3: unreachable statement
        //for(int i=0;false;i++){

        //Example 3:
        //public class ExampleFor{
        //public static void main(String args[]){
        //for(int i=0;;i++){
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //Output:
        //Compile time error.
        //D:\Java>javac ExampleFor.java
        //ExampleFor.java:6: unreachable statement
        //System.out.println("hi");

        //Example 4:
        //public class ExampleFor{
        //public static void main(String args[]){
        //int a=10,b=20;
        //for(int i=0;a<b;i++){
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //Output:
        //Hello (infinite times).

        //Example 5:
        //public class ExampleFor{
        //public static void main(String args[]){
        //final int a=10,b=20;
        //for(int i=0;a<b;i++){
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}}
        //Output:
        //D:\Java>javac ExampleFor.java
        //ExampleFor.java:7: unreachable statement
        //System.out.println("hi");
    }
}
