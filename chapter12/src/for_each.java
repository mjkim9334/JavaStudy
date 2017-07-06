/**
 * Created by kmj on 17. 7. 5.
 */
class Number
{
    public int num;
    public Number(int num){ this.num=num;}
    public int getNum(){ return num;}
}
class for_each {
    public static void main(String[] args)
    {
        Number[] arr=new Number[] {
                new Number(2),
                new Number(4),
                new Number(8)
        };

        for(Number e : arr)
            e.num++;

        for(Number e : arr)
            System.out.print(e.getNum()+" ");

        System.out.println(" ");
        for(Number e : arr)
        {
            e=new Number(5); // changes in for_each statement will be disappeared when the flow is out of the statement.
            e.num+=2;
            System.out.print(e.getNum()+" ");

        }

        System.out.println(" ");
        for(Number e : arr)
            System.out.print(e.getNum()+" ");

    }
}
