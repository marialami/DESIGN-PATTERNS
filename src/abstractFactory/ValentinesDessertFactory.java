package abstractFactory;

public class ValentinesDessertFactory implements DessertFactory{

    @Override
    public Cake createCake() {
        Cake valentinesCake = new ValentinesCake();
        System.out.println("Added cake to valentines package");
        return valentinesCake;
    }

    @Override
    public Cookie createCookie() {
        Cookie valentinesCookie = new ValentinesCookie();
        System.out.println("Added cookie to valentines package");
        return valentinesCookie;
    }

    @Override
    public Pie createPie() {
        Pie valentinesPie = new ValentinesPie();
        System.out.println("Added pie to valentines package");
        return valentinesPie;
    }
}
