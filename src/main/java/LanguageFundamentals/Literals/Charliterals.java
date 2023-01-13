package LanguageFundamentals.Literals;

public class Charliterals {
    public static void main(String[] args) {
        //Char literals:
        //1) A char literal can be represented as single character within single quotes.
        //Example:
        //1.
        char ch1='a';//(valid)
        //2. char ch=a;//C.E:cannot find symbol(invalid)
        //3. char ch="a";//C.E:incompatible types(invalid)
        //4. char ch='ab';//C.E:unclosed character literal(invalid)
        //2) We can specify a char literal as integral literal which represents Unicode of that
        //character.
        //We can specify that integral literal either in decimal or octal or hexadecimal form but
        //allowed values range is 0 to 65535.
        //Example:
        //1.
        char ch2=97;//(valid)
        //2.
        char ch3=0xFace; //(valid)
        System.out.println(ch2); //?
        //3. char ch=65536; //C.E: possible loss of precision(invalid)
        //3) We can represent a char literal by Unicode representation which is nothing but
        //'uxxxx' (4 digit hexa-decimal number) .
        //Example:
        //1.
        char ch4='\ubeef';
        //2.
        char ch5='\u0061';
        System.out.println(ch5); //a
        //3. char ch2=\u0062; //C.E:cannot find symbol
        //4. char ch3='\iface'; //C.E:illegal escape character
        //5. Every escape character in java acts as a char literal.
        //Example:
        //1) char ch='\n'; //(valid)
        //2) char ch='\l'; //C.E:illegal escape character(invalid)
        //Escape Character
        //\n New line
        //\t Horizontal tab
        //\r Carriage return
        //\f Form feed
        //\b Backspace character
        //\' Single quote
        //\" Double quote
        //\\ Back space
    }
}
