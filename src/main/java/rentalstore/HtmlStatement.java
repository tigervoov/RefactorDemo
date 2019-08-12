package rentalstore;

public class HtmlStatement extends TextStatement{


    protected String getFooter(Customer customer) {
        String result = "";
        result += "<P>You owe<EM>" + customer.getTotalMoneyAmount() + "</EM><P>\n" +
                "On this rental you earned <EM>" + customer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
        return result;
    }
    protected String getHeader(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
    protected String getBody(Customer customer) {
        String result = "";
        for (Rental each : customer.getRentals()) {
            result += each.getMovie().getTitle() + ": " + each.getMoneyAmount() + "<BR>\n";
        }
        return result;
    }
}
