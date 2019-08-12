package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Statement statement =new Statement();
        return statement.getStatement(this);
    }
    public String htmlStatement() {
        HtmlStatement htmlStatement=new HtmlStatement();
        return htmlStatement.getStatement(this);
    }



    protected int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this.rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    protected double getTotalMoneyAmount() {
        return this.rentals.stream().mapToDouble(Rental::getMoneyAmount).sum();
    }

}
