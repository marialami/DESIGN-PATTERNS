package decorator;

import java.util.List;

public class FruticaDecorator extends Dessert{

    Dessert dessertDecorate;

    public FruticaDecorator(Dessert dessertDecorate) {
        this.dessertDecorate = dessertDecorate;


    }
}
