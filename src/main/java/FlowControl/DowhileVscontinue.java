package FlowControl;

public class DowhileVscontinue {
    public static void main(String[] args) {
        //Do-while vs continue (The most dangerous combination):
        int x=0;
        do {
            ++x;
            System.out.println(x);
            if (++x<5)
                continue;
            ++x;
            System.out.println(x);
        }while (++x<10);
        //Output:
        //1
        //4
        //6
        //8
        //10

        //Compiler won't check unreachability in the case of if-else it will check only in loops.
        //Example 1:
        //class Test
        //{
        //public static void main(String args[]){
        //while(true)
        //{
        //System.out.println("hello");
        //}
        //System.out.println("hi");
        //}
        //}
        //Output:
        //Compile time error.
        //D:\Enum>javac Test.java
        //Test.java:8: unreachable statement
        //System.out.println("hi");

        //Example 2:
        //class Test
        //{
        //public static void main(String args[]){
        //if(true)
        //{
        //System.out.println("hello");
        //}
        //else
        //{
        //System.out.println("hi");
        //}}}
        //Output:
        //Hello
    }
}
