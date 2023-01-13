package LanguageFundamentals.Arrays.UNinitializedArrays;

public class UnInitializedArrays {
    int[] a;
    int[] b=new int[3];//instance reference
    static int x = 20;//static-primitive
    static int[] c;
    static int[] d=new int[3];

    public static void main(String[] args) {
        String s = "xyz";//local-reference
        UnInitializedArrays obj = new UnInitializedArrays();
        //Instance level:
        //Example 1:

        System.out.println(obj.a);//null
        //System.out.println(obj.a[0]);//R.E:NullPointerException
        //Example 2:

        System.out.println(obj.b);//[I@3e25a5
        System.out.println(obj.b[0]);//0
        //Static level:
        //Example 1:

        System.out.println(c);//null
        //System.out.println(c[0]);//R.E:NullPointerException
        //Example 2:

        System.out.println(d);//[I@3e25a5
        System.out.println(d[0]);//0
        //Local level:
        //Example 1:
        int[] e = new int[0];
        //System.out.println(e); //C.E: variable e might not have been initialized
        System.out.println(e[0]);
        //Example 2:
        int[] f=new int[3];
        System.out.println(f);//[I@3e25a5

        //Once we created an array every element is always initialized with default values
        //irrespective of whether it is static or instance or local array.
        //Every variable in java should be either instance or static or local.
        //Every variable in java should be either primitive or reference
        //Hence the following are the various possible combinations for variables.
    }
}
