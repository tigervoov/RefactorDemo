package rentalstore;

public class Statement extends TextStatement{
    public String getStatement(Customer customer) {
        String result=getHeader(customer);
        result += getBody(customer);
        //add footer lines
        result += getFooter(customer);
        return result;
    }

    protected String getHeader(Customer customer) {
        return  "Rental Record for " + customer.getName() + "\n";
    }

    protected String getBody(Customer customer) {
        String result="";
        for (Rental each : customer.getRentals()) {
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getMoneyAmount() + "\n";
        }
        return result;
    }

    protected String getFooter(Customer customer) {
        String result = "Amount owed is " + customer.getTotalMoneyAmount() + "\n"+
                "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }
}
