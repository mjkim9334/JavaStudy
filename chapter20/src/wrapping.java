/**
 * Created by kmj on 17. 7. 17.
 */
/*public class wrapping {
    public static void showData(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        Integer intInst=new Integer(3);
        showData(intInst);
        showData(new Integer(7));
    }
}*/

/*class wrapping
{
    public static void main(String[] args)
    {
        Integer iValue=new Integer(10);
        Double dValue=new Double(3.14);

        System.out.println(iValue);
        System.out.println(dValue);

        iValue=new Integer(iValue.intValue()+10);
        dValue=new Double(dValue.doubleValue()+1.2);

        System.out.println(iValue);
        System.out.println(dValue);
    }
}
*/

class wrapping   // AutoBoxing
{
    public static void main(String[] args)
    {
        Integer num1=10;
        Integer num2=20;

        num1++;
        System.out.println(num1);

        num2+=3;
        System.out.println(num2);

        int addResult=num1+num2;
        System.out.println(addResult);

        int minResult=num1-num2;
        System.out.println(minResult);

    }
}