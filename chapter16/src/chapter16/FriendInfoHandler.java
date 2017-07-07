package chapter16;

import java.util.Scanner;

/**
 * Created by kmj on 17. 7. 7.
 */
public class FriendInfoHandler { // Control the flow of the code=handler class
    private Friend[] myFriends;
    private int numOfFriends;

    public FriendInfoHandler(int num)
    {
        myFriends=new Friend[num];
        numOfFriends=0;
    }

    private void addFriendInfo(Friend fren)
    {
        myFriends[numOfFriends++]=fren;
    }

    public void addFriend(int choice)
    {
        String name, phoneNumber, addr, job, major;

        Scanner sc=new Scanner(System.in);
        System.out.print("Name: "); name=sc.nextLine();
        System.out.print("Phone: "); phoneNumber=sc.nextLine();
        System.out.print("Address: "); addr=sc.nextLine();

        if(choice==1)
        {
            System.out.print("Job: "); job=sc.nextLine();
            addFriendInfo(new HighFriend(name, phoneNumber, addr, job));
        }
        else
        {
            System.out.print("Major: "); major=sc.nextLine();
            addFriendInfo(new UnivFriend(name, phoneNumber, addr, major));
        }
        System.out.println("Complete!\n");

    }

    public void showAllData()
    {
        for(int i=0; i<numOfFriends; i++)
        {
            myFriends[i].showData();
            System.out.println(" ");
        }

    }

    public void showAllSimpleData()
    {
        for(int i=0; i<numOfFriends; i++)
        {
            myFriends[i].showBasicInfo();
            System.out.println(" ");
        }
    }
}
