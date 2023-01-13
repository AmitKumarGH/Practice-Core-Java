package LanguageFundamentals.MainMethod;

public class CommandLineArgs {
    //Command line arguments:
    //The arguments which are passing from command prompt are called command line
    //arguments.
    //The main objective of command line arguments are we can customize the behavior of
    //the main() method.
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        //Within the main() method command line arguments are available in the form of String
        //hence "+" operator acts as string concatenation but not arithmetic addition.
        //Example 3 :
        //class Test
        //{
        //public static void main(String[] args)
        //{
        //System.out.println(args[0]+args[1]);
        //}
        //}
        //Output:
        //E:\SCJP>javac Test.java
        //E:\SCJP>java Test 10 20
        //1020

        //Space is the separator between 2 command line arguments and if our command line
        //argument itself contains space then we should enclose with in double quotes.
        //Example 4 :
        //class Test
        //{
        //public static void main(String[] args)
        //{
        //System.out.println(args[0]);
        //}
        //}
        //Output:
        //E:\SCJP>javac Test.java
        //E:\SCJP>java Test "Amit Kumar"
        //Amit Kumar

    }
}
