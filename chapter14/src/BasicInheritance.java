/**
 * Created by kmj on 17. 7. 6.
 */
class man
{
    private String name;
    public man(String name)
    {
        this.name=name;
    }
    public void tellYourName()
    {
        System.out.println("My name is "+name);
    }
}
class BusinessMan extends man{
    private String company;
    private String position;
    public BusinessMan(String name, String company, String position)
    {
        super(name);
        this.company=company;
        this.position=position;
    }
    public void tellYourInfo()
    {
        System.out.println("MY company is "+company);
        System.out.println("My position is "+position);
        tellYourName();
    }
}
public class BasicInheritance {
    public static void main(String[] args)
    {
        BusinessMan man1
                =new BusinessMan("Mr. Hong", "Hybrid 3D ELD", "Staff Eng.");
        BusinessMan man2
                =new BusinessMan("Mr. Lee", "Hybrid 3D ELD", "Assist Eng");

        System.out.println("First man info... ");
        man1.tellYourName();
        man1.tellYourInfo();

        System.out.println("Second man info... ");
        man2.tellYourInfo();
    }
}
