/**
 * Created by kmj on 17. 7. 10.
 */
interface PersonalNumberStorage
{
    void addPersonalInfo(String name, String perNum);
    String searchName(String perNum);
}

class PersonalNumInfo
{
    String name;
    String number;

    PersonalNumInfo(String name, String number)
    {
        this.name=name;
        this.number=number;
    }

    String getName(){return name;}
    String getNumber(){return number;}
}

class PersonalNumberStorageImpl implements PersonalNumberStorage {
    PersonalNumInfo[] perArr;
    int numOfPerInfo;

    PersonalNumberStorageImpl(int sz) {
        perArr = new PersonalNumInfo[sz];
        numOfPerInfo = 0;
    }

    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
        numOfPerInfo++;
    }

    public String searchName(String perNum) {
        for (int i = 0; i < numOfPerInfo; i++) {
            if (perNum.compareTo(perArr[i].getNumber()) == 0) {
                return perArr[i].getName();
            }

        }
        return null;
    }
}

    class AbstractInterface
    {
        public static void main(String[] args)
        {
            PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
            storage.addPersonalInfo("KMJ", "123-123");
            storage.addPersonalInfo("MHH", "156-564");

            System.out.println(storage.searchName("123-123"));
            System.out.println(storage.searchName("156-564"));
        }
    }




