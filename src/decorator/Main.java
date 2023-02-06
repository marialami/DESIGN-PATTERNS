package decorator;

public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake();
        ChipsDecorator cakeChips = new ChipsDecorator(cake);
        CreamDecorator cakeChipsCream = new CreamDecorator(cakeChips);
        FruticaDecorator cakeChipsCreamFruitca = new FruticaDecorator(cakeChipsCream);
    }
}
