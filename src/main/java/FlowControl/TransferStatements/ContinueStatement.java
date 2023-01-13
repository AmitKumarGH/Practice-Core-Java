package FlowControl.TransferStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        //We can use continue statement to skip current iteration and continue for the next
        //iteration.
        //Example:
        int x = 2;
        for(int i=0; i<10; i++) {
            if(i%x==0)
                continue;
            System.out.println(i);
        }

        //We can use continue only inside loops if we are using anywhere else we will get compile
        //time error saying "continue outside of loop".
        //Example:
        //class Test
        //{
        //public static void main(String args[]){
        //int x=10;
        //if(x==10);
        //continue;
        //System.out.println("hello");
        //}
        //}
        //Output:
        //Compile time error.
        //D:\Enum>javac Test.java
        //Test.java:6: continue outside of loop
        //continue;

        //Labeled break and continue statements:
        //In the nested loops to break (or) continue a particular loop we should go for labeled
        //break and continue statements.
        //Example:
        //class Test
        //{
        //public static void main(String args[]){
        l1:
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++)
         {
         if(i==j)
         break;
         System.out.println(i+"........."+j);
         }

        }
        //}
        //}
        //Break:
        //1.........0
        //2.........0
        //2.........1
        //Break l1:
        //No output.
        //Continue:
        //0.........1
        //0.........2
        //1.........0
        //1.........2
        //2.........0
        //2.........1
        //Continue l1:
        //1.........0
        //2.........0
        //2.........1
    }
}
