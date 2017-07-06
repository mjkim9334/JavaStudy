/**
 * Created by kmj on 17. 7. 4.
 */

class SimpleAdder
{
    private int num;
    public SimpleAdder(){num=0;}

    public SimpleAdder add(int num)
    {
        this.num+=num;
        return this;
    }
    public void ShowResult()
    {
        System.out.println("add result: "+num);
    }
}
public class SelfReference {
    public static void main(String[] args)
    {
        SimpleAdder adder=new SimpleAdder();
        adder.add(1).add(3).add(5).ShowResult();
    }
}
