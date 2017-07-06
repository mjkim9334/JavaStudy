/**
 * Created by kmj on 17. 7. 4.
 */
class SinivelCap
{
    public void take(){System.out.println("No sinivel");}
}

class SneezeCap
{
    public void take(){System.out.println("No sneeze");}

}

class SnuffleCap
{
    public void take(){System.out.println("No snuffle");}
}


class CONTAC600
{
    SinivelCap sin;
    SneezeCap sne;
    SnuffleCap snu;

    public CONTAC600()
    {
        sin=new SinivelCap();
        sne=new SneezeCap();
        snu=new SnuffleCap();
    }

    public void take()
    {
        sin.take();
        sne.take();
        snu.take();
    }
}


class ColdPatient
{
    public void takeCONTAC600(CONTAC600 cap){
        cap.take();
    }
}
public class Encapsulation {
    public static void main(String[] args)
    {
        /*ColdPatient sufferer = new ColdPatient();
        sufferer.takeSinivelCap(new SinivelCap());
        sufferer.takeSneezeCap(new SneezeCap());
        sufferer.takeSnuffleCap(new SnuffleCap());
        */
        ColdPatient sufferer = new ColdPatient();
        sufferer.takeCONTAC600(new CONTAC600());
    }
}
