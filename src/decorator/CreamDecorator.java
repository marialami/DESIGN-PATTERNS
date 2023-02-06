package decorator;

import java.util.List;

public class CreamDecorator extends Dessert{
    Dessert dessertDecorate;

    public CreamDecorator(Dessert dessertDecorate) {
        this.dessertDecorate = dessertDecorate;
    }
}
