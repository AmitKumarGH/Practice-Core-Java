package LanguageFundamentals.Arrays;
//Array:
    //1) Introduction
    //2) Array declaration
    //3) Array construction
    //4) Array initialization
    //5) Array declaration, construction, initialization in a single line.
    //6) length Vs length() method
    //7) Anonymous arrays
    //8) Array element assignments
    //9) Array variable assignments.
//An array is an indexed collection of fixed number of homogeneous data elements.
//The main advantage of arrays is we can represent multiple values with the same name
//so that readability of the code will be improved.

//But the main disadvantage of arrays is:
//Fixed in size that is once we created an array there is no chance of increasing or
//decreasing the size based on our requirement that is to use arrays concept compulsory
//we should know the size in advance which may not possible always.
//We can resolve this problem by using collections.
public class Arrays {
    public static void main(String[] args) {
        //Array declarations:
        //Single dimensional array declaration:
        //Example:
        int[] a1;//recommended to use because name is clearly separated from the type
        int []a2;
        int a3[];
        //At the time of declaration we can't specify the size otherwise we will get compile time error.
        //Example:
        int[] a4;//valid
        //int[5] a5;//invalid

        //'Two dimensional' array declaration:
        //Example:
        int[][] b1;
        int [][]b2;
        int b3[][]; //All are valid.(6 ways)
        int[] []b4;
        int[] b5[];
        int []b6[];

        //'Three dimensional' array declaration:
        //Example:
        //int[][][] a;
        //int [][][]a;
        //int a[][][];
        //int[] [][]a;
        //int[] a[][]; All are valid.(10 ways)
        //int[] []a[];
        //int[][] []a;
        //int[][] a[];
        //int []a[][];
        //int [][]a[];
        //Note :
        //If we want to specify the dimension before the variable that rule is applicable only for
        //the 1st variable.
        //Second variable onwards we can't apply in the same declaration.
        //int[][]a,[]b;//(invalid)
        //Array construction:
        // Every array in java is an object hence we can create by using new operator.
        //Rule 1:
        //At the time of array creation compulsory we should specify the size otherwise we will
        //get compile time error
        int[] d=new int[4];
        //Rule 2:
        //It is legal to have an array with size zero in java.
        int[] e = new int[0];
        //Rule 3:
        //If we are taking array size with -ve int value then we will get runtime exception saying
        //NegativeArraySizeException.
        //Example:
        //int[] f=new int[-3];//R.E:NegativeArraySizeException
        //Rule 4:
        //The allowed data types to specify array size are byte, short, char, int. By mistake if we
        //are using any other type we will get compile time error.
        System.out.println(d.length);
        //length:
        //1) It is the final variable applicable only for arrays.
        //2) It represents the size of the array.
        System.out.println(e.length);
        //length() method:
        //1) It is a final method applicable for String objects.
        //2) It returns the no of characters present in the String.
        //Example:
        String s="bhaskar";
        //System.out.println(s.length);//C.E:cannot find symbol
        System.out.println("String Length: "+ s.length());//7
        //length variable applicable only for arrays where as length()method is applicable for
        //String objects
        d[0]=10;
        d[1]=20;
        d[2]=30;
        d[3]=40;
        //Note: if we are trying to access array element with out of range index we will get Runtime
        //Exception saying ArrayIndexOutOfBoundsException.
        //d[4]=50;//R.E:ArrayIndexOutOfBoundsException: 4
        //d[-4]=60;//R.E:ArrayIndexOutOfBoundsException: -4
        //Declaration construction and initialization of an array in a single line:
        //We can perform declaration construction and initialization of an array in a single line.

        //'Two dimensional' array creation:
        //In java multidimensional arrays are implemented as array of arrays approach but not
        //matrix form.
        //The main advantage of this approach is to improve memory utilization.
        //Example:
        int[][] g=new int[2][];
        g[0]=new int[3];
        g[1]=new int[2];
        //Array initialization: Whenever we are creating an array every element is initialized with default
        //value automatically.
        //Example:
        int[] h=new int[3];
        System.out.println(h);//[I@3e25a5
        System.out.println(h[0]);//0

        //Anonymous Arrays:
        //Sometimes we can create an array without name such type of nameless arrays are
        //called anonymous arrays.
        //The main objective of anonymous arrays is “just for instant use”.
        //We can create anonymous array as follows.
        //new int[]{10,20,30,40};//(valid)
        //new int[][]{{10,20},{30,40}};//(valid)
        //At the time of anonymous array creation we can’t specify the size otherwise we will get
        //compile time error.
        //Example:
        //new int[3]{10,20,30,40};//C.E:';' expected(invalid)
        //new int[]{10,20,30,40};//(valid)
        //Based on our programming requirement we can give the name for anonymous array
        //then it is no longer anonymous.
        //Example:
        int[] arr=new int[]{10,20,30,40};//(valid)
    }
}
