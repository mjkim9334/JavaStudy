/**
 * Created by kmj on 17. 7. 6.  changed

 */
class aaa
{
    public void rideMethod()
    {
        System.out.println("AAA's Method");
    }
    public void loadMethod()
    {
        System.out.println("void Method");
    }
}

class bbb extends aaa{
    public void rideMethod()
    {
        System.out.println("BBB's Method");
    }
    public void loadMethod(int num)
    {
        System.out.println("int Method");
    }
}

class ccc extends bbb{
    public void rideMethod()
    {
        System.out.println("CCC's Method");
    }
    public void loadMethod(double num)
    {
        System.out.println("double method");
    }
}
public class Override {

    public static void main(String[] args)
    {
        aaa ref1=new ccc();
        bbb ref2=new ccc();
        ccc ref3=new ccc();

        ref1.rideMethod();
        ref2.rideMethod();
        ref3.rideMethod();

        ref3.loadMethod();
        ref3.loadMethod(1);
        ref3.loadMethod(1.0);

        ref2.loadMethod();
        ref2.loadMethod(1);
        //overload is related with relationship of inheritance

    }
}
