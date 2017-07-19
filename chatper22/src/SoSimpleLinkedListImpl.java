/**
 * Created by kmj on 17. 7. 19.
 */
/*
class Box<T>
{
    public Box<T> nextBox;
    T item;

    public void store(T item) { this.item=item;}
    public T pullOut() { return item; }

}

class SoSimpleLinkedListImpl {

    public static void main(String[] args)
    {
        Box<String> boxHead = new Box<String>();
        boxHead.store("First String");

        boxHead.nextBox=new Box<String>();
        boxHead.nextBox.store("Second String");

        boxHead.nextBox=new Box<String>();
        boxHead.nextBox.nextBox.store("Third String");

        Box<String> tempRef;

        tempRef=boxHead.nextBox;
        System.out.println(tempRef.pullOut());

        tempRef=boxHead.nextBox;
        tempRef=tempRef.nextBox;
        System.out.println(tempRef.pullOut());
    }
}


*/