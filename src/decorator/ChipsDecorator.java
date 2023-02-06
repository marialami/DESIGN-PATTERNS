package decorator;

import java.util.List;

public class ChipsDecorator extends Dessert{

    Dessert dessertDecorate;

    public ChipsDecorator(Dessert dessertDecorate) {

        this.dessertDecorate = dessertDecorate;
    }


}
