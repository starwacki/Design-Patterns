package builder;

public class FlightLeg {

    private final String from;
    private final String to;
    private boolean delayed;
    private double price;

    private FlightLeg(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.delayed = false;
        this.price = price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String from;
        private String to;
        private double price;

        Builder from(String from) {
            this.from = from;
            return this;
        }

        Builder to(String to) {
            this.to = to;
            return this;
        }

        Builder price(double price) {
            this.price = price;
            return  this;
        }

        FlightLeg build() {
            if (from==null || to == null || price == 0) {
                throw new IllegalArgumentException();
            }
            return new FlightLeg(from,to,price);
        }
    }
}
