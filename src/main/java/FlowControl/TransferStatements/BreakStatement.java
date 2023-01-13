package FlowControl.TransferStatements;

public class BreakStatement {
    public static void main(String[] args) {
        //Break statement:
        //We can use break statement in the following cases. 
        //- Inside switch to stop fall-through.
        //- Inside loops to break the loop based on some condition.
        //- Inside label blocks to break block execution based on some condition.

        //Inside switch :
        //We can use break statement inside switch to stop fall-through
        //Example 1:
        //class Test{
        //public static void main(String args[]){
        int x=0;
        switch(x)
        {
        case 0:
         System.out.println("hello");
         break ;
        case 1:
         System.out.println("hi");
        }
        //Output:
        //D:\Java>javac Test.java
        //D:\Java>java Test
        //Hello

        //Inside loops :
        //We can use break statement inside loops to break the loop based on some condition.
        //Example 2:
        //class Test{
        //public static void main(String args[]){
        for(int i=0; i<10; i++) {
        if(i==5)
         break;
         System.out.println(i);
        }
        //}}
        //Output:
        //D:\Java>javac Test.java
        //D:\Java>java Test
        //0
        //1
        //2
        //3
        //4

        //Inside Labeled block :
        //We can use break statement inside label blocks to break block execution based on some
        //condition.
        //Example:
        //class Test{
        //public static void main(String args[]){
        int x1=10;
        l1 : {
         System.out.println("begin");
         if(x1==10)
         break l1;
         System.out.println("end");
        }
        System.out.println("hello");
        //}
        //}
        //Output:
        //D:\Java>javac Test.java
        //D:\Java>java Test
        //begin
        //hello

        //These are the only places where we can use break statement. If we are using anywhere
        //else we will get compile time error.
        //Example:
        //class Test{
        //public static void main(String args[]){
        //int x=10;
        //if(x==10)
        //break;
        //System.out.println("hello");
        //}
        //}
        //Output:
        //Compile time error.
        //D:\Java>javac Test.java
        //Test.java:5: break outside switch or loop
        //break;
    }
}
