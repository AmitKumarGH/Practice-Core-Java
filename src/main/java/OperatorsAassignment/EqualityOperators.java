package OperatorsAassignment;

public class EqualityOperators {
    public static void main(String[] args) {
        //Equality Operators : (== , !=)
        //We can apply equality operators for every primitive type including boolean type also
        System.out.println(10 == 20) ; //false
        System.out.println('a' == 'b' ); //false
        System.out.println('a' == 97.0 ); //true

        //We can apply equality operators for object types also .
        //For object references r1 and r2 , r1 == r2 returns true if and only if both r1 and
        //r2 pointing to the same object. i.e., == operator meant for reference-comparision
        //Or address-comparision.
        Thread t1=new Thread( ) ;
        Thread t2=new Thread( );
        Thread t3=t1 ;
        System.out.println(t1==t2); //false
        System.out.println(t1==t3); //true

        //To use the equality operators between object type compulsory these should be
        //some relation between argument types(child to parent , parent to child) ,
        //Otherwise we will get Compiletime error incompatible types
        Thread t=new Thread( ) ;
        Object o=new Object( );
        String s=new String("amit");
        System.out.println(t==o); //false
        System.out.println(o==s); //false
        //System.out.println(s==t); //CE : incompatible types : java.lang.String and java.lang.Thread

        //For any object reference of on r==null is always false , but null==null is always true.
        String s1= new String("amit");
        System.out.println(s1==null); //output : false
        String s2=null ;
        System.out.println(s2==null); //true
        System.out.println(null==null); //true

        //What is the difference between == operator and .equals( ) method?
        //In general we can use .equals( ) for content comparision where as
        // == operator for reference comparision
        String s3=new String("amit");
        String s4=new String("amit");
        System.out.println(s3==s4); //false
        System.out.println(s3.equals(s4)); //true
    }
}
