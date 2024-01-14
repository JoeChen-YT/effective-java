package joe.java.effective.item2.type;

public class NyPizza extends Pizza {
    public enum Size {LARGE, MEDIUM, SMALL}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        public Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        public Builder self() {
            return this;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
    }

    public String toString() {
        return "I'm NyPizza with size as " + this.size + ", and with topping as " + this.toppings.toString();
    }
    protected NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}
