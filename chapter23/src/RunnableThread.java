import javax.xml.ws.soap.Addressing;

/**
 * Created by kmj on 17. 7. 20.
 */
/*
class Sum
{
    int num;
    public Sum()
    {
        num=0;
    }
    public void addNum(int n)
    {
        num+=n;

    }
    public int getNum()
    {
        return num;
    }
}

class AdderThread extends Sum implements Runnable{
    int start, end;

    public AdderThread(int s, int e)
    {
        start=s;
        end=e;
    }
    public void run()
    {
        for(int i=start; i<=end; i++)
        {
            addNum(i);
        }
    }
}
public class RunnableThread {
    public static void main(String[] args)
    {
        AdderThread at1=new AdderThread(1, 50);
        AdderThread at2=new AdderThread(51,100);
        Thread t1=new Thread(at1);
        Thread t2=new Thread(at2);
        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(at1.getNum()+at2.getNum());
    }
}*/
