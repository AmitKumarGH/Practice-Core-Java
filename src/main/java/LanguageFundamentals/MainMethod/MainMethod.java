package LanguageFundamentals.MainMethod;

public class MainMethod {
    //Main Method
    //Whether the class contains main() method or not,
    //and whether it is properly declared or not,
    //these checking's are not responsibilities of the compiler, at runtime JVM is responsible
    //for this.
    //If JVM unable to find the required main() method then we will get runtime exception
    //saying NoSuchMethodError: main.
    //Example:
    //class Test
    //{}
    //Output:
    //javac Test.java
    //java Test R.E: NoSuchMethodError: main

    //At runtime JVM always searches for the main() method with the following prototype.
    public static void main(String[] args) {
        //public - to call by JVM from anywhere.
        // static - without existing object JVM has to call this method.
        // void - main() method won't return anything to JVM
        // main(String[] args) - commandline arguments.

        //If we are performing any changes to the above syntax then the code won't run and will
        //get Runtime exception saying NoSuchMethodError.
        //Even though above syntax is very strict but the following changes are acceptable to
        //main() method.
        //1. The order of modifiers is not important that is instead of public static we can
        //take static public.
        //2. We can declare string[] in any acceptable form
        //o String[] args
        //o String []args
        //o String args[]
        //3. Instead of args we can use any valid java identifier.
        //4. We can replace string[] with var-arg parameter.
        //Example: main(String... args)
        //5. main() method can be declared with the following modifiers.
        //final, synchronized, strictfp.
        //6. class Test {
        //7. static final syncronized strictfp public void main(String... ask){
        //8. System.out.println("valid main method");
        //9. }
        //10. }
        //11. output :
        //12. valid main method
    }

}
