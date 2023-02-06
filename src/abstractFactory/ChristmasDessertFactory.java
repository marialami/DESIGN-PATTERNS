package abstractFactory;

public class ChristmasDessertFactory implements DessertFactory{

    @Override
    public Cake createCake() {
        Cake christmasCake = new ChristmasCake();
        System.out.println("Added cake to christmas package");
        return christmasCake;
    }

    @Override
    public Cookie createCookie() {
        Cookie christmasCookie = new ChristmasCookie();
        System.out.println("Added cookie to christmas package");
        return christmasCookie;
    }

    @Override
    public Pie createPie() {
        Pie christmasPie = new ChristmasPie();
        System.out.println("Added pie to christmas package");
        return christmasPie;
    }


}
