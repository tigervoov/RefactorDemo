package rentalstore;

public interface PriceStrategy {

    double getTotalMoneyAmount(int dayRented);
    int getFrequentRenterPoints(int dayRented);
}
