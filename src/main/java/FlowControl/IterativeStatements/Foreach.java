package FlowControl.IterativeStatements;

public class Foreach {
    public static void main(String[] args) {
        //For each:(Enhanced for loop)
        //- For each Introduced in 1.5version.
        //- Best suitable to retrieve the elements of arrays and collections.
        //Example 1:
        //Write code to print the elements of single dimensional array by normal for loop and
        //enhanced for loop.
        //Example:
        //normal for loop
        int[] a3 = {10,20,30,40,50};
        for(int i=0;i<a3.length;i++){
            System.out.print(a3[i]+" ");
        }
        //enhanced for loop.
        System.out.print("\n");
        int[] a4 = {11,22,33,44,55};
        for(int x:a4){
            System.out.print(x+" ");
        }
        System.out.print("\n\n");
        //Example 2:
        //Write code to print the elements of 2 dimensional arrays by using normal for loop and
        //enhanced for loop

        //normal loop
        int[][] a5 = {{10,20,30},{40,50}};
        for(int i=0;i<a5.length;i++){
            for (int j=0;j<a5[i].length;j++) {
                System.out.print(a5[i][j] + " ");
            }
        }
        System.out.print("\n");
        //enhanced for loop.
        int[][] a6 = {{10,20,30},{40,50}};
        for(int[] x:a6){
            for (int y:x) {
                System.out.print(y + " ");
            }
        }
        //Example 3:
        //Write equivalent code by For Each loop for the following for loop.
        //public class ExampleFor{
        //public static void main(String args[]){
        for(int i=0;i<10;i++) {
            System.out.println("hello");
        }
        //}}
        // We can't write equivalent for each loop.
        // For each loop is the more convenient loop to retrieve the elements of arrays and
        //collections, but its main limitation is it is not a general purpose loop.
        // By using normal for loop we can print elements either from left to right or from
        //right to left. But using for-each loop we can always print array elements only
        //from left to right.


    }
}
