package LanguageFundamentals.Identifiers;

//Rule 1: The only allowed characters in java identifiers are:
//        1) a to z
//        2) A to Z
//        3) 0 to 9
//        4) _
//        5) $
//        Rule 2: If we are using any other character we will get compile time error.
//        Example:
//        1) total_number-------valid
//        2) Total#------------------invalid
//        Rule 3: identifiers are not allowed to starts with digit.
//        Example:
//        1) ABC123---------valid
//        2) 123ABC---------invalid
//        Rule 4: java identifiers are case sensitive up course java language itself treated as case sensitive
//        language.
//        2
//        Example:
//class Test{
//    int number=10;
//    int Number=20;
//    int NUMBER=20; we can differentiate with case.
//    int NuMbEr=30;
//}
//Rule 5: There is no length limit for java identifiers but it is not recommended to take more than
//        15 lengths.
//        Rule 6: We can’t use reserved words as identifiers.
//        Example: int if=10; --------------invalid
//        Rule 7: All predefined java class names and interface names we use as identifiers.
//        Example 1:
//class Test
//{
//    public static void main(String[] args){
//        int String=10;
//        System.out.println(String);
//    }}
//Output:
//        10
//        Example 2:
//class Test
//{
//    public static void main(String[] args){
//        int Runnable=10;
//        System.out.println(Runnable);
//    }}
//Output:
//        10
//        Even though it is legal to use class names and interface names as identifiers but it is not a good
//        programming practice.
public class IdentifiersRules {
    public static void main(String[] args) {
        int total_number;
        int ABC123;
        int number=10;
        int Number=20;
        int NUMBER=20;
        int NuMbEr=30;
    }
}
