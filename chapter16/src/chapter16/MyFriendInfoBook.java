package chapter16;

import java.util.Scanner;

/**
 * Created by kmj on 17. 7. 7.
 */
class Friend
{
    String name;
    String phoneNum;
    String addr;

    public Friend(String name, String phone, String addr)
    {
        this.name=name;
        this.phoneNum=phone;
        this.addr=addr;
    }
    public void showData()
    {
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phoneNum);
        System.out.println("Address: "+addr);
    }
    public void showBasicInfo()
    {

    }
}

class HighFriend extends Friend {
    String work;
    public HighFriend(String name, String phone, String addr, String job)
    {
        super(name, phone, addr);
        work=job;
    }
    public void showData() // override
    {
        super.showData(); // super means upper class of cerrent class
        System.out.println("Job: "+work);
    }
    public void showBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: "+phoneNum);
    }
}


class UnivFriend extends Friend {
    String major;
    public UnivFriend(String name, String phone, String addr, String major)
    {
        super(name, phone, addr);
        this.major=major;
    }

    public void showData()
    {
        super.showData();
        System.out.println("Major: "+major);
    }
    public void showBasicInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phoneNum);
        System.out.println("Major: "+major);
    }
}

public class MyFriendInfoBook {

    public static void main(String[] args)
    {
        FriendInfoHandler handler = new FriendInfoHandler(10);

        while(true)
        {
            System.out.println("***Select Menu***");
            System.out.println("1. Store Infomation of Highschool Friend");
            System.out.println("2. Store Information of Univ Friend");
            System.out.println("3. Print out the information of all friends");
            System.out.println("4. Print out the Basic information");
            System.out.println("5. Finish");
            System.out.print("Choose the number: ");

            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1 :case 2 :
                    handler.addFriend(choice);
                    break;

                case 3:
                    handler.showAllData();
                    break;
                case 4:
                    handler.showAllSimpleData();
                    break;
                case 5:
                    System.out.println("Finish the program.");
                    return;
            }

        }
    }
}
