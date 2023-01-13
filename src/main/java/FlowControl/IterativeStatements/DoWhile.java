package FlowControl.IterativeStatements;

public class DoWhile {
    public static void main(String[] args) {
        //Do-while:
        //If we want to execute loop body at least once then we should go for do-while.
        //do
        //{
        //.....
        //}while(b);//semicolon in mandatory
        //Curly braces are optional.
        //Without curly braces we can take only one statement between do and while and it
        //should not be declarative statement.

        //Example 1:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do
        //System.out.println("hello");
        //while(true);
        //}}
        //Output:
        //Hello (infinite times).

        //Example 2:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do;
        //while(true);
        //}}
        //Output:
        //Compile successful.

        //Example 3:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do
        //int x=10;
        //while(true);
        //}}
        //Output:
        //D:\Java>javac ExampleDoWhile.java
        //ExampleDoWhile.java:4: '.class' expected
        //int x=10;
        //ExampleDoWhile.java:4: not a statement
        //int x=10;
        //ExampleDoWhile.java:4: ')' expected
        //int x=10;

        //Example 4:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do
        //{
        //int x=10;
        //}while(true);
        //}}
        //Output:
        //Compile successful.

        //Example 5:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do while(true)
        //System.out.println("hello");
        //while(true);
        //}}
        //Output:
        //Hello (infinite times).

        //Rearrange the above Example:

        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do
        // while(true)
        // System.out.println("hello");
        //while(true);
        //}}
        //Output:
        //Hello (infinite times).

        //Example 6:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do
        //while(true);
        //}}
        //Output:
        //Compile time error.
        //D:\Java>javac ExampleDoWhile.java
        //ExampleDoWhile.java:4: while expected
        //while(true);
        //ExampleDoWhile.java:5: illegal start of expression
        //}

        //Unreachable statement in do while:

        //Example 7:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //do
        //{
        //System.out.println("hello");
        //}
        //while(true);
        //System.out.println("hi");
        //}}
        //Output:
        //Compile time error.
        //D:\Java>javac ExampleDoWhile.java
        //ExampleDoWhile.java:8: unreachable statement
        //System.out.println("hi");

        //Example 8:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        do
        {
        System.out.println("hello");
        }
        while(false);
        System.out.println("hi");
        //}}
        //Output:
        //Hello
        //Hi

        //Example 9:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //int a=10,b=20;
        //do
        //{
        //System.out.println("hello");
        //}
        //while(a<b);
        //System.out.println("hi");
        //}}
        //Output:
        //Hello (infinite times).

        //Example 10:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        int a=10,b=20;
        do
        {
        System.out.println("hello");
        }
        while(a>b);
        System.out.println("hi");
        //}}
        //Output:
        //Hello
        //Hi

        //Example 11:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        //final int a=10,b=20;
        //do
        //{
        //System.out.println("hello");
        //}
        //while(a<b);
        //System.out.println("hi");
        //}}
        //Output:
        //Compile time error.
        //D:\Java>javac ExampleDoWhile.java
        //ExampleDoWhile.java:9: unreachable statement
        //System.out.println("hi");

        //Example 12:
        //public class ExampleDoWhile{
        //public static void main(String args[]){
        final int aa=10,bb=20;
        do
        {
        System.out.println("hello");
        }
        while(aa>bb);
        System.out.println("hi");
        //}}
        //Output:
        //D:\Java>javac ExampleDoWhile.java
        //D:\Java>java ExampleDoWhile
        //Hello
        //Hi
    }
}
