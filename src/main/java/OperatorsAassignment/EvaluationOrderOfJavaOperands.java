package OperatorsAassignment;

public class EvaluationOrderOfJavaOperands {
    public static void main(String[] args) {
        //Evaluation order of java operands:
        //There is no precedence for operands before applying any operator all operands will be
        //evaluated from left to right.
        //Example:
        //class OperatorsDemo {
        //public static void main(String[] args){
        System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));
        //}
        //public static int m1(int i) {
        //System.out.println(i);
        //return i;
        //}
        //}

        //EX:2
        int i=1;
        i+=++i + i++ + ++i + i++;
        System.out.println(i); //13
        //description :
        //i=i + ++i + i++ + ++i + i++ ;
        //i=1+2+2+4+4;
        //i=13;
    }
    public static int m1(int i) {
        System.out.println(i);
        return i;
        //1 1+2*3/4*5+6
        //2 1+6/4*5+6
        //3 1+1*5+6
        //4 1+5+6
        //5 12
        //6
        //12
    }
}
