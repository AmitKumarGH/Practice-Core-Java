package FlowControl.IterativeStatements;

public class IteratorVsIterable {
    public static void main(String[] args) {
        //Iterator Vs Iterable(1.5v)
        //syntax:
        //for(each item: target)//      iterable || array/collection
        //{
        //-------
        //}

        //- The target element in for-each loop should be Iterable object.
        //- An object is set to be iterable iff corresponding class implements
        //java.lang.Iterable interface.
        //- Iterable interface introduced in 1.5 version and it's contains only one method
        //iterator().
        //Syntax : public Iterator iterator();
        //Every array class and Collection interface already implements Iterable interface.

        //Difference between Iterable and Iterator:
        //Iterable
        //It is related to forEach loop
        //The target element in forEach loop should be Iterable
        //Iterator present in java.lang package
        //contains only one method iterator()
        //Introduced in 1.5 version

        //Iterator
        //It is related to Collection
        //We can use Iterator to get objects one by one from the collection
        //Iterator present in java.util package
        //contains 3 methods hasNext(), next(), remove()
        //Introduced in 1.2 version

    }
}
