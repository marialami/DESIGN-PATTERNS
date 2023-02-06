package abstractFactory;

public class Main {

    public static void main(String[] args) {

        DessertFactory factory = new ValentinesDessertFactory();
        factory.createCake();
        factory.createPie();

        factory = new VeinteDeJulioDessertFactory();
        factory.createCookie();
    }
}
