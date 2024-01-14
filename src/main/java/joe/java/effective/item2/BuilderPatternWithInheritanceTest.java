package joe.java.effective.item2;

import joe.java.effective.item2.type.NyPizza;

import static joe.java.effective.item2.type.NyPizza.Size.SMALL;
import static joe.java.effective.item2.type.Pizza.Topping.HAM;
import static joe.java.effective.item2.type.Pizza.Topping.MASHROOM;

public class BuilderPatternWithInheritanceTest {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(HAM).addTopping(MASHROOM).build();
        System.out.println(nyPizza);
    }
}
