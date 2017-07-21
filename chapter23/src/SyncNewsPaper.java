/**
 * Created by kmj on 17. 7. 21.
 */
/*
class NewsPaper
{
    String todayNews;
    boolean isTodayNews=false;

    public void setTodayNews(String news)
    {
        todayNews=news;
        isTodayNews=true;

        synchronized (this)
        {
            notifyAll();
        }
    }

    public String getTodayNews()
    {
        if(isTodayNews==false)
        {
            try
            {
                synchronized (this)
                {
                    wait();
                }
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        return todayNews;
    }
}

class NewsWriter extends Thread
{
    NewsPaper paper;

    public NewsWriter(NewsPaper paper)
    {
        this.paper=paper;
    }

    public void run()
    {
        paper.setTodayNews("HELLO");
    }
}

class NewsReader extends Thread
{
    NewsPaper paper;

    public NewsReader(NewsPaper paper)
    {
        this.paper=paper;
    }

    public void run()
    {
        System.out.println(paper.getTodayNews());
    }
}

class SyncNewsPaper {
    public static void main(String[] args)
    {
        NewsPaper paper = new NewsPaper();
        NewsReader reader1 = new NewsReader(paper);
        NewsReader reader2 = new NewsReader(paper);
        NewsWriter writer = new NewsWriter(paper);

        try
        {
            reader1.start();
            reader2.start();

            Thread.sleep(1000);
            writer.start();

            reader1.join();
            reader2.join();
            writer.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

*/