/**
 * Created by kmj on 17. 7. 19.
 */
import java.util.Iterator;
import java.util.LinkedList;

class IteratorUsage {
    public static void main(String[ ] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        Iterator<String> itr=list.iterator();

        System.out.println("****");
        while(itr.hasNext())
        {
            String curStr=itr.next();
            System.out.println(curStr);
            if(curStr.compareTo("Third")==0)
            {
                itr.remove();
            }
        }

        itr=list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
