package LanguageFundamentals.JavaCodingStandards;

public class JavaCodingStandards {
    //Java coding standards
    //- Whenever we are writing java code , It is highly recommended to follow coding
    //standards , which improves the readability and understandability of the code.
    //- Whenever we are writing any component(i.e., class or method or variable) the
    //name of the component should reflect the purpose or functionality.
    //Ameerpet Standards
    //class A
    //{
    //public int methodOne(int x, int y)
    //{
    //return x+y;
    //}
    //}

    //Hitech-city standards
    //package com.aksoft.jpdemo;
    //clas Calc
    //{
    //public static int add(int number1, int number2)
    //{
    //return number1 + number2;
    //}
    //}

    //Coding standards for classes:
    //- Usually class names are nouns.
    //- Should starts with uppercase letter and if it contains multiple words every inner
    //word should starts with upper case letter
    //Example:
    //String, Customer, Object, Student, StringBuffer -> nouns

    //Coding standards for interfaces:
    //- Usually interface names are adjectives.
    //- Should starts with upper case letter and if it contains multiple words every inner
    //word should starts with upper case letter.
    //Example:
    //1. Serializable
    //2. Runnable
    //3. Cloneable
    //these are adjectives

    //Coding standards for methods:
    //- Usually method names are either verbs or verb-noun combination.
    //- Should starts with lowercase character and if it contains multiple words every
    //inner word should starts with upper case letter.(camel case convention)
    //Example: verb
    //run()
    //sleep()
    //eat()
    //drink()
    //Example: noun
    //getName()
    //getSalary()

    //Coding standards for variables:
    //- Usually variable names are nouns.
    //- Should starts with lowercase alphabet symbol and if it contains multiple words
    //every inner word should starts with upper case character.(camel case convention)
    //Example:
    //length
    //name
    //salary nouns
    //age
    //mobileNumber

    //Coding standards for constants:
    //- Usually constants are nouns.
    //- Should contain only uppercase characters and if it contains multiple words then
    //these words are separated with underscore symbol.
    //- Usually we can declare constants by using public static final modifiers.
    //Example:
    //MAX_VALUE
    //MIN_VALUE nouns
    //NORM_PRIORITY

    //Java bean coding standards:
    //A java bean is a simple java class with private properties and public getter and setter
    //methods.
    //Syntax for setter method:
    //1. Method name should be prefixed with set.
    //2. It should be public.
    //3. Return type should be void.
    //4. Compulsory it should take some argument.
    //Syntax for getter method:
    //1. The method name should be prefixed with get.
    //2. It should be public.
    //3. Return type should not be void.
    //4. It is always no argument method.
    //Note: For the boolean properties the getter method can be prefixed with either 'get' or 'is'.
    //But recommended to use 'is'.

    //Example
    //private boolean empty;
    //public boolean getEmpty()//or private boolean isEmpty()
    //{
    //   return empty();
    //}
}
