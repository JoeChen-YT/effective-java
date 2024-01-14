package joe.java.effective.item2.type;

import java.util.EnumSet;

public abstract class Pizza {
    public enum Topping {HAM, ONION, MASHROOM, PEPPER, SAUSAGE}
    protected final EnumSet<Topping> toppings;

    protected abstract static class Builder<T extends Builder<T>> {
        public EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        public abstract T self();
        public abstract Pizza build();
    }

    protected Pizza(Builder<?> builder) {
        this.toppings = builder.toppings;
    }
}
