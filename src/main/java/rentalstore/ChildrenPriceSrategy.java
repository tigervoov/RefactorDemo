package rentalstore;

public class ChildrenPriceSrategy implements PriceStrategy{
    public double getTotalMoneyAmount(int dayRented) {
       double thisAmount = 1.5;
        if (dayRented > 3) {
            thisAmount += (dayRented - 3) * 1.5;
        }
        return thisAmount;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        return 1;
    }

}
