package LanguageFundamentals.Literals;
//Floating Point Literals:
//Floating point literal is by default double type but we can specify explicitly as float type
//by suffixing with f or F.
public class FloatingPointLiterals {
    public static void main(String[] args) {
        //Example:
        //float f1=123.456;//C.E:possible loss of precision(invalid)
        float f2=123.456f;//(valid)
        double d1=123.456;//(valid)
        //We can specify explicitly floating point literal as double type by suffixing with d or D.
        //Example:
        double d2=123.456D;
        //We can specify floating point literal only in decimal form and we can't specify in octal
        //and hexadecimal forms.
        //Example:
        double d3=123.456;//(valid)
        double d4=0123.456;//(valid) //it is treated as decimal value but not octal
        //double d5=0x123.456;//C.E:malformed floating point literal(invalid)
        //Which of the following floating point declarations are valid?
        //1. float f=123.456; //C.E:possible loss of precision(invalid)
        //2. float f=123.456D; //C.E:possible loss of precision(invalid)
        //3. double d=0x123.456; //C.E:malformed floating point literal(invalid)
        //4.
        double d5=0xFace; //(valid)
        //5.
        double d6=0xBeef; //(valid)
        //We can assign integral literal directly to the floating point data types and that integral
        //literal can be specified in decimal , octal and Hexa decimal form also.
        //Example:
        double d7=0xBeef;
        System.out.println(d7);//48879.0
        //But we can't assign floating point literal directly to the integral types.
        //Example:
        //int x=10.0;//C.E:possible loss of precision
        //We can specify floating point literal even in exponential form also(significant notation).
        //Example:
        double d8=10e2;//==>10*102(valid)
        System.out.println(d8);//1000.0
        //float f=10e2;//C.E:possible loss of precision(invalid)
        float f=10e2F;//(valid)
    }
}
