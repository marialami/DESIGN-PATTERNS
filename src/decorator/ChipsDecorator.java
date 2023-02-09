package decorator;

import java.util.List;

public class ChipsDecorator extends Dessert{

    Dessert dessertDecorate;

    public ChipsDecorator(Dessert dessertDecorate) {

         this.dessertDecorate = dessertDecorate;
        System.out.printf("Se añadieron las chispas \n");
    }


}
