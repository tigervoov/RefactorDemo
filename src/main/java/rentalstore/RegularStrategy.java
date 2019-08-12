package rentalstore;

public class RegularStrategy implements PriceStrategy {
    @Override
    public double getTotalMoneyAmount(int dayRented) {
        double thisAmount = 2;
        if (dayRented > 2) {
            thisAmount += (dayRented - 2) * 1.5;
        }
        return thisAmount;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        return 1;
    }
}
