package rentalstore;

public abstract class TextStatement {
    public String getStatement(Customer customer) {
        String result = getHeader(customer);
        result += getBody(customer);
        //add footer lines
        result += getFooter(customer);
        return result;
    }
    protected abstract String getHeader(Customer customer);
    protected abstract String getBody(Customer customer);
    protected abstract String getFooter(Customer customer);
}
