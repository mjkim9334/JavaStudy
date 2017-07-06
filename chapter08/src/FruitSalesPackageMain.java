/**
 * Created by kmj on 17. 7. 4.
 */
import orange.buyer.FruitBuyer;
import orange.seller.FruitSeller;


public class FruitSalesPackageMain {

    public static void main(String[] args)
    {
        FruitSeller seller1 = new FruitSeller(0, 30, 1500);
        FruitSeller seller2 = new FruitSeller(0, 20, 1000);

        FruitBuyer buyer = new FruitBuyer(10000);
        buyer.buyApple(seller1, 4500);
        buyer.buyApple(seller2, 2000);

        System.out.println("seller1 status: ");
        seller1.showSaleResult();

        System.out.println("seller2 status: ");
        seller2.showSaleResult();

        System.out.println("buyer status: ");
        buyer.showBuyResult();
    }
}
