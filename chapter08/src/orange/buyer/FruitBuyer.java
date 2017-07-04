package orange.buyer;

/**
 * Created by kmj on 17. 7. 4.
 */
import orange.seller.FruitSeller;


public class FruitBuyer {
    int myMoney;
    int numofApple;

    public FruitBuyer(int money)
    {
        myMoney=money;
        numofApple=0;
    }

    public void buyApple(FruitSeller seller, int money)
    {
        numofApple+=seller.saleApple(money);
        myMoney-=money;
    }
    public void showBuyResult()
    {
        System.out.println("current remainder of money: "+myMoney);
        System.out.println("number of apple: "+ numofApple);
    }
}

