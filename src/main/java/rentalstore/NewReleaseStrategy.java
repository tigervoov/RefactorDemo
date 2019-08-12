package rentalstore;

public class NewReleaseStrategy implements PriceStrategy {

    @Override
    public double getTotalMoneyAmount(int dayRented) {
        return dayRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int dayRented) {
        return dayRented > 1 ? 2 : 1;
    }
}
