/**
 * Created by kmj on 17. 7. 14.
 */
/*class Test {
    public static void main(String[] args)
    {
        boolean divOK=divider(4,2);
        if(divOK)
            System.out.println("Success!");
        else
            System.out.println("Failed!");

        divOK=divider(4,0);
        if(divOK)
            System.out.println("Success!");
        else
            System.out.println("Failed!");


    }

    public static boolean divider(int num1, int num2)
    {
        try
        {
            int result=num1/num2;
            System.out.println("The result of divide: "+result);
            return true;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            System.out.println("FINALLY~");
        }
    }
}
*/

import java.util.Scanner;

class AgeInputException extends Exception
{
    public AgeInputException()
    {
        super("Unvalid age!!! ");
    }
}

class NameLengthException extends Exception{
    String wrongName;
    public NameLengthException(String name)
    {
        super("Wrong Name!!!");
        wrongName=name;
    }

    public void showWrongName()
    {
        System.out.println("Wrong name: "+wrongName);
    }
}

class PersonalInfo
{
    String name;
    int age;

    public PersonalInfo(String name, int age)
    {
        this.name=name;
        this.age=age;

    }
    public void showPersonalInfo()
    {
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);

    }
}

class Test
{
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            PersonalInfo readInfo=readPersonalInfo();
            readInfo.showPersonalInfo();

        }
        catch(AgeInputException e)
        {
            e.printStackTrace();
        }
        catch(NameLengthException e)
        {
            e.showWrongName();
            e.printStackTrace();
        }
    }
    public static PersonalInfo readPersonalInfo() throws AgeInputException, NameLengthException
    {
        String name=readName();
        int age=readAge();
        PersonalInfo pInfo=new PersonalInfo(name, age);
        return pInfo;
    }

    public static String readName() throws NameLengthException
    {
        System.out.println("Put the name: " );
        String name=keyboard.nextLine();
        if(name.length()<2)
            throw new NameLengthException(name);
        return name;
    }

    public static int readAge() throws AgeInputException
    {
        System.out.println("Put the Age: ");
        int age=keyboard.nextInt();
        if(age<0)
            throw new AgeInputException();

        return age;

    }
}