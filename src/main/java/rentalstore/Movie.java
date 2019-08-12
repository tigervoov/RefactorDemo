package rentalstore;

public class Movie {

    private String title;
    private PriceStrategy priceStrategy;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceStrategy(priceCode);
    }

    public PriceStrategy getPriceStrategy() {
        return priceStrategy;
    }

    private void setPriceStrategy(int priceCode) {
        switch (priceCode){
            case 0:
                this.priceStrategy=new RegularStrategy();
                break;
            case 1:
                this.priceStrategy=new NewReleaseStrategy();
                break;
            case 2:
                this.priceStrategy=new ChildrenPriceSrategy();
                break;
            default:
                throw new IllegalArgumentException(String.format("No support priceCode %d",priceCode));
        }
    }

    public String getTitle() {
        return title;
    }
}
